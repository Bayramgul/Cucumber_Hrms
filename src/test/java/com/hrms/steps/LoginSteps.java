package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	@When("user enters valid username")
	public void user_enters_valid_username() {
		sendText(login.username, ConfigsReader.getProperty("username"));
	}

	@When("user enters invalid password")
	public void user_enters_invalid_password() {
		sendText(login.password, "ansjsbjaks");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		WaitandClick(login.loginBTN);
	}

	@Then("user see “Invalid credentials” error message")
	public void user_see_Invalid_credentials_error_message() {
		String expectedErrorMsg = login.errorMessage.getText();
		String actualErrorMsg = "Invalid credentials";

		Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
		takesScreenshot("InvalidCredentials");
	}

	@When("user enters empty password")
	public void user_enters_empty_password() {
		sendText(login.password, "");
	}

	@Then("user see “Password can not be empty” error message")
	public void user_see_Password_can_not_be_empty_error_message() {
		String expectedErrorMsg = login.errorMessage.getText();
		String actualErrorMsg = "Password can not be empty";
		takesScreenshot("EmptypasswordMSG");
		Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
		
	}

	@When("user enters empty username")
	public void user_enters_empty_username() {
		sendText(login.username, "");

	}

	@When("valid password")
	public void valid_password() {
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@Then("user see “Username can not be empty” error message")
	public void user_see_Username_can_not_be_empty_error_message() {
		String expectedErrorMsg = login.errorMessage.getText();
		String actualErrorMsg = "Username cannot be empty";
		Assert.assertEquals(expectedErrorMsg, actualErrorMsg);
		takesScreenshot("EmptyUsernameErrorMsg");
	}

}
