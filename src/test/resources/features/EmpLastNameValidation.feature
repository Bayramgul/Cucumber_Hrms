@SQL_LastNameValidation
Feature: LastName validation

  Scenario: Employee LastName Validation from UI to DB
    Given user logins with valid admin credentials
    And User searches employee by ID "14688"
    And verify lastname is displayed
    When get lastname from table
    And get  lastname from db
    Then validate lastname from UI againist Db
