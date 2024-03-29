@regression @usercreation
Feature: Workflow Type screen functionality
 
 @usercreation
 Scenario: 1_verify user creation page functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'user creation' in user creation page
    And User clicks on 'user creation' in user creation page
    And User verify 'user list tab' in user creation page
    Then User verify 'create new user' in user creation page
    And User verifies 'user list table column headers' in user creation page
    Then User verify 'search option default value' in user creation page
    Then User verify 'table filter default value' in user creation page
    Then User verify 'reset filter' button in user creation page
    Then User verify 'download' button in user creation page
    Then User verify "previous page" arrow is "disabled" in pagination field
    Then User verify "10" displayed in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in user list table user creation page
		
    And User clicks on 'create new user' in user creation page
    Then User verify 'label name' in user creation page
    Then User verify 'label login id' in user creation page
    Then User verify 'label empoloyee number' in user creation page
    Then User verify 'label user type' in user creation page
    Then User verify 'label domain' in user creation page
    Then User verify 'label authentication type' in user creation page
    Then User verify 'label email address' in user creation page
    Then User verify 'label job title' in user creation page
    Then User verify 'label account status' in user creation page
    Then User verify 'label login status' in user creation page
    Then User verify 'add privileges' button in user creation page
    And User verify 'label is system admin' in user creation page
    Then User verify 'cancel' button in user creation page
    Then User verify 'save button' in user creation page  
        
    And User clicks on 'add privileges' button in user creation page   
    Then User verify 'select organisation option' in user creation page
    Then User verify 'select business unit option' in user creation page
    Then User verify 'select department option' in user creation page
    Then User verify 'select roles option' in user creation page
    Then User verify 'select user group option' in user creation page
    Then User verify 'select department view option' in user creation page
    Then User verify 'select department create option' in user creation page    
    And User clicks on 'add' button in user creation page    
    Then User verify 'warning message primary business unit is required' in user creation page
    Then User verify 'warning message primary department is required' in user creation page
    Then User verify 'warning message role is required' in user creation page
    Then User verify 'warning message user group is required' in user creation page
    And User clicks on 'add privileges cancel' button in user creation page
    And User clicks on 'cancel' button in user creation page
    
    			     
    Then User verify 'reset filter' button in user creation page
    And User selects 'option active' as 'table filter' in user creation page
    Then User verify only 'active' workflow type records will display
    And User selects 'option inactive' as 'table filter' in user creation page
    Then User clicks on 'reset filter' button in user creation page
    Then User verify 'table filter default value' in user creation page
    Then User verify 'search option default value' in user creation page
    And User selects 'name option' as 'search option' in user creation page
    Then User enters 'full name' in 'search' field of user creation page
    And User verify 'full name' in row 1 column 2 in user creation page
    And User clicks on 'reset filter' button in user creation page
    Then User verify 'search option default value' in user creation page 
    And User verify 'delete icon does not displayed' in user creation page 
        
    And User clicks on 'edit' icon in user creation page
    Then User verify 'edit user creation header' in user creation page
    Then User verify 'label name' in user creation page
    Then User verify 'label login id' in user creation page
    Then User verify 'label empoloyee number' in user creation page
    Then User verify 'label user type' in user creation page
    Then User verify 'label domain' in user creation page
    Then User verify 'label authentication type' in user creation page
    Then User verify 'label email address' in user creation page
    Then User verify 'label job title' in user creation page
    Then User verify 'label account status' in user creation page
    Then User verify 'label login status' in user creation page
    Then User verify 'add privileges' button in user creation page
    And User verify 'label is system admin' in user creation page
    Then User verify 'cancel' button in user creation page
    Then User verify 'update' in user creation page   
    And User clicks on 'cancel' button in user creation page
    
    And User clicks on 'view' icon in user creation page
    Then User verify 'view user creation header' in user creation page
    Then User verify 'label name' in user creation page
    Then User verify 'label login id' in user creation page
    Then User verify 'label empoloyee number' in user creation page
    Then User verify 'label user type' in user creation page
    Then User verify 'label domain' in user creation page
    Then User verify 'label authentication type' in user creation page
    Then User verify 'label email address' in user creation page
    Then User verify 'label job title' in user creation page
    Then User verify 'label account status' in user creation page
    Then User verify 'label login status' in user creation page
    Then User verify 'view edit added privileges' in user creation page
    And User clicks on 'view edit added privileges' icon in user creation page
    Then User verify 'view edit previleges header' in user creation page   
    And User verifies 'view edit privileges table column headers' in user creation page
    And User clicks on 'close' button in user creation page 
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'