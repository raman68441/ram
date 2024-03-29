@regression @organization
Feature: Organization functionality

  @org
  Scenario: 1_verify organization functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'organization tab' in organization page
    And User verify 'organization list' in organization page
    Then User verify 'new organization does not displayed' in organization page
    Then User verify 'edit icon does not displayed' in organization page
    And User verify 'delete icon does not displayed' in organization page 
    And User verifies 'organization table column headers' in organization page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in organization table organization page 
         
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'