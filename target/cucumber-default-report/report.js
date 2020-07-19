$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmpLastNameValidation.feature");
formatter.feature({
  "name": "LastName validation",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@SQL_LastNameValidation"
    }
  ]
});
formatter.scenario({
  "name": "Employee LastName Validation from UI to DB",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@SQL_LastNameValidation"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logins with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.Login_As_Emp_ESS.user_logins_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches employee by ID \"14688\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.ModifyPersonalDetails.clicks_on_PIM_and_searches_employee_by_name_or_ID_and_clicks_from_dataTable(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify lastname is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmpLAstNameValidationSteps.verify_table_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get lastname from table",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmpLAstNameValidationSteps.get_lastname_from_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "get  lastname from db",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmpLAstNameValidationSteps.get_lastname_from_db()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate lastname from UI againist Db",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmpLAstNameValidationSteps.validate_lastname_from_UI_againist_Db()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});