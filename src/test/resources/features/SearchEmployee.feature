@searchEmployee
Feature: Employee Search
#we can only use preconditions for background
  Background: 
    Given user logins with valid admin credentials
    And user navigates to EmployeeList page

  @smoke
  Scenario: Search employee by Id
    When user enters valid employee id "10324"
    And user clicks on the search button
    Then user see employee id "10324" is displayed

  @regression
  Scenario: Search employee by name
    When user enters valid employee name "John S"
    And user clicks on the search button
    Then user see employee name "John S" is displayed
