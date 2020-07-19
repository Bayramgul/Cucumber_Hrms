package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifyPersonalDetails extends CommonMethods {

	@Given("User searches employee by ID {string}")
	public void clicks_on_PIM_and_searches_employee_by_name_or_ID_and_clicks_from_dataTable(String EmpID) {
		WaitandClick(dashboard.pim);
		sleep(2);
		sendText(empList.EmpID, EmpID);
		WaitandClick(empList.searchBtn);
		sleep(1);
//		WaitandClick(empList.empIDValidation);
		
		//empList.chooseEmp(EmpID);
	}

	@When("clicks on Edit button and modifies personal details")
	public void clicks_on_Edit_button_and_modifies_personal_details(io.cucumber.datatable.DataTable dataTable) {
		WaitandClick(pdetails.btnEditSave);
		List<Map<String, String>> map=dataTable.asMaps();
		for(Map<String, String> m:map) {
			sendText(pdetails.driverseLC,m.get("DLNumber"));
			sendText(pdetails.LicExpDate, m.get("LicenseExpiryDate"));
			pdetails.LicExpDate.sendKeys(Keys.ENTER);
			sendText(pdetails.SSN, m.get("SSN"));
			sendText(pdetails.SIN, m.get("SIN"));
			WaitandClick(pdetails.femaleRDBtn);//,m.get("Gender") );
			sleep(1);
			selectDDValue(pdetails.MaritalST, m.get("MaritalStatus"));
			selectDDValue(pdetails.nationalityDD, m.get("Nationality"));
			sendText(pdetails.DOB, m.get("DateofBirth"));
			pdetails.DOB.sendKeys(Keys.ENTER);
			sendText(pdetails.nickname, m.get("NickName"));
			sendText(pdetails.militaryServce, m.get("MilitaryService"));
			sleep(1);
			if(pdetails.smoker.isEnabled()) {
				WaitandClick(pdetails.smoker);
			}
			
			sleep(3);
			
		}
	}

	@Then("admin saves the modifications and takes {string}")
	public void admin_saves_the_modifications(String screenshotName) {
		WaitandClick(pdetails.btnEditSave);
		takesScreenshot(screenshotName);
	}

}
