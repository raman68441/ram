@regression @department
Feature: Department functionality

  @dep
  Scenario: 1_verify department functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'department tab' in department page
    And User clicks on 'department tab' in department page
    And User verify 'department list' in department page
    Then User verify 'new department' in department page
    And User verifies 'department table column headers' in department page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in department table department page
 
    And User clicks on 'new department' in department page
   Then User verify 'label department name' in department page
    Then User verify 'label department code' in department page
    Then User verify 'label site Tab' in department page
    Then User verify 'label department description' in department page
    Then User verify 'cancel' button in department page
    Then User verify 'create button' in department page
    And User clicks on 'create' button in department page
    Then User verify 'warning message department name required' in department page
    Then User verify 'warning message department code required' in department page
    Then User verify 'warning message please select site' in department page
    And User clicks on 'cancel' button in department page
  
    And User clicks on 'new department' in department page
    Then User enters 'text department name' in 'department name' field of department page
    Then User enters 'text department code' in 'department code' field of department page
   And User selects 'text department site' as 'site' in department page
    Then User enters 'text department description' in 'description' field of department page
    And User clicks on 'create' button in department page
    Then User verify 'department create message' in department page
    Then User verify 'txt_department_table_data' in department row 1
   
    And User clicks on 'new department' in department page
    Then User enters 'text department name' in 'department name' field of department page
    Then User enters 'text department code' in 'department code' field of department page
    And User selects 'text department site' as 'site' in department page
    Then User enters 'text department description' in 'description' field of department page
    And User clicks on 'create' button in department page
    Then User verify 'department is allready present' in department page
    And User clicks on 'cancel' button in department page
   
    And User clicks on 'edit' icon in department page
    Then User verify 'edit department header' in department page
    Then User verify 'label department name' in department page
    Then User verify 'label department code' in department page
    Then User verify 'label edit site Tab' in department page
    Then User verify 'label department description' in department page
    And User clicks on 'cancel' button in department page
    
    And User clicks on 'edit' icon in department page
    Then User verify 'edit department header' in department page
    Then User verify 'label department name' in department page
    Then User verify 'label department code' in department page
    Then User verify 'label edit site Tab' in department page
    Then User verify 'label department description' in department page
    Then User enters 'text department name' in 'edit department name' field of department page
    And User clicks on 'update' button in department page
    Then User verify 'department updated successfully message' in department page
    Then User verify 'txt_department_table_data1' in department row 1
    
    And User clicks on 'delete icon' in department page
    Then User verify 'confirm your delete' in department page
    Then User verify 'delete' button in department page
    And User clicks on 'delete' button in department page
    Then User verify 'department delete message' in department page
    
    Then User verify 'reset filter' button in department page
    Then User verify 'label download department' button in department page
    And User clicks on 'download' in department page
    
     And User clicks on 'view' icon in department page
    Then User verify 'view department header' in department page
    Then User verify 'label department name' in department page
    Then User verify 'label department code' in department page
    Then User verify 'label view site Tab' in department page
    Then User verify 'label department description' in department page
    And User clicks on 'department tab' in department page
    
     And User selects 'description option' as 'search option' in department page
    Then User enters 'text description department' in 'search' field of department page
    And User verify 'text description' in row 2 column 2 in department page
    
    And User selects 'department name option' as 'search option' in department page
    Then User enters 'text department name' in 'search' field of department page
    And User clicks on 'delete icon' in department page
    Then User verify 'confirm your delete' in department page
    Then User verify 'delete' button in department page
    And User clicks on 'delete' button in department page
   Then User verify 'department delete message' in department page
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
