package com.hrms.API.steps.practice;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//import org.apache.*;
/**
 * We may use below -please comment out for now
 */
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
/**
 * This @FixMethodOrder(MethodSorters.NAME_ASCENDING) will execute @Test annotation in ascending alphabetical order
 * @author Bayramgul
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HardCodedExamples {
	/**
	 * Rest Assured 
	 * given ==> prepare your request 
	 * when ==> you are making the call
	 * to the request then ==> Validating
	 * 
	 * @param args
	 */
	// this is Base URL not Base URI
	static String BaseUrl = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	/**
	 * JWT for HRMS API
	 */
	static String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUxNzA0NTMsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTIxMzY1MywidXNlcklkIjoiODgyIn0.9Ra4LMvegM9Y-rssEXogFQ4_sndeBq3ocX0SuHqizXo";
	public static String employeeID;
//	@Test
	public void sampleTestNotes() {
		/**
		 * Preparing "/getOneEmployee.php" request
		 * 
		 * ".log().all() ==> shows header details in console"
		 */
		RequestSpecification getOneEmployeeRequest = given().headers("Content-Type", "application/json")
				.header("Authorization", token).queryParams("employee_id", "6961").log().all();
		/**
		 * Storing Response
		 */
		Response getOneEmployeeresponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
		// Printing response
		getOneEmployeeresponse.prettyPrint();
		System.out.println("=====Another way of Printing Response============");
		String response = getOneEmployeeresponse.body().asString();
		System.out.println(response.toString());
		getOneEmployeeresponse.then().assertThat().statusCode(200);
	}
	@Test
	public void aPostCreateEmployee () {

		/**
		 * Preparing "/getOneEmployee.php" request
		 * 
		 * ".log().all() ==> shows header details in console"
		 */
		RequestSpecification createOneEmployeeRequest = given().headers("Content-Type", "application/json")
				.header("Authorization", token).body("{\r\n" + 
						"            \"emp_firstname\": \"Abraham_PhD\",\r\n" + 
						"            \"emp_middle_name\": \"H\",\r\n" + 
						"            \"emp_lastname\": \"Yundt\",\r\n" + 
						"            \"emp_birthday\": \"1986-09-01\",\r\n" + 
						"            \"emp_gender\": \"M\",\r\n" + 
						"            \"emp_job_title\": \"Automation Engineer\",\r\n" + 
						"            \"emp_status\": \"Self-Employee\"\r\n" + 
						"        }");
		/**
		 * Storing Response
		 */
		Response createEmployeeresponse = createOneEmployeeRequest.when().post("/createEmployee.php");
		// Printing response
		createEmployeeresponse.prettyPrint();
		
		 employeeID=createEmployeeresponse.jsonPath().getString("Employee[0].employee_id");
		System.out.println(employeeID);
		/**
		 * Verifying Message using equalTo()method -manually import static package import static org.hamcrest.Matchers.*;
		 */
		createEmployeeresponse.then().assertThat().body("Message",equalTo("Entry Created"));
		/**
		 * Verifying created first name
		 */
		createEmployeeresponse.then().assertThat().body("Employee[0].emp_firstname",equalTo("Abraham_PhD"));
		/**
		 * Verifying headers using then().header();
		 */
		createEmployeeresponse.then().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");
		createEmployeeresponse.then().header("Content-Type", "application/json");
		createEmployeeresponse.then().assertThat().header("Access-Control-Allow-Methods", "POST");
		
	}
	@Test
	public void bGetCreatedEmployee() {		
		/**
		 * Preparing request for /getOneEmployee.php
		 */
		RequestSpecification getCreatedEmployeeRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token).queryParam("employee_id", employeeID).log().all();
		/**
		 * Making call to retrieve created employee
		 */
		Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");
		/**
		 * Printing response using prettyPrint()prints response as String
		 */
		String response=getCreatedEmployeeResponse.prettyPrint();
		/**
		 * Storing response employeeID into empID which will be used for verification
		 * against stored global employee ID
		 */
		String empID = getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		/**
		 * matching exact employeeID's
		 */
		boolean verifyingEmpoyeeIDsMatch = empID.equalsIgnoreCase(employeeID);
		System.out.println("Employee IDs match::: "+verifyingEmpoyeeIDsMatch);
		/**
		 * Asserting employee ID's match
		 */
		Assert.assertTrue(verifyingEmpoyeeIDsMatch);
		/**
		 * 
		 */
		getCreatedEmployeeResponse.then().assertThat().statusCode(200);
		
		JsonPath js=new JsonPath(response);
		String emplID=js.getString("employee[0].employee_id");
		String firtsName=js.getString("employee[0].emp_firstname");
		String midleName=js.getString("employee[0].emp_middle_name");
		String lastname=js.getString("employee[0].emp_lastname");
		String birthday=js.getString("employee[0].emp_birthday");
		String gender=js.getString("employee[0].emp_gender");
		String jobtitle=js.getString("employee[0].emp_job_title");
		String empStatus=js.getString("employee[0].emp_status");
		/**
		 * Verifying that expected firstname, lastname, birthday,gender,jobtitle,empStatus ... matches actual values
		 */
		System.out.println(emplID+" "+firtsName);
		Assert.assertTrue(empID.contentEquals(employeeID));
		Assert.assertTrue(midleName.contentEquals("H"));
		Assert.assertTrue(lastname.contentEquals("Yundt"));
		Assert.assertTrue(birthday.contentEquals("1986-09-01"));
		Assert.assertTrue(gender.contentEquals("Male"));
		Assert.assertTrue(empStatus.contentEquals("Self-Employee"));
		
	}
	@Test
	public void cGetAllEMployees() {
		/**
		 * Pereparing /getAllEmployees.php request
		 */
		RequestSpecification getAlledEmployeesRequest = given().header("Content-Type", "application/json")
				.header("Authorization", token);
		/**
		 * Storing response into /getAllEmployeesResponse
		 */
		Response getAlledEmployeesResponse=getAlledEmployeesRequest.when().get("/getAllEmployees.php");
//		getAlledEmployeesResponse.prettyPrint();
		String allEmployees=getAlledEmployeesResponse.body().asString();
		/**
		 * DO RESEARCH
		 */
//		allEmployees.matches(allEmployees);
		JsonPath js=new JsonPath(allEmployees);
		int sizeOfList=js.getInt("Employees.size()");
		System.out.println(sizeOfList);
		/**
		 * Print all employee IDs
		 */
//		for(int i=0;i<sizeOfList;i++) {
//		String allEMployeeIDs=js.getString("Employees["+i+"].employee_id");
////		System.out.println(allEMployeeIDs);
//		/**
//		 * 
//		 */
//			if(allEMployeeIDs.contentEquals(employeeID))	{
//				System.out.println("Employee ID::: "+employeeID+" is present in thre body");
//				String allEMployeeFname=js.getString("Employees["+i+"].emp_firstname");
//				break;
//			}
//		} 
//		
	}
public void dPutUpdateCreatedEmployee() {
	 RequestSpecification updateCreatedEmployeeRequest=given().header("Content-Type","application/json").header("Authorization",token).body(HardCodedConstants.updateCreateBody());
	Response updateCreatedEmployeeResponse=updateCreatedEmployeeRequest.when().put("/updateEmployee.php");
	String response=updateCreatedEmployeeResponse.prettyPrint();
	System.out.println(response);
}
}
