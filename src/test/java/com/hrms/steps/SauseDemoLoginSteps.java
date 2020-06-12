package com.hrms.steps;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauseDemoLoginSteps extends CommonMethods {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Navigate to login page");
	}

	@When("user enters invalid username {string}")
	public void user_enters_invalid_username(String userName) {
		sendText(demosauce.userName,"userName" );
	}

	@When("user enter invalid password {string}")
	public void user_enter_invalid_password(String password) {
		sendText(demosauce.password, password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		WaitandClick(demosauce.LoginBTN);
	}

	@Then("user should see the error message {string}")
	public void user_should_see_the_error_message(String errorMessage) {
	   String expected=demosauce.errorMEssage.getText();
	   String actual=errorMessage;
	   Assert.assertEquals(expected, actual);
	}
	@When("user enters valid {string} and {string} and clicks loginBtn")
	public void user_enters_valid_and(String UserName, String password) {
		sendText(demosauce.userName,UserName);
		sendText(demosauce.password, password);
		WaitandClick(demosauce.LoginBTN);
		
	}
	@Then("do the validation for the login functionality {string}")
	public void do_the_validation_for_the_login_functionality(String product) {
		String expected= demosauce.productLogo.getText();
		String actual=product;
		Assert.assertEquals(expected, actual);
	}


}
