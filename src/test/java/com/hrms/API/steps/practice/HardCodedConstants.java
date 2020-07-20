package com.hrms.API.steps.practice;

public class HardCodedConstants {
public static String updateCreateBody() {
	String updateBody="{\n" + 
			"  \"employee_id\": \""+HardCodedExamples.employeeID+"\",\n" + 
			"  \"emp_firstname\": \"Jennet\",\n" + 
			"  \"emp_lastname\": \"Jenny\",\n" + 
			"  \"emp_middle_name\": \"Atayeva\",\n" + 
			"  \"emp_gender\": \"F\",\n" + 
			"  \"emp_birthday\": \"2001-02-11\",\n" + 
			"  \"emp_status\": \"Freelance\",\n" + 
			"  \"emp_job_title\": \"Application Developer\"\n" + 
			"}";
	return updateBody;
}
	
	
}
