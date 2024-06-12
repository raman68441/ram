@regression @task
Feature: Task functionality

  @audit1
  Scenario: 1_verify all the fields in task page
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'task' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    And User verify 'my task tab' in task page
    Then User verify 'assign task tab' in task page
    And User verify 'completed task tab' in task page
    Then User verify 'cancelled task tab' in task page
    And User clicks on 'my task tab' in task page
    Then User verify 'label next up' in task page
    And User verify 'label in progress' in task page
    Then User verify 'label completed' in task page
    
    #And User clicks on 'assign task tab' in task page
    #Then User verify 'assign by me tab' in task page
    #And User verify 'assign new task tab' in task page
    #And User verifies 'assign by me task table column headers' in task page
    #Then User verify 'search option default value' in task page
    #Then User verify 'table filter default value' in task page
    #Then User verify 'reset filter' button in task page
    #Then User verify 'download' button in task page
    #Then User verify "10" displayed in pagination field
    #Then User verify "previous page" arrow is "disabled" in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in task table task page
    #
    #And User clicks on 'assign new task tab' in task page
    #Then User verify 'label task type' in task page
    #And User verify 'label assigne' in task page
    #Then User verify 'label target date' in task page
    #And User verify 'label description' in task page
    #Then User verify 'label attached file' in task page
    #And User verify ' label drag and drop files here or click to select files' in task page
    #And User clicks on 'task type' in task page
    #Then User verify 'general option' in 'select task type' drop down in task page
    #Then User verify 'document option' in 'select task type' drop down in task page   
    #Then User verify 'cancel' button in task page
    #Then User verify 'assign' button in task page
    #And User clicks on 'assign' button in task page 
    #Then User verify 'warning message task type required' in task page
    #Then User verify 'warning message description required' in task page
    #And User verify 'warning message assignee required' in task page     
    #And User clicks on 'cancel' button in task page  
    #
    #And User clicks on 'assign new task tab' in task page
    #Then User selects 'general option' as 'select task type' in task page 
    #And User selects 'Jayalakshmi Hegde' as 'assignee' in task page    
    #Then User enters 'text task description' in 'description' field of task page
    #And User clicks on 'assign' button in task page 
    #Then User verify 'task assigned successfully message' in task page
    #
    #Then User verify 'reset filter' button in task page
    #Then User verify 'text_assing_task_table_data' in row 1 of task page
    #And User selects 'option active' as 'table filter' in task page
    #Then User verify only 'active' business unit records will display
    #And User selects 'option inactive' as 'table filter' in task page
    #Then User clicks on 'reset filter' button in task page
    #Then User verify 'table filter default value' in task page
    #Then User verify 'search option default value' in task page
    #And User selects 'name option' as 'search option' in task page
    #Then User enters 'text activity name' in 'search' field of task page
    #And User verify 'text activity name' in row 1 column 1 in task page
    #And User clicks on 'reset filter' button in task page
    #And User selects 'task type option' as 'search option' in task page 
    #Then User enters 'general option' in 'search' field of task page
    #And User verify 'general option' in row 1 column 2 in task page
    #And User clicks on 'reset filter' button in task page
    #And User selects 'task id' as 'search option' in task page   
    #Then User enters 'task id' in 'search' field of task page
    #And User verify 'task id' in row 1 column 4 in task page
    #And User clicks on 'reset filter' button in task page   
    #Then User verify 'search option default value' in task page
    #Then User verify 'table filter default value' in task page
    #
    #
    #
    #And User clicks on 'edit' icon in task page
    #Then User verify 'edit task header' in task page
    #Then User verify 'label task type' in task page
    #And User verify 'label assignee' in task page
    #Then User verify 'label target date' in task page
    #And User verify 'label description' in task page
    #Then User verify 'label attached file' in task page
    #And User verify ' label drag and drop files here or click to select files' in task page
   #Then User verify 'label attached file' in task page
   #Then User verify 'comments tab' in task page
    #Then User verify 'history tab' in task page
    #Then User verify 'cancel' button in task page
    #Then User verify 'update' button in task page  
    #And User clicks on 'cancel' button in task page
    #
    #And User clicks on 'edit' icon in task page
    #Then User verify 'edit task header' in task page
     #And User clicks on 'history' button in task page  
     #Then User verify 'task history data' in task page
    #Then User verify 'label task type' in task page
    #Then User enters 'text edit task description' in 'description' field of task page
     #And User clicks on 'update' button in task page
    #Then User verify 'taskl updated successfully message' in task page
    #Then User verify 'text_edit_task_table_data' in row 1 of task page
    #
    #And User clicks on 'delete icon' in task page
    #Then User verify 'confirm you delete' in task page
    #Then User verify 'delete' button in task page
    #And User clicks on 'delete' button in task page
    #Then User verify 'task deleted message' in task page
    #
    #Then User clicks on 'logged in user drop down'
    #And User verifies 'logout option name' is displayed in 'logout' field
    #Then User clicks on 'logout option'
    #
    #
    #
    #
      #
     #
     #
     #
    #
     #
     