$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add Employee with first and lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees \"John\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_enters_employees_first_name_and_last_name(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"John Smith\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.employee_is_added_successfully(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "AddEmployee and create Login Credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters employees \"John\" and \"Smith\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_enters_employees_first_name_and_last_name(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on create login checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_clicks_on_create_login_checkbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  login credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_enters_login_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.user_clicks_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"John Smith\" is added successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployee.employee_is_added_successfully(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027profile-pic\u0027]//h1\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Bayramguls-MacBook-Air.local\u0027, ip: \u00272600:8806:2100:1230:b41c:7da5:e24b:2fe4%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/2c/s0j3fvnx6sn...}, goog:chromeOptions: {debuggerAddress: localhost:63735}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 65584cb67865db3f4f72418638accac7\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027profile-pic\u0027]//h1}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy17.getText(Unknown Source)\n\tat com.hrms.steps.AddEmployee.employee_is_added_successfully(AddEmployee.java:37)\n\tat ✽.\"John Smith\" is added successfully(file:///Users/Bayramgul/eclipse-workspace/Hrms/src/test/resources/features/AddEmployee.feature:24)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Dashboard.feature");
formatter.feature({
  "name": "Dashboard",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@Dashboard"
    }
  ]
});
formatter.scenario({
  "name": "Dashboard menu view for admin",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@Dashboard"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logins with valid admin credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.Login_As_Emp_ESS.user_logins_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see dahshboard menu is displayed",
  "rows": [
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.DashboardSteps.user_see_dahshboard_menu_is_displayed(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with valid username and invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enters_valid_username()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters invalid password",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_enters_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see “Invalid credentials” error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_see_Invalid_credentials_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/SearchEmployee.feature");
formatter.feature({
  "name": "Employee Search",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@searchEmployee"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "user navigates to EmployeeList page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_navigates_to_EmployeeList_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Search employee by Id",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@searchEmployee"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user enters valid employee id \"10324\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_enters_valid_employee_ID(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the search button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_clicks_on_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user see employee id \"10324\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.EmployeeSearchSteps.user_see_employee_information_is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});