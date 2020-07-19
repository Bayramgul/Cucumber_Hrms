$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/EmpLastNameValidation.feature");
formatter.feature({
<<<<<<< HEAD
  "name": "LastName validation",
=======
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@id\u003d\u0027profile-pic\u0027]//h1\"}\n  (Session info: chrome\u003d84.0.4147.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Annas-MacBook-Air.local\u0027, ip: \u00272600:8806:2100:1230:5837:19ad:4ca0:6d51%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.4\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/p_/rt_svhd10jj...}, goog:chromeOptions: {debuggerAddress: localhost:55212}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5ffabf3d0552648b78482af7f8e2750b\n*** Element info: {Using\u003dxpath, value\u003d//div[@id\u003d\u0027profile-pic\u0027]//h1}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\n\tat com.hrms.steps.AddEmployee.employee_is_added_successfully(AddEmployee.java:37)\n\tat ✽.\"John Smith\" is added successfully(file:///Users/annaannayev/eclipse-workspace/Cucumber_Hrms/src/test/resources/features/AddEmployee.feature:24)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Dashboard.feature");
formatter.feature({
  "name": "Dashboard",
>>>>>>> ad3abd1d47c5b34ee7a67bf00537844430a45015
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//table[@id\u003d\u0027resultTable\u0027]//tbody//tr[1]//td[2]\"}\n  (Session info: chrome\u003d84.0.4147.89)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Annas-MacBook-Air.local\u0027, ip: \u00272600:8806:2100:1230:5837:19ad:4ca0:6d51%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.4\u0027, java.version: \u002712.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.89, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /var/folders/p_/rt_svhd10jj...}, goog:chromeOptions: {debuggerAddress: localhost:55278}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: c65e0e568a67424e853650575765dd3c\n*** Element info: {Using\u003dxpath, value\u003d//table[@id\u003d\u0027resultTable\u0027]//tbody//tr[1]//td[2]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy19.getText(Unknown Source)\n\tat com.hrms.steps.EmployeeSearchSteps.user_see_employee_information_is_displayed(EmployeeSearchSteps.java:40)\n\tat ✽.user see employee id \"10324\" is displayed(file:///Users/annaannayev/eclipse-workspace/Cucumber_Hrms/src/test/resources/features/SearchEmployee.feature:12)\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});