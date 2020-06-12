Feature: Login
@logindifferent
  Scenario Outline: Login with different roles
    When user enter valid "<Username>" and "<Password>"
    And clicks on login button
    Then "<FirstName>" is successfully logged in

    Examples: 
      | Username | Password    | FirstName |
      | Admin    | Hum@nhrm123 | Admin     |
      | Gul123   | Syntax123.  | John |
# @regression
@errorMessage
  Scenario Outline: Login with invalid credentials
    When I enter invalid "<UserName>" and "<Password>" and see "<ErrorMessage>"

    Examples: 
      | UserName | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid credentials      |
      | Hello    | Syntax123! | Invalid credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax123! | Username cannot be empty |
