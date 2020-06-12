package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods{


@Given("user navigates to EmployeeList page")
public void user_navigates_to_EmployeeList_page() {
    WaitandClick(dashboard.pim);
    WaitandClick(dashboard.empListPage);
    
}

@When("user enters valid employee id {string}")
public void user_enters_valid_employee_ID(String empId) {
	sleep(2);
	sendText(empList.EmpID, empId);
	//empList.EmpID.sendKeys(Keys.ENTER);
	sleep(2);
}

@When("user clicks on the search button")
public void user_clicks_on_the_search_button() {
	//jsClick(empList.searchBtn);
    WaitandClick(empList.searchBtn);
    sleep(3);
}

@Then("user see employee id {string} is displayed")
public void user_see_employee_information_is_displayed(String ID) {
	String actualEmpID=ID;
	String expectedEmpId=empList.empIDValidation.getText();
	Assert.assertEquals("Employee IDs do not Match", actualEmpID, expectedEmpId);
	sleep(3);
}

@When("user enters valid employee name {string}")
public void user_enters_valid_employee_name1(String empName) {
	sleep(2);
	sendText(empList.EmpName, empName);
	empList.EmpName.sendKeys(Keys.ENTER);
	sleep(3);
}


@Then("user see employee name {string} is displayed")
public void user_see_employee_information_is_displayed1(String empName) {
	String actualEmpName=empName;
	String expectedEmpName=empList.empNameValidation.getText();
	Assert.assertEquals("Employee names do not Match", actualEmpName, expectedEmpName);
	sleep(3);
}

}
