package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployee extends CommonMethods {

	@Given("user navigates to AddEmployeePage")
	public void user_navigates_to_AddEmployeePage() {
		dashboard.navigateToAddEmp();
	}

	@When("user enters employees {string} and {string}")
	public void user_enters_employees_first_name_and_last_name(String firstName, String lastName) {

		sendText(addEmp.firstName, firstName);
		sendText(addEmp.lastName, lastName);
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		WaitandClick(addEmp.btnSave);
	}

	@Then("{string} is added successfully")
	public void employee_is_added_successfully(String string) {
		String  expected= pdetails.profilePic.getText();
		String actual = string;
		Assert.assertEquals(expected, actual);
		//takesScreenshot("AddEmployee");
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		addEmp.empId.clear();
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		WaitandClick(addEmp.checkLogn);

	}

	@When("user enters  login credentials")
	public void user_enters_login_credentials() {
		addEmp.createEmpLoginCR();

	}

	@When("user enters employee {string},{string} and {string}")
	public void user_enters_employee_(String firstName, String MiddleName, String lastName) {

		sendText(addEmp.firstName, firstName);
		sleep(2);
		sendText(addEmp.middleName, MiddleName);
		sendText(addEmp.lastName, lastName);
	}

	@Then("{string},{string} and {string} is added successfully")
	public void and_is_added_successfully(String string, String string2, String string3) {
		System.out.println("I added the employee");
	}

	@When("user enters employee details and click on save then employee is added")
	public void AddEmpDataTable(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> addEmployeeList = dataTable.asMaps();
		for (Map<String, String> emp : addEmployeeList) {
			sendText(addEmp.firstName, emp.get("FirstName"));
			sendText(addEmp.middleName, emp.get("MiddleName"));
			sendText(addEmp.lastName, emp.get("LastName"));
			WaitandClick(addEmp.btnSave);
			// adding assertion

			String actual = pdetails.profilePic.getText();
			String expected = emp.get("FirstName") + " " + emp.get("MiddleName") + " " + emp.get("LastName");
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);
			sleep(5);
		}
	}

	@When("user enter employee data from {string} excel sheet then employee is added")
	public void user_enter_employee_data_from_excel_sheet_then_employee_is_added(String sheetName) {
		List<Map<String, String>> excelList = ExcelUtility.excelIntoListOfMAps(Constants.EXCELDATA_FILEPATH, sheetName);
		for (Map<String, String> l : excelList) {
			sendText(addEmp.firstName, l.get("firstName"));
			sendText(addEmp.lastName, l.get("lastName"));
			WaitandClick(addEmp.btnSave);
			String actual = pdetails.profilePic.getText();
			String expected = l.get("firstName") + " " + l.get("lastName");
			Assert.assertEquals("Employee is not addedd successfully", expected, actual);
			jsClick(dashboard.addEmp);
			sleep(5);
		}
	}
}
