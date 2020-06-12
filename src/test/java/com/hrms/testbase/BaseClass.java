package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	

	public static WebDriver setUp() {// we changed the return type to WebDriver
		
		// System.setProperty(C, value)
		// to have all must steps for reading a configs file, FileInputStream,
		// Properties and prop.(load)
		ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
		switch (ConfigsReader.getProperty("browser")) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.chromedriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			throw new RuntimeException("Browser is not supported");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		driver.get(ConfigsReader.getProperty("url"));
		PageInitializer.initialize();// we have to call the initialize method to initialize pages
		return driver;
	}

	
	public static void tearDown() {

		if (driver != null) {
			driver.quit();
		}
	}

	public static void sleep(long millis) {
		try {

			Thread.sleep(millis * 1000);
		} catch (InterruptedException ie) {
			System.out.println(ie);
		}
	}

}
