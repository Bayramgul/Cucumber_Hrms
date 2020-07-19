package com.hrms.steps;

import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.DBUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/*
 * Search an employee in hrms by id
get the last name  from the table
validate ui last name against db
 */
public class EmpLAstNameValidationSteps extends CommonMethods {
	public static Map<String, String> lastnameDB;
	public static Map<String, String> lastnameUI;
	@Given("verify lastname is displayed")
	public void verify_table_is_displayed() {
		Assert.assertTrue(empList.empIDValidation());

	}

	@When("get lastname from table")
	public void get_lastname_from_table() {

 lastnameUI = empList.getLastNameFromTable();
	}

	@When("get  lastname from db")
	public void get_lastname_from_db() {
		String sqlQuery = "select emp_lastname from hs_hr_employees where employee_id=14688";
	lastnameDB=DBUtils.DataFromDB_AsMap(sqlQuery);
	}

	@Then("validate lastname from UI againist Db")
	public void validate_lastname_from_UI_againist_Db() {
		Assert.assertEquals("Lastnames doesn't macth",lastnameUI,lastnameDB);
	}

}
