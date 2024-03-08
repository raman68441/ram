 @regression @systemdatafieldstypes
Feature: System data fields types screen functionality
 
 Scenario: 1_verify system data fields types page functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'checklist' in system data fields types page
    And User clicks on 'checklist' in system data fields types page
    And User verify 'checklist tab' in system data fields types page
    Then User verify 'new checklist' in system data fields types page
    And User verifies 'checklist table column headers' in system data fields types page
    Then User verify 'search option default value' in system data fields types page
    Then User verify 'table filter default value' in system data fields types page
    Then User verify 'reset filter' button in system data fields types page
    Then User verify 'download' button in system data fields types page
    Then User verify "100" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in system data fields types list table system data fields types page
    
    And User clicks on 'new checklist' in system data fields types page
    Then User verify 'label name' in system data fields types page
    Then User verify 'label description' in system data fields types page
    Then User verify 'label dependent on' in system data fields types page
    Then User verify 'label add checkpoint' in system data fields types page
    Then User verify 'label checkpoint and picklist categories' in system data fields types page
    Then User verify 'no rows' in system data fields types page
    Then User verify 'column header checkpoint name' in system data fields types page
    Then User verify 'column header id' in system data fields types page
    Then User verify 'cancel' button in system data fields types page
    Then User verify 'save button' in system data fields types page  
    And User clicks on 'save' button in system data fields types page    
    Then User verify 'warning message checklist name is a required field' in system data fields types page
    Then User verify 'warning message checklist description is a required field' in system data fields types page
    And User verify 'warning message at least one checkpoint is required' in system data fields types page
    And User clicks on 'cancel' button in system data fields types page
    
    And User clicks on 'new checklist' in system data fields types page
    Then User verify 'label name' in system data fields types page
    Then User enters 'text checklist name' in 'name' field of system data fields types page
    Then User enters 'text checklist description' in 'description' field of system data fields types page
    And User clicks on 'add checkpoint' button in system data fields types page
    Then User verify 'label add checkpoint' in system data fields types page
    Then User verify 'label enter checkpoint' in system data fields types page
    And User verify 'add table column button' in system data fields types page
    Then User verify 'added columns' in system data fields types page   
    Then User verify 'add' button in system data fields types page  
    And User clicks on 'add' button in system data fields types page
    Then User verify 'warning message checkpoint name is a required field' in system data fields types page
    Then User verify 'warning message atleast 1 column should be added' in system data fields types page
    And User clicks on 'add checkpoint cancel' button in system data fields types page
       
    And User clicks on 'add checkpoint' button in system data fields types page
    Then User verify 'label add checkpoint' in system data fields types page
    Then User enters 'text checkpoint name' in 'checkpoint name' field of system data fields types page
    And User clicks on 'add table column button' in system data fields types page
    Then User verify 'table column 1' in system data fields types page
    Then User verify 'remove' button in system data fields types page
    Then User verify 'apply' button in system data fields types page
    And User clicks on 'remove' button in system data fields types page
    And User clicks on 'add table column button' in system data fields types page
    Then User verify 'label select type' in system data fields types page
    And User verify 'label header name' in system data fields types page
    And User verify 'label enter string name' in system data fields types page
    And User selects 'constant string option' as 'select type' in system data fields types page 
    And User selects 'string and selection option' as 'select type' in system data fields types page 
    And User verify 'label enter selection value' in system data fields types page
    Then User enters 'text header name' in 'header name' field of system data fields types page
    And User enters 'text enter string name' in 'enter string name' field of system data fields types page
    And User selects 'label yes' as 'enter selection value' in system data fields types page 
    And User clicks on 'apply' button in system data fields types page 
    And User clicks on 'add' button in system data fields types page
    And User save 'id column' row 1 data in system data fields types page
    And User clicks on 'save' button
    Then User verify 'checklist has been added message' in system data fields types page
    
    Then User verify 'reset filter' button in system data fields types page
    Then User verify 'text_checklist_table_data' in row 1 of system data fields types page
    And User selects 'option active' as 'table filter' in system data fields types page
    Then User verify only 'active' checklist records will display
    And User selects 'option inactive' as 'table filter' in system data fields types page
    Then User clicks on 'reset filter' button in system data fields types page
    Then User verify 'table filter default value' in system data fields types page
    Then User verify 'search option default value' in system data fields types page
    And User selects 'name option' as 'search option' in system data fields types page
    Then User enters 'text checklist name' in 'search' field of system data fields types page
    And User verify 'text checklist name' in row 1 column 1 in system data fields types page
    And User clicks on 'reset filter' button in system data fields types page
    And User selects 'description option' as 'search option' in system data fields types page 
    Then User enters 'text checklist description' in 'search' field of system data fields types page
    And User verify 'text checklist description' in row 1 column 2 in system data fields types page
    And User clicks on 'reset filter' button in system data fields types page
    Then User verify 'search option default value' in system data fields types page
    Then User verify 'table filter default value' in system data fields types page
    
    And User clicks on 'new checklist' in system data fields types page
    Then User verify 'label name' in system data fields types page
    Then User enters 'text checklist name' in 'name' field of system data fields types page
    Then User enters 'text checklist description' in 'description' field of system data fields types page
		And User clicks on 'add checkpoint' button in system data fields types page
    Then User verify 'label add checkpoint' in system data fields types page
    Then User enters 'text checkpoint name' in 'checkpoint name' field of system data fields types page
    And User clicks on 'add table column button' in system data fields types page
    Then User verify 'table column 1' in system data fields types page
    And User selects 'string and selection option' as 'select type' in system data fields types page 
    And User verify 'label enter selection value' in system data fields types page
    Then User enters 'text header name' in 'header name' field of system data fields types page
    And User enters 'text enter string name' in 'enter string name' field of system data fields types page
    And User selects 'label yes' as 'enter selection value' in system data fields types page 
    And User clicks on 'apply' button in system data fields types page 
    And User clicks on 'add' button in system data fields types page
    And User save 'id column' row 1 data in system data fields types page
    And User clicks on 'save' button
    Then User verify 'checklist name is allready present message' in system data fields types page
    And User clicks on 'cancel' button in system data fields types page
    
    And User clicks on 'edit' icon in system data fields types page
    Then User verify 'edit checklist header' in system data fields types page
    Then User verify 'label name' in system data fields types page
    Then User verify 'label description' in system data fields types page
    Then User verify 'label dependent on' in system data fields types page
    Then User verify 'label add checkpoint' in system data fields types page
    Then User verify 'label checkpoint and picklist categories' in system data fields types page
    Then User verify 'update' button in system data fields types page  
    And User clicks on 'cancel' button in system data fields types page
    
    And User clicks on 'edit' icon in system data fields types page
    Then User verify 'edit checklist header' in system data fields types page
    Then User verify 'label name' in system data fields types page
    Then User enters 'text edit checklist description' in 'description' field of system data fields types page
    And User clicks on 'update' button in system data fields types page
    Then User verify 'checklist updated message' in system data fields types page
    Then User verify 'text_edit_checklist_table_data' in row 1 of system data fields types page
    
    And User clicks on 'delete icon' in system data fields types page
    Then User verify 'confirm you delete' in system data fields types page
    Then User verify 'delete' button in system data fields types page
    And User clicks on 'delete' button in system data fields types page
    Then User verify 'checklist deleted message' in system data fields types page

    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'