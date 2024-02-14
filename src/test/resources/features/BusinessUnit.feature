@regression @businessunit
Feature: Business Unit functionality

  Scenario: 1_verify Business Unit functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'business unit tab' in business unit page
    And User clicks on 'business unit tab' in business unit page
    And User verify 'business unit list' in business unit page
    Then User verify 'new business unit' in business unit page
    And User verifies 'business unit table column headers' in business unit page
    Then User verify 'search option default value' in business unit page
    Then User verify 'table filter default value' in business unit page
    Then User verify 'reset filter' button in business unit page
    Then User verify 'download' button in business unit page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in business unit table business unit page
    
    And User clicks on 'new business unit' in business unit page
    Then User verify 'label business unit name' in business unit page
    Then User verify 'label business unit code' in business unit page
    Then User verify 'label organisation' in business unit page
    Then User verify 'label address' in business unit page
    Then User verify 'label country' in business unit page
    Then User verify 'label time zone' in business unit page
    Then User verify 'label date format' in business unit page
    Then User verify 'cancel' button in business unit page
    Then User verify 'save button' in business unit page
    And User clicks on 'save' button in business unit page    
    Then User verify 'warning message business unit name required' in business unit page
    Then User verify 'warning message business unit code required' in business unit page
    Then User verify 'warning message please select organisation' in business unit page
    Then User verify 'warning message please select location' in business unit page
    Then User verify 'warning message please select time zone' in business unit page
    And User verify 'warning message date format required' in business unit page
    And User clicks on 'cancel' button in business unit page
    
    And User clicks on 'new business unit' in business unit page
    Then User verify 'label business unit name' in business unit page
    Then User enters 'text business unit name' in 'business unit name' field of business unit page
    Then User enters 'text business unit code' in 'business unit code' field of business unit page
    Then User enters 'text business unit addresss' in 'address' field of business unit page
    And User selects 'text business unit organisation' as 'organization' in business unit page
    And User selects 'text business unit country' as 'country' in business unit page
    Then User selects 'text business unit time zone' as 'time zone' in business unit page
    Then User enters 'text date month year' in 'date format' field of business unit page
    And User clicks on 'save' button in business unit page
    Then User verify 'business unit create message' in business unit page
    
    Then User verify 'reset filter' button in business unit page
    Then User verify 'txt_business_unit_table_data' in row 1 of business unit page
    And User selects 'option active' as 'table filter' in business unit page
    Then User verify only 'active' business unit records will display
    And User selects 'option inactive' as 'table filter' in business unit page
    Then User clicks on 'reset filter' button in business unit page
    Then User verify 'table filter default value' in business unit page
    Then User verify 'search option default value' in business unit page
    And User selects 'business unit option' as 'search option' in business unit page
    Then User enters 'text business unit name' in 'search' field of business unit page
    Then User verify 'txt_business_unit_table_data' in row 1 of business unit page
    And User selects 'business unit code option' as 'search option' in business unit page
    Then User enters 'text business unit code' in 'search' field of business unit page
    And User verify 'text business unit code' in row 1 column 3 in business unit page
    And User clicks on 'reset filter' button in business unit page
    Then User verify 'search option default value' in business unit page
    Then User verify 'table filter default value' in business unit page
    
    And User clicks on 'new business unit' in business unit page
    Then User enters 'text business unit name' in 'business unit name' field of business unit page
    Then User enters 'text business unit code' in 'business unit code' field of business unit page
    Then User enters 'text business unit addresss' in 'address' field of business unit page
    And User selects 'option' as 'organization' in business unit page
    And User selects 'text country' as 'country' in business unit page
    Then User selects 'text time zone' as 'time zone' in business unit page
    Then User selects 'text date month year' as 'date format' in business unit page
    And User clicks on 'save' button in business unit page
    Then User verify 'business unit is allready present' in business unit page
    And User clicks on 'cancel' button in business unit page
    
    And User clicks on 'edit' icon in business unit page
    Then User verify 'edit business unit header' in business unit page
    Then User verify 'label businees unit name' in business unit page
    Then User verify 'label businees unit code' in business unit page
    Then User verify 'label organisation' in business unit page
    Then User verify 'label address' in business unit page
    Then User verify 'label country' in business unit page
    Then User verify 'label time zone' in business unit page
    Then User verify 'label date format' in business unit page
    And User clicks on 'cancel' button in business unit page
    
    And User clicks on 'edit' icon in business unit page
    Then User verify 'edit business unit header' in business unit page
    Then User verify 'label businees unit name' in business unit page
    Then User enters 'text business unit name' in 'business unit name' field of business unit page
    Then User enters 'text business unit code' in 'business unit code' field of business unit page
    And User clicks on 'update' button in business unit page
    Then User verify 'business unit updated successfully message' in business unit page
    Then User verify 'txt_business_unit_table_data1' in row 1 of business unit page
    
    And User clicks on 'delete icon' in business unit page
    Then User verify 'confirm you delete' in business unit page
    Then User verify 'delete' button in business unit page
    And User clicks on 'delete' button in business unit page
    Then User verify 'business unit delete message' in business unit page
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
