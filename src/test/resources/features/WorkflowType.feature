@regression @workflowtype
Feature: Workflow Type screen functionality
 
 @workflowtype
 Scenario: 1_verify Workflow Type page functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'workflow type' in workflow type page
    And User clicks on 'workflow type' in workflow type page
    And User verify 'workflow type tab' in workflow type page
    Then User verify 'new workflow type' in workflow type page
    And User verifies 'workflow type table column headers' in workflow type page
    Then User verify 'search option default value' in workflow type page
    Then User verify 'table filter default value' in workflow type page
    Then User verify 'reset filter' button in workflow type page
    Then User verify 'download' button in workflow type page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in workflow type table workflow type page
    
    And User clicks on 'new workflow type' in workflow type page
    Then User verify 'label name' in workflow type page
    Then User verify 'label description' in workflow type page
    Then User verify 'label prefix' in workflow type page
    Then User verify 'label serial number length in digit' in workflow type page
    Then User verify 'label serial number start value' in workflow type page
    Then User verify 'label release condtions' in workflow type page
    Then User verify 'label workflow sequence' in workflow type page
    Then User verify 'label workflow activation required' in workflow type page
    Then User verify 'label associate documents' in workflow type page
    Then User verify 'label delete draft' in workflow type page
    Then User verify 'label serial' in workflow type page
    Then User verify 'label parallel' in workflow type page
    Then User verify 'label yes' in workflow type page
    Then User verify 'label no' in workflow type page   
    Then User verify 'label added lifecycle states' in workflow type page   
    Then User verify 'add life cycle state' button in workflow type page   
    Then User verify 'cancel' button in workflow type page
    Then User verify 'save button' in workflow type page  
    And User clicks on 'save' button in workflow type page    
    Then User verify 'warning message workflow type name is required' in workflow type page
    Then User verify 'warning message workflow type description is required' in workflow type page
    Then User verify 'warning message prefix is required' in workflow type page
    Then User verify 'warning message serial number start value is required' in workflow type page
    Then User verify 'warning message serial number length is required' in workflow type page
    Then User verify 'warning message please select workflow release condition' in workflow type page    
    And User clicks on 'cancel' button in workflow type page
    			
    And User clicks on 'new workflow type' in workflow type page
    Then User verify 'label name' in workflow type page
    And User clicks on 'add life cycle state' in workflow type page
    Then User verify 'label select lifecycle state' in workflow type page  
    Then User verify 'label select role' in workflow type page  
    Then User verify 'label select action/activity' in workflow type page  
    Then User verify 'label select checklist' in workflow type page  
    Then User verify 'label select notification type' in workflow type page  
    Then User verify 'label select print type' in workflow type page  
    Then User verify 'label select department' in workflow type page  
    Then User verify 'label meaning of signature' in workflow type page  
    Then User verify 'label minimum user count' in workflow type page  
    Then User verify 'label increment type' in workflow type page  
    Then User verify 'label sla/days' in workflow type page  
    Then User verify 'map' in workflow type page  
    Then User verify 'cancel' in workflow type page  
    And User clicks on 'add life cycle state cancel' button in workflow type page
    		
    And User clicks on 'new workflow type' in workflow type page
    Then User verify 'label name' in workflow type page
    Then User enters 'text workflow type name' in 'name' field of workflow type page
    Then User enters 'text workflow type description' in 'description' field of workflow type page
    Then User enters 'text workflow type prefix' in 'prefix' field of workflow type page
    Then User enters 'text wf serial number start value' in 'serial number start value' field of workflow type page
    Then User enters 'text wf serial number length' in 'serial number length in digit' field of workflow type page  
    And User selects 'manual option' as 'work flow release condition' in workflow type page  
    And User clicks on 'save' button in workflow type page  
    #Then User verify 'warning message added life cycle state required' in workflow type page
  	And User clicks on 'add life cycle state' in workflow type page
    Then User verify 'label select lifecycle state' in workflow type page    
    And User selects 0 index option in 'select life cycle state' in workflow type page
    Then User selects 0 index option in 'select role' in workflow type page
    Then User selects 0 index option in 'select department' in workflow type page
    Then User selects 0 index option in 'select action/activity' in workflow type page
    Then User selects 0 index option in 'select checklist' in workflow type page
    And User enters 'text worflow minimum user count' in 'minimum user count' field of workflow type page  
    Then User selects 0 index option in 'select notification type' in workflow type page
    Then User selects 0 index option in 'increment type' in workflow type page
    Then User selects 0 index option in 'select print type' in workflow type page
    And User enters 'text worflow sla/days' in 'sla/days' field of workflow type page  
    And User clicks on 'map' button in workflow type page  
    Then User clicks on 'save' button in workflow type page  
    Then User verify 'workflow type created successfully message' in workflow type page
    
    Then User verify 'reset filter' button in workflow type page
    Then User verify 'text_workflow_type_table_data' in row 1 of workflow type page
    And User selects 'option active' as 'table filter' in workflow type page
    Then User verify only 'active' workflow type records will display
    And User selects 'option inactive' as 'table filter' in workflow type page
    Then User clicks on 'reset filter' button in workflow type page
    Then User verify 'table filter default value' in workflow type page
    Then User verify 'search option default value' in workflow type page
    And User selects 'name option' as 'search option' in workflow type page
    Then User enters 'text workflow type name' in 'search' field of workflow type page
    And User verify 'text workflow type name' in row 1 column 1 in workflow type page
    And User clicks on 'reset filter' button in workflow type page
    Then User verify 'search option default value' in workflow type page 
    And User selects 'description option' as 'search option' in workflow type page 
    Then User enters 'text workflow type description' in 'search' field of workflow type page
    And User verify 'text workflow type description' in row 1 column 2 in workflow type page  
    And User clicks on 'reset filter' button in workflow type page
    Then User verify 'search option default value' in workflow type page
    Then User verify 'table filter default value' in workflow type page
    
    And User clicks on 'edit' icon in workflow type page
    Then User verify 'edit workflow type header' in workflow type page
    Then User verify 'label name' in workflow type page
    Then User verify 'label description' in workflow type page
    Then User verify 'label prefix' in workflow type page
    Then User verify 'label serial number length in digit' in workflow type page
    Then User verify 'label serial number start value' in workflow type page
    Then User verify 'label release condtions' in workflow type page
    Then User verify 'label workflow activation required' in workflow type page
    Then User verify 'label associate documents' in workflow type page
    Then User verify 'label delete draft' in workflow type page
    Then User verify 'label serial' in workflow type page
    Then User verify 'label parallel' in workflow type page
    Then User verify 'label yes' in workflow type page
    Then User verify 'label no' in workflow type page   
    Then User verify 'label added lifecycle states' in workflow type page   
    Then User verify 'add life cycle state' button in workflow type page   
    Then User verify 'cancel' button in workflow type page
    Then User verify 'update' in workflow type page   
    And User clicks on 'cancel' button in workflow type page
    
    And User clicks on 'edit' icon in workflow type page
    Then User verify 'edit workflow type header' in workflow type page
    Then User verify 'label name' in workflow type page
    Then User enters 'text edit workflow type description' in 'description' field of workflow type page   
    And User clicks on 'update' button in workflow type page  
    Then User verify 'workflow type updated successfully message' in workflow type page
    
    And User clicks on 'delete icon' in workflow type page
    Then User verify 'confirm you delete' in workflow type page
    Then User verify 'delete' button in workflow type page
    And User clicks on 'delete' button in workflow type page
    Then User verify 'workflow type delete message' in workflow type page

    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'