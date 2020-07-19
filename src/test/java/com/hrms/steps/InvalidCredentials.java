package com.hrms.steps;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.When;

public class InvalidCredentials extends CommonMethods {
//	@When("I enter invalid {string} and {string} and see {string}")
//	public void i_enter_invalid_and_and_see(String userName, String password, String ErrorMessage) {
//		sendText(login.username, userName);
//		sendText(login.password, password);
//		WaitandClick(login.loginBTN);
//		String actual=login.errorMessage.getText();
//		String expected=ErrorMessage;
//		assertEquals(actual, expected);
//	}
	
	@When("I entered invalid string and string and see string")
	public void i_entered_invalid_and_and_see(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String,String>> data=dataTable.asMaps();
	    for(Map<String,String> d:data) {
	    	sendText(login.username, d.get("UserName"));
			sendText(login.password, d.get("Password"));
			WaitandClick(login.loginBTN);
			String actual=login.errorMessage.getText();
			String expected=d.get("ErrorMessage");
			assertEquals(actual, expected);
	    
	    }
	}
}