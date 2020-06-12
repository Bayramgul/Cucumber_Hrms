#Author: your.email@your.domain.com

@smoke @Dashboard
Feature: Dashboard 

  Scenario: Dashboard menu view for admin
   When user logins with valid admin credentials
    Then user see dahshboard menu is displayed
    |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|


 