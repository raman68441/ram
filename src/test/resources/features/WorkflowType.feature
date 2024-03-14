 @regression @workflowtypes
Feature: Workflow Type screen functionality
 
 @workflowtypes
 Scenario: 1_verify Workflow Type page functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'system data fields types' in system data fields types page
    And User clicks on 'system data fields types' in system data fields types page
    And User verify 'system data fields type list tab' in system data fields types page
    Then User verify 'new system data field types' in system data fields types page
    And User verifies 'system data fields types table column headers' in system data fields types page
    Then User verify 'search option default value' in system data fields types page
    Then User verify 'table filter default value' in system data fields types page
    Then User verify 'reset filter' button in system data fields types page
    Then User verify 'download' button in system data fields types page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in system data fields types list table system data fields types page
    
    And User clicks on 'new system data field types' in system data fields types page
    Then User verify 'label name field' in system data fields types page
    Then User verify 'label data field type' in system data fields types page
    Then User verify 'cancel' button in system data fields types page
    Then User verify 'save button' in system data fields types page  
    And User clicks on 'save' button in system data fields types page    
    Then User verify 'warning message name is required' in system data fields types page
    Then User verify 'warning message data field type is required' in system data fields types page
    And User clicks on 'cancel' button in system data fields types page
    
    And User clicks on 'new system data field types' in system data fields types page
    Then User verify 'label name field' in system data fields types page
    Then User enters 'text system data fields types name' in 'name' field of system data fields types page
    And User selects 'list manager option' as 'data field type' in system data fields types page 
    And User clicks on 'save' button in system data fields types page  
    Then User verify 'warning message pick list is required' in system data fields types page
    Then User verify 'warning message pick list name is required' in system data fields types page
    Then User verify 'label select picklist' in system data fields types page
    Then User verify 'label pick list name' in system data fields types page  
    And User selects 0 index option in 'select pick list' in system data fields types page
    Then User selects 0 index option in 'pick list name' in system data fields types page
    And User clicks on 'save' button
    Then User verify 'system data field type created successfully message' in system data fields types page
    
    Then User verify 'reset filter' button in system data fields types page
    Then User verify 'text_system_field_type_table_data' in row 1 of system data fields types page
    And User selects 'option active' as 'table filter' in system data fields types page
    Then User verify only 'active' system data fields types records will display
    And User selects 'option inactive' as 'table filter' in system data fields types page
    Then User clicks on 'reset filter' button in system data fields types page
    Then User verify 'table filter default value' in system data fields types page
    Then User verify 'search option default value' in system data fields types page
    And User selects 'name option' as 'search option' in system data fields types page
    Then User enters 'text system data fields types name' in 'search' field of system data fields types page
    And User verify 'text data field type name' in row 1 column 1 in system data fields types page
    And User clicks on 'reset filter' button in system data fields types page
    Then User verify 'search option default value' in system data fields types page
    Then User verify 'table filter default value' in system data fields types page
    
    And User clicks on 'new system data field types' in system data fields types page
    Then User verify 'label name field' in system data fields types page
	  Then User enters 'text system data fields types name' in 'name' field of system data fields types page
    And User selects 'list manager option' as 'data field type' in system data fields types page 
    And User selects 0 index option in 'select pick list' in system data fields types page
    Then User selects 0 index option in 'pick list name' in system data fields types page
    And User clicks on 'save' button
    Then User verify 'system data field type already present message' in system data fields types page
    And User clicks on 'cancel' button in system data fields types page
    
    And User clicks on 'edit' icon in system data fields types page
    Then User verify 'edit system data fields types header' in system data fields types page
    Then User verify 'label name field' in system data fields types page
    Then User verify 'label data field type' in system data fields types page
    Then User verify 'label select picklist' in system data fields types page
    Then User verify 'label pick list name' in system data fields types page  
    Then User verify 'cancel' button in system data fields types page
    Then User verify 'update' in system data fields types page   
    And User clicks on 'cancel' button in system data fields types page
    
    And User clicks on 'edit' icon in system data fields types page
    Then User verify 'edit system data fields types header' in system data fields types page
    Then User verify 'label name field' in system data fields types page
    And User selects 1 index option in 'edit select pick list' in system data fields types page
    Then User selects 1 index option in 'edit pick list name' in system data fields types page
    And User clicks on 'update' button in system data fields types page  
    Then User verify 'system data field type updated successfully message' in system data fields types page
    
    And User clicks on 'delete icon' in system data fields types page
    Then User verify 'confirm you delete' in system data fields types page
    Then User verify 'delete' button in system data fields types page
    And User clicks on 'delete' button in system data fields types page
    Then User verify 'system data field type delete message' in system data fields types page

    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'