@regression @activities
Feature: Activities screen functionality

  Scenario: 1_verify Activities page functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'activities tab' in activities page
    And User clicks on 'activities tab' in activities page
    And User verify 'activities list' in activities page
    Then User verify 'new activity' in activities page
    And User verifies 'activities list table column headers' in activities page
    Then User verify 'search option default value' in activities page
    Then User verify 'table filter default value' in activities page
    Then User verify 'reset filter' button in activities page
    Then User verify 'download' button in activities page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in activites table activities page
    
    And User clicks on 'new activity' in activities page
    Then User verify 'label name' in activities page
    Then User verify 'label description' in activities page
    Then User verify 'label meaning of signature' in activities page
    Then User verify 'label electronic signature' in activities page
    Then User verify 'label comments' in activities page
    Then User verify 'label yes in electronic signature' in activities page
    Then User verify 'label no in electronic signature' in activities page
    Then User verify 'label yes in comments' in activities page
    Then User verify 'label no in comments' in activities page  
    Then User verify 'cancel' button in activities page
    Then User verify 'save button' in activities page  
    And User clicks on 'save' button in activities page    
    Then User verify 'warning message name required' in activities page
    Then User verify 'warning message description required' in activities page
    And User verify 'warning message meaning of signature required' in activities page
    And User clicks on 'cancel' button in activities page
    
    And User clicks on 'new activity' in activities page
    Then User verify 'label name' in activities page
    Then User enters 'text activity name' in 'name' field of activities page
    Then User enters 'text activity description' in 'description' field of activities page
    Then User enters 'text meaning of signature' in 'meaning of signature' field of activities page
    And User clicks on 'electronic signature yes' button in activities page
    Then User clicks on 'comments yes' button in activities page
    And User clicks on 'save' button
    Then User verify 'activity created successfully message' in activities page
    
    Then User verify 'reset filter' button in activities page
    Then User verify 'text_activity_table_data' in row 1 of activities page
    And User selects 'option active' as 'table filter' in activities page
    Then User verify only 'active' business unit records will display
    And User selects 'option inactive' as 'table filter' in activities page
    Then User clicks on 'reset filter' button in activities page
    Then User verify 'table filter default value' in activities page
    Then User verify 'search option default value' in activities page
    And User selects 'name option' as 'search option' in activities page
    Then User enters 'text activity name' in 'search' field of activities page
    And User verify 'text activity name' in row 1 column 1 in activities page
    And User clicks on 'reset filter' button in activities page
    And User selects 'description option' as 'search option' in activities page 
    Then User enters 'text activity description' in 'search' field of activities page
    And User verify 'text activity description' in row 1 column 2 in activities page
    And User clicks on 'reset filter' button in activities page
    And User selects 'meaning of signature option' as 'search option' in activities page   
    Then User enters 'text meaning of signature' in 'search' field of activities page
    And User verify 'text meaning of signature' in row 1 column 4 in activities page
    And User clicks on 'reset filter' button in activities page   
    Then User verify 'search option default value' in activities page
    Then User verify 'table filter default value' in activities page
    
    And User clicks on 'new activity' in activities page
    Then User verify 'label name' in activities page
    Then User enters 'text activity name' in 'name' field of activities page
    Then User enters 'text activity description' in 'description' field of activities page
    Then User enters 'text meaning of signature' in 'meaning of signature' field of activities page
    And User clicks on 'electronic signature yes' button in activities page
    Then User clicks on 'comments yes' button in activities page
    And User clicks on 'save' button
    Then User verify 'activity name is allready present message' in activities page
    And User clicks on 'cancel' button in activities page
    
    And User clicks on 'edit' icon in activities page
    Then User verify 'edit activities header' in activities page
    Then User verify 'label name' in activities page
    Then User verify 'label description' in activities page
    Then User verify 'label meaning signature' in activities page
    Then User verify 'label electronic signature' in activities page
    Then User verify 'label comments' in activities page
    Then User verify 'label yes in electronic signature' in activities page
    Then User verify 'label no in electronic signature' in activities page
    Then User verify 'label yes in comments' in activities page
    Then User verify 'label no in comments' in activities page  
    Then User verify 'cancel' button in activities page
    Then User verify 'update' button in activities page  
    And User clicks on 'cancel' button in activities page
    
    And User clicks on 'edit' icon in activities page
    Then User verify 'edit activities header' in activities page
    Then User verify 'label name' in activities page
    Then User enters 'text edit activity description' in 'description' field of activities page
    And User clicks on 'electronic signature no' button in activities page
    Then User clicks on 'comments no' button in activities page
    And User clicks on 'update' button in activities page
    Then User verify 'activity updated successfully message' in activities page
    Then User verify 'text_edit_activity_table_data' in row 1 of activities page
    
    And User clicks on 'delete icon' in activities page
    Then User verify 'confirm you delete' in activities page
    Then User verify 'delete' button in activities page
    And User clicks on 'delete' button in activities page
    Then User verify 'activities deleted message' in activities page
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
