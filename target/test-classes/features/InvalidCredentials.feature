@InvalidCredentials
Feature: Login with invalid credentials

  Scenario Outline: Login with invalid credentials
    When I enter invalid "<UserName>" and "<Password>" and see "<ErrorMessage>"

    Examples: 
      | UserName | Password   | ErrorMessage        |
      | Admin    | Admin123   | Invalid Credentials |
      | Hello    | Syntax123! | Invalid Credentials |
#
  #Scenario: Login with invalid credentials
    #When I entered invalid "<UserName>" and "<Password>" and see "<ErrorMessage>"
      #| UserName | Password   | ErrorMessage        |
      #| Admin    | Admin123   | Invalid Credentials |
      #| Hello    | Syntax123! | Invalid Credentials |
