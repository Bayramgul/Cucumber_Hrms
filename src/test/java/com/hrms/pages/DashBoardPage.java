package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class DashBoardPage extends com.hrms.utils.CommonMethods {

		@FindBy(id="welcome")
		public WebElement welcome;
		
		@FindBy(id="menu_pim_viewPimModule")
		public WebElement pim;
		
		
		@FindBy(id="menu_pim_viewEmployeeList")
		public WebElement empListPage;
		
		@FindBy(id="menu_pim_addEmployee")
		public WebElement addEmp;
		
		@FindBy(xpath="//span[text()='Assign Leave']")
		public WebElement assignLeave;
		
		
		@FindBy(xpath="//span[text()='Leave List']")
		public WebElement leaveList;
		
		@FindBy(xpath="//span[text()='Timesheets']")
		public WebElement Timesheets;
		
		@FindBy(linkText="Admin")
		public WebElement Admin;
		
		public DashBoardPage(){
			PageFactory.initElements(BaseClass.driver, this);	
		}
		public void navigateToAddEmp () {
			jsClick(pim);
			jsClick(addEmp);
		}

		@FindBy(xpath="//div[@class='menu']/ul/li")
		public List<WebElement> dashMenu;
		
		
	public void selectHeaderlink(String header) {//Admin ,PIM,Leave,Time,Recruitment,Performance,Dashboard,Directory
	List<WebElement> headerLinks=driver.findElements(By.xpath("//div[@class='menu']/ul/li"));
	for(WebElement link:headerLinks) {
		String text=link.getText();
		if(text.equals(header)) {
			WaitandClick(link);
			
		} 
	}
	}
}
