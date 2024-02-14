@regression @tags
Feature: Tags functionality

  Scenario: 1_verify Tags create, update and delete functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'tags tab' in tag page
    And User clicks on 'tags tab' in tag page
    And User verify 'tag list' in tag page
    Then User verify 'new tag' in tag page
    And User verifies 'tag list table column headers' in tag page
    Then User verify 'search option default value' in tag page
    Then User verify 'table filter default value' in tag page
    Then User verify 'reset filter' button in tag page
    Then User verify 'download' button in tag page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in tag list table of tag page
    
    And User clicks on 'new tag' in tag page
    Then User verify 'label tag name' in tag page
    Then User verify 'label tag code' in tag page
    Then User verify 'label tag description' in tag page
    Then User verify 'label department' in tag page
    Then User verify 'cancel' button in tag page
    Then User verify 'save button' in tag page
    And User clicks on 'save' button in tag page    
    Then User verify 'warning message tag name required' in tag page
    Then User verify 'warning message tag code required' in tag page
    Then User verify 'warning message department required' in tag page
    Then User enters 'text more than five characters tag code' in 'tag code' field of tag page
    And User clicks on 'save' button in tag page    
    Then User verify 'warning message tag code more than 5 characters' in tag page
    Then User enters 'text special characters tag code' in 'tag code' field of tag page
    And User clicks on 'save' button in tag page 
    Then User verify 'warning message tag code for special characters' in tag page    
    And User clicks on 'cancel' button in tag page
    
    And User clicks on 'new tag' in tag page
    Then User verify 'label tag name' in tag page
    Then User enters 'text tag name' in 'tag name' field of tag page
    Then User enters 'text tag code' in 'tag code' field of tag page
    Then User enters 'text tag description' in 'tag description' field of tag page
    And User selects 'text tag department' as 'department' in tag page
    And User clicks on 'save' button in tag page
    Then User verify 'tag created successfully message' in tag page
    
    Then User verify 'reset filter' button in tag page
    Then User verify 'search option default value' in tag page
    And User selects 'name option' as 'search option' in tag page
    Then User enters 'text tag name' in 'search' field of tag page
    Then User verify 'txt_tag_list_table_data' in row 1 of tag page
    Then User verify 'txt_tag_list_table_data' in row 1 of tag page
    And User selects 'option active' as 'table filter' in tag page
    Then User verify only 'active' tag records will display
    And User selects 'option inactive' as 'table filter' in tag page
    Then User clicks on 'reset filter' button in tag page
    Then User verify 'table filter default value' in tag page  
    And User selects 'code option' as 'search option' in tag page
    Then User enters 'text tag code' in 'search' field of tag page
    And User verify 'text tag code' in row 1 column 2 in tag page
    And User clicks on 'reset filter' button in tag page
    And User selects 'description option' as 'search option' in tag page
    Then User enters 'text tag description' in 'search' field of tag page
    And User verify 'text tag description' in row 1 column 3 in tag page
    And User clicks on 'reset filter' button in tag page
    And User selects 'department option' as 'search option' in tag page
    Then User enters 'text tag department' in 'search' field of tag page
    And User verify 'text tag department' in row 1 column 4 in tag page
    And User clicks on 'reset filter' button in tag page
    Then User verify 'search option default value' in tag page
    Then User verify 'table filter default value' in tag page
    
    And User clicks on 'new tag' in tag page
    Then User enters 'text tag name' in 'tag name' field of tag page
    Then User enters 'text tag code' in 'tag code' field of tag page
    Then User enters 'text tag description' in 'tag description' field of tag page
    And User selects 'text tag department' as 'department' in tag page
    And User clicks on 'save' button in tag page
   # Then User verify 'tag name already exists message' in tag page
    And User clicks on 'cancel' button in tag page
    
    And User clicks on 'edit' icon in tag page
    Then User verify 'edit tag header' in tag page
    Then User verify 'label tag name' in tag page
    Then User verify 'label tag code' in tag page
    Then User verify 'label tag description' in tag page
    Then User verify 'label department' in tag page
    And User clicks on 'cancel' button in tag page
    
    And User clicks on 'edit' icon in tag page
    Then User verify 'edit tag header' in tag page
    Then User verify 'label tag name' in tag page
    Then User enters 'text edit tag code' in 'tag code' field of tag page
    And User clicks on 'update' button in tag page
    Then User verify 'tag updated successfully message' in tag page
    Then User verify 'search option default value' in tag page
    And User selects 'name option' as 'search option' in tag page
    Then User enters 'text tag name' in 'search' field of tag page
    Then User verify 'txt_update_tag_table_data' in row 1 of tag page
    
    And User clicks on 'delete icon' in tag page
    Then User verify 'confirm you delete' in tag page
    Then User verify 'delete' button in tag page
    And User clicks on 'delete' button in tag page
    Then User verify 'tag deleted successfully message' in tag page
    Then User verify 'reset filter' button in tag page  
    And User selects 'name option' as 'search option' in tag page
    Then User enters 'text tag name' in 'search' field of tag page  
    Then User verify 'no rows' in tag page
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
