package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.DBUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class EmployeeSearchSql extends CommonMethods {
	public static List<Map<String,String>> dbData;
	public static List<Map<String,String>>  uiData;
	@Then("verify table is displayed")
	public void verify_table_is_displayed() {
		Assert.assertTrue(empList.empIDValidation());
	
	}

	@Then("get firstname from table")
	public void get_firstname_from_table() {
		 uiData=empList.getFirstNameFromTable();
		System.out.println(empList.getFirstNameFromTable());
	}

	@When("get first name from db")
	public void get_first_name_from_db() {
		String query="select emp_firstname from hs_hr_employees\n" + 
				"where employee_id=14688";
	dbData=DBUtils.storeDataFromDB(query);
	}

	@Then("validate first name from UI againist Db")
	public void validate_first_name_from_UI_againist_Db() {
		Assert.assertEquals(uiData, dbData);
	}
	


}
