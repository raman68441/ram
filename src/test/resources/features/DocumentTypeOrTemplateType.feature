@regression @documentTypeTemplatetype
Feature: Document Type/Template Type screen functionality
 
 @documentTypeTemplatetype
 Scenario: 1_verify document type template type page functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'document type/template type' in document type template type page
    And User clicks on 'document type/template type' in document type template type page
    And User verify 'document type/template type list tab' in document type template type page
    Then User verify 'new document type/template type' in document type template type page
    And User verifies 'document type/template type list table column headers' in document type template type page
    Then User verify 'search option default value' in document type template type page
    Then User verify 'table filter default value' in document type template type page
    Then User verify 'reset filter' button in document type template type page
    Then User verify 'download' button in document type template type page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in document type template type list table of document type template type page
    
    And User clicks on 'new document type/template type' in document type template type page
    Then User verify 'all the tabs in document type' displayed in document type template type page  
    Then User verify 'label document type name' in document type template type page
    And User verify 'label description' in document type template type page
    Then User verify 'label numbering system' in document type template type page
    And User verify 'label default retention schedule' in document type template type page
    Then User verify 'label initial version' in document type template type page
    And User verify 'default format' button in document type template type page
    Then User verify 'template' button in document type template type page
    Then User verify 'external document' button in document type template type page
    And User verify 'label selected content default format' in document type template type page
    Then User verify 'label select status active' in document type template type page
    Then User verify 'label delete draft no' in document type template type page
    When User verify 'label selected location type manual' in document type template type page
    Then User verify 'active' button in document type template type page
    And User verify 'inactive' button in document type template type page
    Then User verify 'yes' button in document type template type page
    And User verify 'no' button in document type template type page
    Then User verify 'manual' radio button in document type template type page
    Then User verify 'auto' radio button in document type template type page
    And User verify 'save button' in document type template type page
    Then User verify 'next' button in document type template type page
    Then User verify 'cancel' button in document type template type page 
    
    And User clicks on 'template type' radio button in document type template type page
    Then User verify 'label template type name' in document type template type page
    And User verify 'label description' in document type template type page
    Then User verify 'label numbering system' in document type template type page
    And User verify 'label default retention schedule' in document type template type page
    Then User verify 'label initial version' in document type template type page
    And User verify 'default format' button in document type template type page
    Then User verify 'external document' button in document type template type page
    And User verify 'label selected content default format' in document type template type page
    Then User verify 'label select status active' in document type template type page
    Then User verify 'label delete draft no' in document type template type page
    When User verify 'label selected location type manual' in document type template type page
    Then User verify 'active' button in document type template type page
    And User verify 'inactive' button in document type template type page
    Then User verify 'yes' button in document type template type page
    And User verify 'no' button in document type template type page
    Then User verify 'manual' radio button in document type template type page
    Then User verify 'auto' radio button in document type template type page
    And User verify 'save button' in document type template type page
    Then User verify 'next' button in document type template type page
    Then User verify 'cancel' button in document type template type page 
    
    And User clicks on 'document type' radio button in document type template type page
    And User clicks on 'external document' button in document type template type page
    Then User verify 'label selected content external document' in document type template type page
    And User clicks on 'template' button in document type template type page
    Then User verify 'label selected content template' in document type template type page   
    And User clicks on 'default format' button in document type template type page
    And User verify 'label selected content default format' in document type template type page
    And User clicks on 'yes' button in document type template type page
    Then User verify 'label delete draft yes' in document type template type page
    And User clicks on 'no' button in document type template type page        
    Then User verify 'label delete draft no' in document type template type page
    And User clicks on 'inactive' button in document type template type page
    Then User verify 'label select status inactive' in document type template type page
    And User clicks on 'active' button in document type template type page
    Then User verify 'label select status active' in document type template type page
    And User clicks on 'auto' radio button in document type template type page 
    When User verify 'label selected location type auto' in document type template type page
    And User clicks on 'manual' radio button in document type template type page
    When User verify 'label selected location type manual' in document type template type page
    
    And User clicks on 'next' button in document type template type page
    Then User verify 'warning message document type name is required' in document type template type page
    Then User verify 'warning message document type description is required' in document type template type page
    Then User verify 'warning message please select numbering system' in document type template type page
    Then User verify 'warning message retention schedule is required' in document type template type page
    Then User verify 'warning message initial version is required' in document type template type page
    And User clicks on 'template type' radio button in document type template type page
    Then User verify 'label template type name' in document type template type page
    And User clicks on 'next' button in document type template type page
    Then User verify 'warning message template type name is required' in document type template type page
    Then User verify 'warning message template type description is required' in document type template type page   
    And User clicks on 'cancel' button in document type template type page
    
    And User clicks on 'new document type/template type' in document type template type page
    Then User enters 'text document type name' in 'name' field of document type template type page
    Then User enters 'text document type description' in 'description' field of document type template type page
    And User selects 0 index option in 'select numbering system' in document type template type page
    Then User enters 'text retention schedule days' in 'retention schedule' field of document type template type page
    Then User enters 'text document type initial version' in 'initial version' field of document type template type page
    And User clicks on 'next' button in document type template type page
    
    And User verify 'label select system data field' in document type template type page
    And User verify 'back' button in document type template type page
    Then User verify 'next' button in document type template type page
    Then User verify 'save button' button in document type template type page   
    Then User verify 'cancel' button in document type template type page 
    Then User verify 'add' button in document type template type page   
    And User clicks on 'next' button in document type template type page
    Then User verify 'warning message please add atleast one system data field' in document type template type page
    And User selects 0 index option in 'select system data field' in document type template type page
    And User clicks on 'add' button in document type template type page
    Then User clicks on 'next' button in document type template type page
    
    And User verify 'label workflow type' in document type template type page
    And User verify 'back' button in document type template type page
    Then User verify 'next' button in document type template type page
    Then User verify 'save button' button in document type template type page   
    Then User verify 'cancel' button in document type template type page 
    Then User verify 'add' button in document type template type page   
    And User clicks on 'next' button in document type template type page
    Then User verify 'warning message please add atleast one workflow type' in document type template type page
    And User selects 0 index option in 'select workflow type field' in document type template type page
    And User clicks on 'add' button in document type template type page
    Then User clicks on 'next' button in document type template type page
    
    And User verify 'label review period duration' in document type template type page
    Then User verify 'label prior reminder starts from in days' in document type template type page
    And User verify 'label reminder recurrence schedule in daily' in document type template type page
    Then User verify 'label review period applicable yes' in document type template type page
    And User verify 'label review period duration days' in document type template type page
    Then User verify 'label prior reminder starts from days' in document type template type page
    And User verify 'label reminder recurrence schedule' in document type template type page
    Then User verify 'yes' button in document type template type page
    And User verify 'no' button in document type template type page
    Then User verify 'days' button in document type template type page
    And User verify 'months' button in document type template type page
    And User verify 'weeks' button in document type template type page
    Then User verify 'daily' check box in document type template type page
    And User verify 'weekly' check box in document type template type page
    Then User verify 'monthly' check box in document type template type page
    And User verify 'back' button in document type template type page
    Then User verify 'next' button in document type template type page
    Then User clicks on 'next' button in document type template type page
    Then User verify 'warning message review period duration is required' in document type template type page
    Then User verify 'warning message prior reminder is required' in document type template type page
    Then User verify 'warning message reminder recurrence schedule is required' in document type template type page
    And User verify 'save button' button in document type template type page   
    Then User verify 'cancel' button in document type template type page 
    Then User enters 'text review period duration' in 'review period duration' field of document type template type page
    And User enters 'text prior reminder starts from' in 'prior reminder starts from' field of document type template type page
    Then User enters 'text reminder recurrence schedule' in 'reminder recurrence schedule' field of document type template type page
    Then User clicks on 'next' button in document type template type page
    
    And User verify 'label notification users list' in document type template type page
    Then User verify 'label notification departments list' in document type template type page
    And User verify 'label notification groups list' in document type template type page
    Then User verify 'label notification roles list' in document type template type page
    And User verify 'back' button in document type template type page
    And User verify 'save button' button in document type template type page   
    Then User verify 'cancel' button in document type template type page 
    And User selects 0 index option in 'notification users list' in document type template type page
    Then User selects 0 index option in 'notification departments list' in document type template type page
    And User selects 0 index option in 'notification groups list' in document type template type page
    Then User selects 0 index option in 'notification roles list' in document type template type page
    Then User clicks on 'save' in document type template type page
 		Then User verify 'document type created successfully message' in document type template type page
    
    Then User verify 'reset filter' button in document type template type page
    Then User verify 'text_document_type_table_data' in row 1 of document type template type page
    And User selects 'option active' as 'table filter' in document type template type page
    Then User verify only 'active' workflow type records will display
    And User selects 'option inactive' as 'table filter' in document type template type page
    Then User clicks on 'reset filter' button in document type template type page
    Then User verify 'table filter default value' in document type template type page
    Then User verify 'search option default value' in document type template type page
    And User selects 'description option' as 'search option' in document type template type page 
    Then User enters 'text document type description' in 'search' field of document type template type page
    And User verify 'text document type description' in row 1 column 2 in document type template type page      
    And User selects 'name option' as 'search option' in document type template type page
    Then User enters 'text document type name' in 'search' field of document type template type page
    And User verify 'text document type name' in row 1 column 1 in document type template type page
    And User clicks on 'reset filter' button in document type template type page
    Then User verify 'search option default value' in document type template type page 
    And User selects 'description option' as 'search option' in document type template type page 
    Then User enters 'text document type description' in 'search' field of document type template type page
    And User verify 'text document type description' in row 1 column 2 in document type template type page  
    And User clicks on 'reset filter' button in document type template type page
    Then User verify 'search option default value' in document type template type page
    Then User verify 'table filter default value' in document type template type page
    
    And User clicks on 'edit' icon in document type template type page
    Then User verify 'edit docuement type/template type header' in document type template type page
    Then User verify 'label document type name' in document type template type page
    And User verify 'label description' in document type template type page
    Then User enters 'text document type description1' in 'description' field of document type template type page
    And User clicks on 'update' button in document type template type page  
    Then User verify 'document type updated successfully message' in document type template type page
    
    And User selects 'description option' as 'search option' in document type template type page 
    Then User enters 'text document type description1' in 'search' field of document type template type page
    And User verify 'text document type description1' in row 1 column 2 in document type template type page  
    And User clicks on 'view' icon in document type template type page
    Then User verify 'view docuement type/template type header' in document type template type page
    And User clicks on 'back arrow' in document type template type page  
     
     And User selects 'description option' as 'search option' in document type template type page 
    Then User enters 'text document type description1' in 'search' field of document type template type page
    And User verify 'text document type description1' in row 1 column 2 in document type template type page    
    And User clicks on 'delete icon' in document type template type page
    Then User verify 'confirm you delete' in document type template type page
    Then User verify 'delete' button in document type template type page
    And User clicks on 'delete' button in document type template type page
    Then User verify 'document type deleted successfully message' in document type template type page

    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'