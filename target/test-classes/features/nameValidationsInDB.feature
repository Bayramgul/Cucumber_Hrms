
@tag
Feature: Name validation againist DB

   
  @tag1
  Scenario: Title of your scenario
     Given user logins with valid admin credentials
     And  User searches employee by ID "14688"
    Then verify table is displayed
    And get firstname from table
    When get first name from db
    Then validate first name from UI againist Db
  




  