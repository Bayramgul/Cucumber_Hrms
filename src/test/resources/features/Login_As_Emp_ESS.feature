Feature: Login to HRMS webpage in different roles

  Scenario: User should be be able to login as an Admin using valid admin credentials
    Given user logins with valid admin credentials
    Then User sees Welcome Admin text on top right corner

  Scenario: ESS should be be able to login as an ESS using valid ESS credentials
    When user enters valid ESS username
    And user enters valid ESS password
    And clicks on login button
    Then User sees Welcome ESS username text on top right corner

  @dataTable
  Scenario Outline: Login with different roles
    When user enter valid "<Username>" and "<Password>"
    And clicks on login button
    Then "<FirstName>" is successfully logged in

    Examples: 
      | Username | Password    | FirstName |
      | Admin    | Hum@nhrm123 | Admin     |
      | Gul123   | Syntax123.  | Bayramgul |
