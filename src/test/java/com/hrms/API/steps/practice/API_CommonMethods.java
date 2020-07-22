package com.hrms.API.steps.practice;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class API_CommonMethods {
/**
 * @author Bayramgul
 * In this method  headers will be passed which are used with given()in requests of postCreateEmployee,
 * GetOneEMployeeAPISteps,GetAllEmmployee,GetAllJobTitles,PutUpdateEmployee
 */
	public RequestSpecification headersInRequest() {
		RequestSpecification request =given().header("Content-Type","application/json").header("Authorization",SyntaxAuthenticationSteps.Token);
	return request;
	}
	
	/**
	 * Declaring Private variable to initialize inside methods
	 */
	private Response responseVariable = null;
	private RequestSpecification requestHeaders = null;

	// this is Base URL not Base URI
	static String BaseUrl = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";

	/**
	 * JWT for HRMS API
	 */
	private String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUxNDMwNzksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTE4NjI3OSwidXNlcklkIjoiMTA4MSJ9.sWhTRMjX_DFTakxH988NQiSnEzSLL1rMKdi6J3R7Ctg";

	/**
	 * @author Md. Saifuzzaman (Saif) 
	 * this Setters is to update Token Every 12 hours
	 */
	public void setToken(String token) {
		this.token = token;
	}

	/**
	 * @author Md. Saifuzzaman (Saif) 
	 * This Method will taken token and query
	 * parameter details as parameter And return Request Specification
	 * Object with content type json.
	 * @param token
	 * @param qParamName
	 * @param qParamValue
	 * @return
	 */
	public RequestSpecification requestSpecificationDetails(String qParamName, String qParamValue, String body) {

		if (qParamName.isEmpty() && qParamValue.isEmpty() && body.isEmpty()) {

			requestHeaders = given().headers("Content-type", ContentType.JSON)
					.header("Authorization", "Bearer " + this.token).log().all();

		} else if (qParamName.isEmpty() && qParamValue.isEmpty() && !(body.isEmpty())) {

			requestHeaders = given().headers("Content-type", ContentType.JSON)
					.header("Authorization", "Bearer " + this.token).body(body).log().all();

		} else if (!(qParamName.isEmpty() && qParamValue.isEmpty()) && body.isEmpty()) {

			requestHeaders = given().headers("Content-type", ContentType.JSON)
					.header("Authorization", "Bearer " + this.token).queryParams(qParamName, qParamValue).log().all();

		}
		return requestHeaders;
	}

	/**
	 * @author Md Saifuzzaman (Saif) 
	 * This Method will show resonseResult based on
	 * endpointName,parameter and body. FYI, for HRMS application we have to
	 * set token before running this method if token has expired. Note that
	 * when We are not providing any parameter we have write this[""] for
	 * both parameter name & value. We also have to write [""] if we are not
	 * providing any body
	 * 
	 * @param endPointName of the request as String
	 * @param Query parameter name as string
	 * @param Query parameter value as string
	 * @param Request body of Json Format passed as String
	 * @return
	 */
	
	public Response executeResponse(String endPointName, String qParamName, String qParamValue, String body) {

		if (qParamName.isEmpty() && body.isEmpty()) {

			if (endPointName.equalsIgnoreCase("/getAllEmployees.php") || endPointName.equalsIgnoreCase("/jobTitle.php")
					|| endPointName.equalsIgnoreCase("/employeeStatus.php"))
				responseVariable = requestSpecificationDetails("", "", "").when().get(endPointName);

		} else if (qParamName.isEmpty() && !body.isEmpty()) {

			if (endPointName.equalsIgnoreCase("/createUser.php") || endPointName.equalsIgnoreCase("/generateToken.php")
					|| endPointName.equalsIgnoreCase("/createEmployee.php")) {

				responseVariable = requestSpecificationDetails("", "", body).when().post(endPointName);

			} else if (endPointName.equalsIgnoreCase("/updateEmployee.php")) {

				responseVariable = requestSpecificationDetails("", "", body).when().put(endPointName);

			} else if (endPointName.equalsIgnoreCase("/updatePartialEmplyeesDetails.php")) {

				responseVariable = requestSpecificationDetails("", "", body).when().patch(endPointName);
			}
		} else {
			if (endPointName.equalsIgnoreCase("/getOneEmployee.php")) {

				responseVariable = requestSpecificationDetails(qParamName, qParamValue, "").when().get(endPointName);

			} else if (endPointName.equalsIgnoreCase("/deleteEmployee.php")) {

				responseVariable = requestSpecificationDetails(qParamName, qParamValue, "").when().delete(endPointName);
			}

		}
		return responseVariable;
	}

}
