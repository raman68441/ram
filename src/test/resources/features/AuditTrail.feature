@regression @auditTrail
Feature: Audit Trail functionality

  @audit1
  Scenario: 1_verify all the fields in audit trail page
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User verify 'label audit trail' in audit trail page
    Then User verify 'label select category name' in audit trail page
    Then User verify 'label select event' in audit trail page
    Then User verify 'label start date' in audit trail page
    Then User verify 'label end date' in audit trail page
    Then User verify 'label select user' in audit trail page
    Then User verify 'label select condition' in audit trail page
    Then User verify 'label enter name' in audit trail page
    Then User verify 'label show identification id' in audit trail page
    Then User verify 'label all day' in audit trail page
    Then User verify 'label or' in audit trail page
    Then User verify 'label generate' in audit trail page
    Then User verify 'label add new event category' in audit trail page
    Then User verify 'label reset all filters' in audit trail page
    Then User verify 'label remove added event category' in audit trail page
    Then User verify 'label download' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    Then User verify 'add new event category' button is 'disabled' in audit trail page
    Then User verify 'reset all filters' button is 'disabled' in audit trail page
    Then User verify 'remove added event category' button is 'disabled' in audit trail page
    Then User verify 'download' button is 'disabled' in audit trail page
    And User clicks on 'select category name' in audit trail page
    Then User verify 'login option' in 'select category name' drop down in audit trail page
    Then User verify 'system data fields types option' in 'select category name' drop down in audit trail page
    Then User verify 'life cycle states option' in 'select category name' drop down in audit trail page
    Then User verify 'list manager option' in 'select category name' drop down in audit trail page
    Then User verify 'document type option' in 'select category name' drop down in audit trail page
    Then User verify 'constant string option' in 'select category name' drop down in audit trail page
    Then User verify 'year option' in 'select category name' drop down in audit trail page
    Then User verify 'organisation option' in 'select category name' drop down in audit trail page
    And User clicks on 'select event' in audit trail page
    Then User verify 'created option' in 'select event' drop down in audit trail page
    Then User verify 'updated option' in 'select event' drop down in audit trail page
    Then User verify 'deleted option' in 'select event' drop down in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit1
  Scenario: 2_generate login audit trail with current date and validate data and functionality of audit trail
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verifies 'login audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify login tab 'txt_audit_trail_login_data' in audit trail row 1
    When User clicks on 'reset all filters' in audit trail page
    Then User verify 'login tab' not displayed in audit trail page
    Then User verify "" in 'category name' field in audit trail page
    Then User verify "" in 'user' field in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    Then User verify 'generate' button is 'enabled' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    And User clicks on 'remove added event category' in audit trail page
    Then User verify 'remove event category header' in audit trail page
    Then User verify 'select category header' in audit trail page
    Then User verify 'cancel' button in audit trail page
    And User clicks on 'cancel' in audit trail page
    And User clicks on 'remove added event category' in audit trail page
    Then User verify 'remove event category header' in audit trail page
    And User clicks on 'remove login' checkbox in audit trail page
    And User clicks on 'remove' button in audit trail page
    Then User verify 'login tab' not displayed in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit1
  Scenario: 3_generate login audit trail with current date,without identification id and validate data and functionality of audit trail
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verifies 'login audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify login tab 'txt_audit_trail_login_data_without_identificationId' in audit trail row 1
    When User clicks on 'reset all filters' in audit trail page
    Then User verify 'login tab' not displayed in audit trail page
    Then User verify "" in 'category name' field in audit trail page
    Then User verify "" in 'user' field in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    Then User verify 'generate' button is 'enabled' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verify login tab 'txt_audit_trail_login_data' in audit trail row 1
    And User clicks on 'remove added event category' in audit trail page
    Then User verify 'remove event category header' in audit trail page
    Then User verify 'select category header' in audit trail page
    Then User verify 'cancel' button in audit trail page
    And User clicks on 'cancel' in audit trail page
    And User clicks on 'remove added event category' in audit trail page
    Then User verify 'remove event category header' in audit trail page
    And User clicks on 'remove login' checkbox in audit trail page
    And User clicks on 'remove' button in audit trail page
    Then User verify 'login tab' not displayed in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit1
  Scenario: 4_generate login audit trail for mentioned dates period and validate calender and audit trail functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    And User clicks on 'start date calender' icon in audit trail page
    Then User verify 'next month' arrow is 'disabled' in calender
    Then User verify 'current month year' in calender
    And User select '2023' as 'year' in calender
    And User select 'February' as 'month' in calender
    And User select 'February' as 'month' in calender
    And User select '12' as 'date' in calender
    Then User verify '02/12/2023' in 'start date' field of audit trail page
    And User clicks on 'end date calender' icon in audit trail page
    Then User verify 'next month' arrow is 'disabled' in calender
    Then User verify 'previous month' arrow is 'enabled' in calender
    Then User verify 'current month year' in calender
    And User select 'current date' as 'date' in calender
    Then User verify 'current date' in 'end date' field of audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verifies 'login audit trail table headers' in audit trail page
    Then User verify login tab 'txt_audit_trail_login_data' in audit trail row 1
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit1
  Scenario: 5_generate login audit trail for all day and validate pagination functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    And User selects 'All' as 'user' in audit trail page
    And User clicks on 'all day' checkbox in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verifies 'login audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify number of rows in table is 10 in audit trail page
    Then User selects "20" from pagination drop down
    And User verify number of rows in table is 20 in audit trail page
    Then User selects "30" from pagination drop down
    And User verify number of rows in table is 30 in audit trail page
    Then User selects "100" from pagination drop down
    And User verify number of rows in table is 100 in audit trail page
    Then User clicks on next page arrow till last page
    Then User verify "next page" arrow is "disabled" in pagination field
    Then User clicks on "previous page" pagination arrow
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit1
  Scenario: 6_verify add new event category audit trail functionality
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    And User selects 'All' as 'user' in audit trail page
    And User clicks on 'all day' checkbox in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    And User clicks on 'add new event category' button in audit trail page
    Then User verify 'add new event category header' in audit trail page
    Then User verify 'cancel' button in audit trail page
    Then User verify 'label add new event category generate' in audit trail page
    Then User verify 'label add new event select category name' in audit trail page
    Then User verify 'label add new event select event' in audit trail page
    Then User verify 'label add new event start date' in audit trail page
    Then User verify 'label add new event end date' in audit trail page
    Then User verify 'label add new event select user' in audit trail page
    Then User verify 'label add new event select condition' in audit trail page
    Then User verify 'label add new event enter name' in audit trail page
    Then User verify 'current date' in 'add new event start date' field of audit trail page
    Then User verify 'current date' in 'add new event end date' field of audit trail page
    And User clicks on 'cancel' button in audit trail page
    And User clicks on 'add new event category' button in audit trail page
    Then User verify 'add new event category header' in audit trail page
    And User clicks on 'add new event select category name' in audit trail page
    Then User verify 'login option' not displayed in audit trail page
    Then User verify 'system data fields types option' in 'select category name' drop down in audit trail page
    Then User verify 'life cycle states option' in 'select category name' drop down in audit trail page
    Then User verify 'list manager option' in 'select category name' drop down in audit trail page
    Then User verify 'document type option' in 'select category name' drop down in audit trail page
    Then User verify 'constant string option' in 'select category name' drop down in audit trail page
    Then User verify 'year option' in 'select category name' drop down in audit trail page
    Then User verify 'organisation option' in 'select category name' drop down in audit trail page
    And User clicks on 'add new event select category name' in audit trail page
    And User selects 'life cycle states option' as 'add new event category name' in audit trail page
    And User clicks on 'add new select event' in audit trail page
    Then User verify 'created option' in 'select event' drop down in audit trail page
    Then User verify 'updated option' in 'select event' drop down in audit trail page
    Then User verify 'deleted option' in 'select event' drop down in audit trail page
    And User clicks on 'add new select event' in audit trail page
    And User selects 'created option' as 'add new event' in audit trail page
    And User clicks on 'add new event all day' checkbox in audit trail page
    And User clicks on 'add new event category generate' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
    
    @audit1
  Scenario: 7_verify life cycle states create, update, delete functionality in audit tral
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'life cycle states tab' in life cycle states page
    And User clicks on 'life cycle states tab' in life cycle states page
    And User verify 'life cycle states list' in life cycle states page
    Then User verify 'new life cycle states' in life cycle states page
    And User verifies 'life cycle states table column headers' in life cycle states page
     And User clicks on 'new life cycle states' in life cycle states page
    Then User enters 'text life cycle state name' in 'name' field of life cycle states page
    Then User enters 'text life cycle state description' in 'description' field of life cycle states page
    And User clicks on 'save' button in life cycle states page
    Then User verify 'life cycle state create message' in life cycle states page
    Then User verify 'txt_lock_life_cycle_states_table_data' in row 1 of life cycle states page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'life cycle states option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User verifies 'create life cycle states audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify life cycle states audit tail table data 'txt_create_lock_life_cycle_states_auit_table_data' for 'create' event in row 1
   
    And User clicks on 'config' sidebar menu
    Then User verify 'life cycle states tab' in life cycle states page
    And User clicks on 'life cycle states tab' in life cycle states page
    And User verify 'life cycle states list' in life cycle states page
    Then User verify 'new life cycle states' in life cycle states page
    Then User enters 'text life cycle state name' in 'search' field of life cycle states page
   	Then User verify 'txt_lock_life_cycle_states_table_data' in row 1 of life cycle states page
   And User clicks on 'edit' icon in life cycle states page
    Then User verify 'edit life cycle states header' in life cycle states page
    Then User verify 'label name' in life cycle states page
    Then User verify 'label description' in life cycle states page
    Then User enters 'text edit life cycle state description' in 'description' field of life cycle states page
    And User clicks on 'update' button in life cycle states page
    Then User verify 'life cycle state updated successfully message' in life cycle states page
   
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'life cycle states option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
     And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User verifies 'update life cycle states audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify life cycle states audit tail table data 'txt_update_lock_life_cycle_states_auit_table_data' for 'update' event in row 1
   
    And User clicks on 'config' sidebar menu
    Then User verify 'life cycle states tab' in life cycle states page
    And User clicks on 'life cycle states tab' in life cycle states page
    And User verify 'life cycle states list' in life cycle states page
    Then User verify 'new life cycle states' in life cycle states page
    Then User enters 'text life cycle state name' in 'search' field of life cycle states page
   	Then User verify 'txt_edit_lock_life_cycle_states_table_data' in row 1 of life cycle states page
     And User clicks on 'delete icon' in life cycle states page
    Then User verify 'confirm you delete' in life cycle states page
    Then User verify 'delete' button in life cycle states page
    And User clicks on 'delete' button in life cycle states page
    Then User verify 'life cycle state delete message' in life cycle states page
          
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'life cycle states option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User verifies 'delete life cycle states audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify life cycle states audit tail table data 'txt_delete_lock_life_cycle_states_auit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
      @audit1
  Scenario: 8_verify number system create, update, delete functionality in audit tral
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'numbering system tab' in numbering system page
    And User clicks on 'numbering system tab' in numbering system page
    And User verify 'numbering system list' in numbering system page
    Then User verify 'new numbering system' in numbering system page
    And User verifies 'numbering system table column headers' in numbering system page
    And User clicks on 'new numbering system' in numbering system page
    Then User enters 'text numbering system name' in 'name' field of numbering system page
    Then User enters 'text numbering system string value' in 'string value' field of numbering system page
    Then User enters 'text numbering system maximum digit' in 'maximum digit' field of numbering system page
    Then User enters 'text numbering system description' in 'description' field of numbering system page 
    And User clicks on 'add field type' button in numbering system page
    Then User verify 'add field type header' in numbering system page
    Then User verify 'label select feild type' in numbering system page
    And User selects 0 index option in 'select field type' in numbering system page
    Then User verify 'label select system data field Type' in numbering system page
    And User selects 0 index option in 'select sub field value' in numbering system page
    And User clicks on 'add' button in numbering system page
    Then User verify 'selected numbering system data' in new numbering page
    Then User verify 'numbering format data' in new numbering page
    And User clicks on 'generate' button in numbering system page
    Then User verify 'numbering system added message' in numbering system page
    Then User verify 'reset filter' button in numbering system page 
    Then User verify 'txt_numbering_system_table_data' in row 1 of numbering system page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'numbering system option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'numbering system tab' in audit trail page
    Then User verifies 'create number system audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify numbering system audit tail table data 'txt_create_numbering_system_audit_table_data' for 'create' event in row 1
    
     And User clicks on 'config' sidebar menu
    Then User verify 'numbering system tab' in numbering system page
    And User clicks on 'numbering system tab' in numbering system page
    And User verify 'numbering system list' in numbering system page
    Then User verify 'new numbering system' in numbering system page
    And User verifies 'numbering system table column headers' in numbering system page
    And User clicks on 'edit' icon in numbering system page
    Then User verify 'edit numbering system header' in numbering system page
    Then User verify 'label name field' in numbering system page
    Then User enters 'text edit numbering system description' in 'description' field of numbering system page
    And User clicks on 'update' button in numbering system page
    Then User verify 'numbering system updated message' in numbering system page
    Then User verify 'reset filter' button in numbering system page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'numbering system option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'numbering system tab' in audit trail page
    Then User verifies 'update number system audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify numbering system audit tail table data 'txt_update_numbering_system_audit_table_data' for 'update' event in row 1
    
    And User clicks on 'config' sidebar menu
    Then User verify 'numbering system tab' in numbering system page
    And User clicks on 'numbering system tab' in numbering system page
    And User verify 'numbering system list' in numbering system page
    Then User verify 'new numbering system' in numbering system page
    And User verifies 'numbering system table column headers' in numbering system page
		And User clicks on 'delete icon' in numbering system page
    Then User verify 'confirm you delete' in numbering system page
    Then User verify 'delete' button in numbering system page
    And User clicks on 'delete' button in numbering system page
    Then User verify 'numbering system deleted message' in numbering system page 
    Then User verify 'reset filter' button in numbering system page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'numbering system option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'numbering system tab' in audit trail page
    Then User verifies 'delete number system audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify numbering system audit tail table data 'txt_delete_numbering_system_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
       @audit1
  Scenario: 9_verify business unit create, update, delete functionality in audit tral
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'business unit tab' in business unit page
    And User clicks on 'business unit tab' in business unit page
    And User verify 'business unit list' in business unit page
    Then User verify 'new business unit' in business unit page
    And User verifies 'business unit table column headers' in business unit page
  
    And User clicks on 'new business unit' in business unit page
    Then User verify 'label business unit name' in business unit page
    Then User enters 'text business unit name' in 'business unit name' field of business unit page
    Then User enters 'text business unit code' in 'business unit code' field of business unit page
    Then User enters 'text business unit addresss' in 'address' field of business unit page
    And User selects 'text business unit organisation' as 'organization' in business unit page
    And User selects 'text business unit country' as 'country' in business unit page
    Then User selects 'text business unit time zone' as 'time zone' in business unit page
    Then User enters 'text date month year' in 'date format' field of business unit page
    And User clicks on 'save' button in business unit page
    Then User verify 'business unit create message' in business unit page
    Then User verify 'reset filter' button in business unit page
    Then User verify 'txt_business_unit_table_data' in row 1 of business unit page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'business unit option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'business unit tab' in audit trail page
    Then User verifies 'create business unit audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify numbering system audit tail table data 'txt_create_numbering_system_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'config' sidebar menu
  	And User clicks on 'business unit tab' in business unit page
    And User verify 'business unit list' in business unit page
    Then User verify 'new business unit' in business unit page
    And User verifies 'business unit table column headers' in business unit page
    Then User verify 'search option default value' in business unit page
     And User clicks on 'edit' icon in business unit page
    Then User verify 'edit business unit header' in business unit page
    Then User verify 'label businees unit name' in business unit page
    Then User enters 'text business unit name' in 'business unit name' field of business unit page
    Then User enters 'text business unit code' in 'business unit code' field of business unit page
    And User clicks on 'update' button in business unit page
    Then User verify 'business unit updated successfully message' in business unit page
    Then User verify 'txt_business_unit_table_data1' in row 1 of business unit page
    
    
 		And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'business unit option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'business unit tab' in audit trail page
    Then User verifies 'update business unit audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify numbering system audit tail table data 'txt_update_business_unit_audit_table_data' for 'update' event in row 1
 
     And User clicks on 'config' sidebar menu
  	And User clicks on 'business unit tab' in business unit page
    And User verify 'business unit list' in business unit page
    Then User verify 'new business unit' in business unit page
    And User verifies 'business unit table column headers' in business unit page
    Then User verify 'search option default value' in business unit page
     And User clicks on 'delete icon' in business unit page
    Then User verify 'confirm you delete' in business unit page
    Then User verify 'delete' button in business unit page
    And User clicks on 'delete' button in business unit page
    Then User verify 'business unit delete message' in business unit page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'business unit option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'business unit tab' in audit trail page
    Then User verifies 'delete business unit audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify numbering system audit tail table data 'txt_delete_business_unit_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
   @audit
  Scenario: 10_verify tags create, update, delete functionality in audit tral
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
  
   	And User clicks on 'new tag' in tag page
    Then User verify 'label tag name' in tag page
    Then User enters 'text tag name' in 'tag name' field of tag page
    Then User enters 'text tag code' in 'tag code' field of tag page
    Then User enters 'text tag description' in 'tag description' field of tag page
    And User selects 'text tag department' as 'department' in tag page
    And User clicks on 'save' button in tag page
    Then User verify 'tag created successfully message' in tag page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'tag option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'tag tab' in audit trail page
    Then User verifies 'create tag audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify tag audit tail table data 'txt_create_tag_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'admin' sidebar menu
    Then User verify 'tags tab' in tag page
    And User clicks on 'tags tab' in tag page
    And User verify 'tag list' in tag page
    Then User verify 'new tag' in tag page
    And User verifies 'tag list table column headers' in tag page
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
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'tag option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'tag tab' in audit trail page
    Then User verifies 'update tag audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify tag audit tail table data 'txt_update_tag_audit_table_data' for 'update' event in row 1
    
     And User clicks on 'admin' sidebar menu
    Then User verify 'tags tab' in tag page
    And User clicks on 'tags tab' in tag page
    And User verify 'tag list' in tag page
    Then User verify 'new tag' in tag page
    And User verifies 'tag list table column headers' in tag page
    And User selects 'name option' as 'search option' in tag page
    Then User enters 'text tag name' in 'search' field of tag page
    And User clicks on 'delete icon' in tag page
    Then User verify 'confirm you delete' in tag page
    Then User verify 'delete' button in tag page
    And User clicks on 'delete' button in tag page
    Then User verify 'tag deleted successfully message' in tag page
    Then User verify 'reset filter' button in tag page  
    And User selects 'name option' as 'search option' in tag page
    Then User enters 'text tag name' in 'search' field of tag page  
    Then User verify 'no rows' in tag page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'tag option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'Jayalakshmi Hegde' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'tag tab' in audit trail page
    Then User verifies 'delete tag audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify tag audit tail table data 'txt_delete_tag_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
  
  
    
    
    
    
  
  
  
  