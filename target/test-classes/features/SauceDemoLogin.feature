#Author: Bayramgul atageldiyevab@gmail.com
Feature: Sace Demo login
  
  Description: US-3421 The purpose of this feature file is to automate saucedemo app login feature with valid and invalid credentials
  Acceptance Criteria: I want to automate login functionality

  Background: Given user is on login page

  Scenario: invalid login
    When user enters invalid username "Admin"
    And user enter invalid password "Admin@123"
    And click on login button
    Then user should see the error message "Epic sadface: Username and password do not match any user in this service"

  Scenario Outline: Login with different usernames
    When user enters valid "<UserName>" and "<Password>" and clicks loginBtn
    Then do the validation for the login functionality "Products"

    Examples: 
      | UserName                | Password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
