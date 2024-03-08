@regression @role
Feature: Role functionality

@role1
  Scenario: 1_verify role create, update and delete functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'role tab' in role page
    And User clicks on 'role tab' in role page
    And User verify 'role list' in role page
    Then User verify 'new role' in role page
    #And User verifies 'role list table column headers' in role page
    #Then User verify 'search option default value' in role page
    #Then User verify 'table filter default value' in role page
    #Then User verify 'reset filter' button in role page
    #Then User verify 'download' button in role page
    #Then User verify "10" displayed in pagination field
    #Then User verify "previous page" arrow is "disabled" in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in role list table of role page
    
    And User clicks on 'new role' in role page
    Then User verify 'label name field' in role page
    #Then User verify 'label access level' in role page
    #Then User verify 'label description field' in role page
    #Then User verifies 'save button' is displayed in 'save button' field
    #Then User verifies 'cancel' is displayed in 'cancel button' field
    #Then User verify 'label selected users' in role page
    #Then User verify 'role details header' in role page
    #Then User verify 'privileges header' in role page
    #Then User verify 'select user' in role page
    #And User clicks on 'access level' in role page
    #Then User verify 'organisation option' in 'access level' drop down in role page
    #Then User verify 'business unit option' in 'access level' drop down in role page
    #Then User verify 'department option' in 'access level' drop down in role page
   #	And User clicks on 'role tab' in role page 
    #And User clicks on 'select user' button in role page 
    #
    #And User verifies 'select user table column headers' in role page
    #Then User verify 'select user' in role page
    #Then User verify 'add users' button in role page
    #Then User verifies 'cancel' is displayed in 'cancel button' field
    #Then User verify 'clear selected users' button in role page  
    #And User clicks on 'add users' button in role page 
    #Then User verify 'no user selected add message' in role page
        #And User clicks on 'cancel' button in role page  
  
    
    #Then User verifies 'save button' is displayed in 'save button' field
    #And User clicks on 'save' button
    #Then User verify 'warning message name required' in role page
    #Then User verify 'warning message description required' in role page
    #Then User verify 'warning message access level required' in role page 
    #Then User enters 'text role name' in 'name' field of role page
    #Then User enters 'text role description' in 'description' field of role page
    #And User selects 'organisation option' as 'access level' in role page
    #And User clicks on 'select user' button in role page 
    #And User clicks on 'select all row check box' button in role page 
    #And User clicks on 'add users' button in role page 
    #And User clicks on 'save' button    
    #Then User verify 'no role privileges selected message' in role page
    #And User clicks on 'cancel' button
    
    #And User verifies 'role list table column headers' in role page
    #And User clicks on 'new role' in role page
    Then User enters 'text role name' in 'name' field of role page
    Then User enters 'text role description' in 'description' field of role page
    And User selects 'organisation option' as 'access level' in role page
    And User clicks on 'select user' button in role page 
    Then User enters 'text select user name' in 'user search' field of role page
   	And User clicks on 'select all row check box' button in role page 
    And User clicks on 'add users' button in role page 
    And User clicks on 'next' button in role page 
    And User clicks on 'admin privilege' button in role page  
    Then User clicks on 'all rows' and 'all column' check box in role page
    And User clicks on 'back' in role page 
    And User clicks on 'save' button
    Then User verify 'role created successfully message' in role page
      
    Then User verify 'reset filter' button in role page
    Then User verify 'search option default value' in role page
    And User selects 'name option' as 'search option' in role page
    Then User enters 'text role name' in 'search' field of role page
    Then User verify 'txt_role_list_table_data' in row 1 of role page
    And User selects 'option active' as 'table filter' in role page
    Then User verify only 'active' role records will display
    And User selects 'option inactive' as 'table filter' in role page
    Then User clicks on 'reset filter' button in role page
   # Then User verify 'table filter default value' in role page  
    And User selects 'description option' as 'search option' in role page
    Then User enters 'text role description' in 'search' field of role page
    And User verify 'text role description' in row 1 column 3 in role page
    And User clicks on 'reset filter' button in role page
    Then User verify 'search option default value' in role page
    Then User verify 'table filter default value' in role page
    
    And User clicks on 'new role' in role page
    Then User enters 'text role name' in 'name' field of role page
    Then User enters 'text role description' in 'description' field of role page
    And User selects 'organisation option' as 'access level' in role page
    And User clicks on 'select user' button in role page 
    Then User enters 'text select user name' in 'select user search' field of role page
     And User clicks on 'select all row check box' button in role page 
    And User clicks on 'add users' button in role page 
    And User clicks on 'next' button in role page 
    And User clicks on 'admin' in role page 
    Then User clicks on 'all rows' and 'all column' check box in role page
    And User clicks on 'back' in role page 
    And User clicks on 'save' button in role page 
    And User clicks on 'save' button in role page
    Then User verify 'role name already exists message' in role page
    And User clicks on 'cancel' button in role page
    
    And User clicks on 'edit' icon in role page
    Then User verify 'edit role header' in role page
    Then User verify 'label name' in role page
    Then User verify 'label access level' in role page
    Then User verify 'label description' in role page
    Then User verify 'label department' in role page
    Then User verify 'cancel' button in role page
    Then User verify 'save button' in role page
    Then User verify 'cancel' button in role page
    Then User verify 'label selected users' in role page
    Then User verify 'role details header' in role page
    Then User verify 'privileges header' in role page
    Then User verify 'select user' in role page
    Then User verify 'label selected users' in role page
    And User clicks on 'cancel' button in role page
    
    And User clicks on 'edit' icon in role page
    Then User verify 'edit role header' in role page
    Then User verify 'label name' in role page
    Then User enters 'text edit role name' in 'name' field of role page
    And User clicks on 'update' button in role page
    Then User verify 'role updated successfully message' in role page
    Then User verify 'search option default value' in role page
    And User selects 'name option' as 'search option' in role page
    Then User enters 'text edit role name' in 'search' field of role page
    Then User verify 'txt_update_role_table_data' in row 1 of role page
    
    And User clicks on 'delete icon' in role page
    Then User verify 'confirm you delete' in role page
    Then User verify 'delete' button in role page
    And User clicks on 'delete' button in role page
    Then User verify 'role deleted successfully message' in role page
    Then User verify 'reset filter' button in role page  
    And User selects 'name option' as 'search option' in role page
    Then User enters 'text role name' in 'search' field of role page  
    Then User verify 'no rows' in role page
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
       
    Scenario: 2_verify privileges types from role screen
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'role tab' in role page
    And User clicks on 'role tab' in role page
    And User verify 'role list' in role page
    Then User verify 'new role' in role page
    #And User verifies 'role list table column headers' in role page
    Then User verify 'search option default value' in role page
    And User clicks on 'new role' in role page
    
    Then User enters 'text role name' in 'name' field of role page
    Then User enters 'text role description' in 'description' field of role page
    And User selects 'organisation option' as 'access level' in role page
    And User clicks on 'privileges' in role page 
    #And User verifies 'all privileges types' in the role page
    #And User verifies 'privileges column headers' in the role page
    And User clicks on 'dashboard privilege' button in role page 
    Then User verifies 'dashboard option names' in the role page    
    And User clicks on 'admin privilege' button in role page 
    Then User verifies 'admin option names' in the role page     
    And User clicks on 'config privilege' button in role page 
    Then User verifies 'config option names' in the role page   
    And User clicks on 'system privilege' button in role page 
    Then User verifies 'system option names' in the role page   
    And User clicks on 'task privilege' button in role page 
    Then User verifies 'task option names' in the role page
    And User clicks on 'workflow privilege' button in role page 
    Then User verifies 'workflow option names' in the role page
    And User clicks on 'repository privilege' button in role page 
    Then User verifies 'repository option names' in the role page
    And User clicks on 'template privilege' button in role page 
    Then User verifies 'template option names' in the role page
    And User clicks on 'document privilege' button in role page 
    Then User verifies 'document option names' in the role page
    And User clicks on 'reports privilege' button in role page 
    Then User verifies 'reports option names' in the role page
    And User clicks on 'cancel' button in role page 
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
     
    
   
    
    
      
    
