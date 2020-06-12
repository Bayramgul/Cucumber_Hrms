Feature: Login

  @smoke
  Scenario: Login with valid username and invalid password
    When user enters valid username
    And user enters invalid password
    And clicks on login button
    Then user see “Invalid credentials” error message
@regression
  Scenario: Login with valid username and without password
    When user enters valid username
    And user enters empty password
    And clicks on login button
    Then user see “Password can not be empty” error message
@regression
  Scenario: Login without username and valid password
    When user enters empty username
    And valid password
    And clicks on login button
    Then user see “Username can not be empty” error message
  @Login
  Scenario: ESS should be be able to login as an ESS using valid ESS credentials
    When user enters valid ESS username
    And user enters valid ESS password
      And clicks on login button
    Then User sees Welcome ESS username text on top right corner
