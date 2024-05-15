@regression @usergroup
Feature: User Group screen functionality
 
 @usergroup
 Scenario: 1_verify User Group page functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'user group' in user group page
    And User clicks on 'user group' in user group page
    And User verify 'user group list tab' in user group page
    Then User verify 'new user group' in user group page
    And User verifies 'user group list table column headers' in user group page
    #Then User verify 'search option default value' in user group page
    #Then User verify 'table filter default value' in user group page
    #Then User verify 'reset filter' button in user group page
    #Then User verify 'download' button in user group page
    #Then User verify "10" displayed in pagination field
    #Then User verify "previous page" arrow is "disabled" in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in user group table user group page
    
    #And User clicks on 'new user group' in user group page
    #Then User verify 'label name' in user group page
    #Then User verify 'label description' in user group page
    #Then User verify 'add users link' in user group page
    #Then User verify 'add user group link' in user group page
    #Then User verify 'add privileges link' in user group page
    #And User clicks on 'add users' button in user group page
    #And User verifies 'add users table column headers' in user group page    
    #Then User verify 'add users' button in user group page
    #Then User verify 'clear' button in user group page
    #Then User verify "10" displayed in pagination field
    #Then User verify "previous page" arrow is "disabled" in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in user group table user group page
    #Then User clicks on 'add user cancel' button in user group page
    #
    #And User clicks on 'add user group' button in user group page
    #And User verifies 'add user group table column headers' in user group page    
    #Then User verify 'add user group' button in user group page
    #Then User verify 'clear' button in user group page
    #Then User verify "10" displayed in pagination field
    #Then User verify "previous page" arrow is "disabled" in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in user group table user group page
    #Then User clicks on 'add user group cancel' button in user group page
   #
    #And User clicks on 'add privileges' button in user group page
    #And User verifies 'add privileges group table column headers' in user group page    
    #Then User verify 'add privileges' button in user group page
    #Then User verify 'clear' button in user group page
    #Then User verify "10" displayed in pagination field
    #Then User verify "previous page" arrow is "disabled" in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in user group table user group page
    #Then User clicks on 'add privileges cancel' button in user group page 
   #
    #Then User verify 'cancel' button in user group page
    #Then User verify 'save button' in user group page  
    #And User clicks on 'save' button in user group page    
    #Then User verify 'warning message name is required field' in user group page
    #Then User verify 'warning message description is required field' in user group page
    #Then User verify 'warning message at least one user is required' in user group page
    #Then User verify 'warning message at least one user group is required' in user group page
    #Then User verify 'warning message at least one privilege is required' in user group page
    #And User clicks on 'cancel' button in user group page
    			    	
    #And User clicks on 'new user group' in user group page
    #Then User verify 'label name' in user group page
    #Then User enters 'text user group name' in 'name' field of user group page
    #Then User enters 'text user group description' in 'description' field of user group page
    #And User clicks on 'add users link' button in user group page
    #And User enters 'full name' in 'add user' field of user group page
    #And User clicks on 'select all row check box' button in user group page  
    #Then User clicks on '1' and '0' check box in user group page
    #And User clicks on 'add users' button in user group page  
    #And User clicks on 'add user group link' button in user group page
    #Then User clicks on '0' and '0' check box in user group page
    #And User clicks on 'add user group' button in user group page
    #And User clicks on 'add privileges link' button in user group page
    #Then User clicks on '0' and '1' check box in user group page
    #And User clicks on 'add privileges' button in user group page
    #And User clicks on 'save' button in user group page  
    #Then User verify 'user group created successfully message' in user group page
    
    #Then User verify 'reset filter' button in user group page
    #Then User verify 'text_user_group_table_data' in row 1 of user group page
    #And User selects 'option active' as 'table filter' in user group page
    #Then User verify only 'active' user group records will display
    #And User selects 'option inactive' as 'table filter' in user group page
    #Then User clicks on 'reset filter' button in user group page
    #Then User verify 'table filter default value' in user group page
    #Then User verify 'search option default value' in user group page
    #And User selects 'user group name option' as 'search option' in user group page
    #Then User enters 'text user group name' in 'search' field of user group page
    #And User verify 'text user group name' in row 1 column 1 in user group page
    #And User clicks on 'reset filter' button in user group page
    #Then User verify 'search option default value' in user group page 
    #And User selects 'user group description option' as 'search option' in user group page 
    #Then User enters 'text user group description' in 'search' field of user group page
    #And User verify 'text user group description' in row 1 column 2 in user group page  
    #And User clicks on 'reset filter' button in user group page
    #Then User verify 'search option default value' in user group page
    #Then User verify 'table filter default value' in user group page
    #
    #And User clicks on 'new user group' in user group page
    #Then User verify 'label name' in user group page
    #Then User enters 'text user group name' in 'name' field of user group page
    #Then User enters 'text user group description' in 'description' field of user group page
    #And User clicks on 'add users link' button in user group page
    #And User enters 'full name' in 'add user' field of user group page
    #And User clicks on 'select all row check box' button in user group page  
    #Then User clicks on '1' and '1' check box in user group page
    #And User clicks on 'add users' button in user group page  
    #And User clicks on 'add users link' button in user group page
    #Then User clicks on '0' and '1' check box in user group page
    #And User clicks on 'add user group' button in user group page
    #And User clicks on 'add privileges link' button in user group page
    #Then User clicks on '0' and '1' check box in user group page
    #And User clicks on 'add privileges' button in user group page
    #And User clicks on 'save' button in user group page  
    #Then User verify 'user group already present message' in user group page
    #
    #And User clicks on 'edit' icon in user group page
    #Then User verify 'edit user group header' in user group page
    #Then User verify 'label name' in user group page
    #Then User verify 'label description' in user group page
    #Then User verify 'view/edit users link' in user group page
    #Then User verify 'view/edit user group link' in user group page
    #Then User verify 'view/edit privileges link' in user group page
    #Then User verify 'cancel' button in user group page
    #Then User verify 'update' in user group page   
    #And User clicks on 'cancel' button in user group page
#
 		And User clicks on 'edit' icon in user group page
    Then User verify 'edit user group header' in user group page
    Then User verify 'label name' in user group page
    And User enters 'text edit user group description' in 'description' field of user group page
    And User clicks on 'update' button in user group page  
    Then User verify 'user group updated successfully message' in user group page
    
    And User clicks on 'delete icon' in user group page
    Then User verify 'confirm you delete' in user group page
    Then User verify 'delete' button in user group page
    And User clicks on 'delete' button in user group page
    Then User verify 'user group delete message' in user group page

    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'