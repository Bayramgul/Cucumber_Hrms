Feature: Add new Employee

  Background: 
    Given user logins with valid admin credentials
    And user navigates to AddEmployeePage

  @smoke
  Scenario: Add Employee with first and lastname
    When user enters employees "John" and "Smith"
    And user clicks save button
    Then "John Smith" is added successfully
@regression
  Scenario: Add Employee without employee id
    When user enters employees "John" and "Smith"
    And user deletes employee id
    And user clicks save button
   Then "John Smith" is added successfully
@smoke
  Scenario: AddEmployee and create Login Credentials
     When user enters employees "John" and "Smith"
    And user clicks on create login checkbox
    And user enters  login credentials
    And user clicks save button
   Then "John Smith" is added successfully

  #to perform DDT in cucumber we use Scenario Outline with Examples
  @regression 
  Scenario Outline: Adding multiple employees
    When user enters employee "<FirstName>","<MiddleName>" and "<LastName>"
    And user clicks save button
    Then "<FirstName>","<MiddleName>" and "<LastName>" is added successfully

    Examples: 
      | FirstName | MiddleName | LastName   |  
      | James     | J          | Smith      |  
      | Yunus     | Future     | Instructor |  
      | Sohil     | S          | Instructor |  
      #adding multiple employees using Cucumber DataTable
      @regression @inProgress
  Scenario: Adding multiple employees
    When user enters employee details and click on save then employee is added
      | FirstName | MiddleName | LastName |
      | John      | Jane          | Doe      |
      | Jane      | J          | Smith    |
    @regression @excel 
    Scenario:  Adding multiple employees
    When user enter employee data from "addEmp" excel sheet then employee is added
    
    
