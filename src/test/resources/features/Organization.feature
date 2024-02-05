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
    Then User verify 'new organization' in organization page
    And User verifies 'organization table column headers' in organization page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in organization table organization page
    And User clicks on 'new organization' in organization page
    Then User verify 'label organization name' in organization page
    Then User verify 'label organization code' in organization page
    Then User verify 'label organization description' in organization page
    Then User verify 'cancel' button in organization page
    Then User verify 'save' button in organization page
    And User clicks on 'save' button in organization page
    Then User verify 'warning message organization name required' in organization page
    Then User verify 'warning message organization code required' in organization page
    And User clicks on 'cancel' button in organization page
    And User clicks on 'new organization' in organization page
    Then User enters 'text organization name' in 'organization name' field of organization page
    Then User enters 'text organization code' in 'organization code' field of organization page
    Then User enters 'text description' in 'description' field of organization page
    And User clicks on 'save' button in organization page
    Then User verify 'organization create message' in organization page
    Then User verify login tab 'txt_organization_table_data' in organization row 1
    And User clicks on 'new organization' in organization page
    Then User enters 'text organization name' in 'organization name' field of organization page
    Then User enters 'text organization name' in 'organization code' field of organization page
    Then User enters 'text description' in 'description' field of organization page
    And User clicks on 'save' button in organization page
    Then User verify 'organization allready exist message' in organization page
    And User clicks on 'cancel' button in organization page
    And User clicks on 'edit' icon in organization page
    Then User verify 'edit organization header' in organization page
    Then User verify 'label organization name' in organization page
    Then User verify 'label organization code' in organization page
    Then User verify 'label organization description' in organization page
    And User clicks on 'cancel' button in organization page
    And User clicks on 'edit' icon in organization page
    Then User verify 'label organization name' in organization page
    Then User verify 'label organization code' in organization page
    Then User verify 'label organization description' in organization page
    Then User verify 'edit organization header' in organization page
    Then User enters 'text organization name1' in 'organization code' field of organization page
    Then User enters 'text organization name1' in 'organization code' field of organization page
    Then User enters 'text description1' in 'description' field of organization page
    Then User verify 'organization updated successfully message' in organization page
    Then User verify 'txt_organization_table_data1' in organization table row 1
    And User clicks on 'delete icon' in organization page
    Then User verify 'confirm you delete' in organization page
    Then User verify 'delete' button in organization page
    And User clicks on 'delete' button in organization page
    Then User verify 'organization delete message' in organization page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
