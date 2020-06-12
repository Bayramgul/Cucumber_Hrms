Feature: Employee personal details

  @modify
  Scenario: Admin should be able to modify employee personal details
    Given user logins with valid admin credentials
    And clicks on PIM and searches employee by "10822" and clicks from dataTable
    When clicks on Edit button and modifies personal details
      | DLNumber   | LicenseExpiryDate | SSN    | SIN      | Gender | MaritalStatus | Nationality | DateofBirth | NickName | MilitaryService |
      | 1232435345 | 2025-Jul-12       | 123455 | 09876433 | Female | Married       | Albanian    | 2000-Jul-12 | James    | army            |
    Then admin saves the modifications and takes "ModifyDetails"
