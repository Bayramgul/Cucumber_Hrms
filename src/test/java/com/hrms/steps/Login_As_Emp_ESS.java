package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_As_Emp_ESS extends CommonMethods {

	@When("user logins with valid admin credentials")
	public void user_logins_with_valid_admin_credentials() {
		login.login();
	}

	@Then("User sees Welcome Admin text on top right corner")
	public void admin_sees_Welcome_Admin_text_on_top_right_corner() {
		String expectedText = dashboard.welcome.getText();
		String actualText = "Welcome Admin";
		Assert.assertEquals(expectedText, actualText);
		//takesScreenshot("WelcomeAdmin");
	}

	@When("user enters valid ESS username")
	public void user_enters_valid_ESS_username() {
		sendText(login.username, "Gul123");
	}

	@When("user enters valid ESS password")
	public void user_enters_valid_ESS_password() {
		sendText(login.password, "Syntax123.");

	}

	@Then("User sees Welcome ESS username text on top right corner")
	public void user_sees_Welcome_ESS_username_text_on_top_right_corner() {
		String expectedText = dashboard.welcome.getText();
		String actualText = "Welcome Bayramgul";
		Assert.assertEquals(expectedText, actualText);
		//takesScreenshot("Welcome_ESS");
		
	}
	@When("user enter valid {string} and {string}")
	public void user_enter_valid_and_Hum_nhrm123(String Username,String Password) {
		sendText(login.username, Username);
		sendText(login.password,Password );
	}
	
	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String FirstName) {
		String expectedText = dashboard.welcome.getText();
		String actualText = "Welcome "+ FirstName;
		Assert.assertEquals(expectedText, actualText); 

	}

}
