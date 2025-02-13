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
    Then User verify 'system data fields types option' in 'select category name' drop down in audit trail page
    Then User verify 'role option' in 'select category name' drop down in audit trail page
    Then User verify 'document option' in 'select category name' drop down in audit trail page
    And User clicks on 'select category name' in audit trail page
    And User selects 'role option' as 'category name' in audit trail page
    And User clicks on 'select event' in audit trail page
    Then User verify 'created option' in 'select event' drop down in audit trail page
    Then User verify 'updated option' in 'select event' drop down in audit trail page
    Then User verify 'deleted option' in 'select event' drop down in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit2
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
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
   # Then User verifies 'login audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    
    And User clicks on 'download' button in audit trail page
    #Then User verify login tab 'txt_audit_trail_login_data' in audit trail row 1
    When User clicks on 'reset all filters' in audit trail page
    Then User verify 'login tab' not displayed in audit trail page
    Then User verify "" in 'category name' field in audit trail page
    Then User verify "" in 'user' field in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    Then User verify 'generate' button is 'enabled' in audit trail page
    And User clicks on 'generate' button in audit trail page
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

  @audit3
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
    And User selects 'shivani swaraj option' as 'user' in audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verifies 'login audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify login tab 'txt_audit_trail_login_data_without_identificationId' in audit trail row 1
    When User clicks on 'reset all filters' in audit trail page
    Then User verify 'login tab' not displayed in audit trail page
    Then User verify "" in 'category name' field in audit trail page
    Then User verify "" in 'user' field in audit trail page
    And User selects 'login option' as 'category name' in audit trail page
    And User selects 'amit neviton option' as 'user' in audit trail page
    Then User verify 'generate' button is 'enabled' in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    #Then User verify login tab 'txt_audit_trail_login_data' in audit trail row 1
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
    Then User clicks on 'logout
  @audit4
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
    #Then User verify '02/12/2023' in 'start date' field of audit trail page
    And User clicks on 'end date calender' icon in audit trail page
    Then User verify 'next month' arrow is 'disabled' in calender
    Then User verify 'previous month' arrow is 'enabled' in calender
    Then User verify 'current month year' in calender
    And User select 'current date' as 'date' in calender
    Then User verify 'current date' in 'end date' field of audit trail page
    And User selects 'jayalakshmi hegde option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verifies 'login audit trail table headers' in audit trail page
    #Then User verify login tab 'txt_audit_trail_login_data' in audit trail row 1
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit5
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
    And User clicks on 'generate' button in audit trail page
    Then User verify 'login tab' in audit trail page
    Then User verifies 'login audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify number of rows in table is 10 in audit trail page
    Then User selects "50" from pagination drop down
    #And User verify number of rows in table is 50 in audit trail page
    Then User selects "100" from pagination drop down
   # And User verify number of rows in table is 100 in audit trail page
    Then User selects "100" from pagination drop down
    #And User verify number of rows in table is 100 in audit trail page
    Then User clicks on next page arrow till last page
    Then User verify "next page" arrow is "disabled" in pagination field
    Then User clicks on "previous page" pagination arrow
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @audit6
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
    Then User verify 'numbering system option' in 'select category name' drop down in audit trail page
    And User clicks on 'add new event select category name' in audit trail page
    And User selects 'life cycle states option' as 'add new event category name' in audit trail page
    And User clicks on 'add new select event' in audit trail page
    Then User verify 'created option' in 'select event' drop down in audit trail page
    Then User verify 'updated option' in 'select event' drop down in audit trail page
    Then User verify 'deleted option' in 'select event' drop down in audit trail page
    And User clicks on 'add new select event' in audit trail page
    And User selects 'created option' as 'add new event' in audit trail page
    And User clicks on 'add new event all day' checkbox in audit trail page
    And User clicks on 'add new event category generate button' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
    
    @audit7
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
    And User clicks on 'create' button in life cycle states page
    Then User verify 'life cycle state create message' in life cycle states page
    #Then User verify 'txt_lock_life_cycle_states_table_data' in row 1 of life cycle states page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'life cycle states option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User verifies 'create life cycle states audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
   # Then User verify life cycle states audit tail table data 'txt_create_lock_life_cycle_states_auit_table_data' for 'create' event in row 1
   
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
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User verifies 'update life cycle states audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify life cycle states audit tail table data 'txt_update_lock_life_cycle_states_auit_table_data' for 'update' event in row 1
   
    And User clicks on 'config' sidebar menu
    Then User verify 'life cycle states tab' in life cycle states page
    And User clicks on 'life cycle states tab' in life cycle states page
    And User verify 'life cycle states list' in life cycle states page
    Then User verify 'new life cycle states' in life cycle states page
    Then User enters 'text life cycle state name' in 'search' field of life cycle states page
   	Then User verify 'txt_edit_lock_life_cycle_states_table_data' in row 1 of life cycle states page
     And User clicks on 'delete icon' in life cycle states page
    Then User verify 'confirm your delete' in life cycle states page
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
    And User selects 'shivani swaraj option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
     And User clicks on 'generate' button in audit trail page
    Then User verify 'life cycle states tab' in audit trail page
    Then User verifies 'delete life cycle states audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify life cycle states audit tail table data 'txt_delete_lock_life_cycle_states_auit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
      @audit8
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
   # Then User verify 'numbering format data' in new numbering page
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
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'numbering system tab' in audit trail page
    Then User verifies 'create number system audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify numbering system audit tail table data 'txt_create_numbering_system_audit_table_data' for 'create' event in row 1
    
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
    And User selects 'jayalakshmi hegde option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'numbering system tab' in audit trail page
    Then User verifies 'update number system audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify numbering system audit tail table data 'txt_update_numbering_system_audit_table_data' for 'update' event in row 1
    
    And User clicks on 'config' sidebar menu
    Then User verify 'numbering system tab' in numbering system page
    And User clicks on 'numbering system tab' in numbering system page
    And User verify 'numbering system list' in numbering system page
    Then User verify 'new numbering system' in numbering system page
    And User verifies 'numbering system table column headers' in numbering system page
		And User clicks on 'delete icon' in numbering system page
    Then User verify 'confirm your delete' in numbering system page
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
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'numbering system tab' in audit trail page
    Then User verifies 'delete number system audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify numbering system audit tail table data 'txt_delete_numbering_system_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
       @audit9
  Scenario: 9_verify site create, update, delete functionality in audit tral
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'site tab' in site page
    And User clicks on 'site tab' in site page
    And User verify 'site list' in site page
    Then User verify 'new site' in site page
    And User verifies 'site table column headers' in site page
  
    And User clicks on 'new site' in site page
    Then User verify 'label site name' in site page
    Then User enters 'text site name' in 'site name' field of site page
    Then User enters 'text site code' in 'site code' field of site page
    Then User enters 'text site addresss' in 'address' field of site page
    #And User selects 'text site organisation' as 'organization' in site page//not in the functionality
   # And User selects 'text site country' as 'country' in site page #not in the functionality
    Then User selects 'text site time zone' as 'time zone' in site page
    Then User selects 'text date month year' as 'date format' in site page
    And User clicks on 'create' button in site page
    Then User verify 'site created successfully message' in site page
    Then User verify 'reset filter' button in site page
    #Then User verify 'txt_business_unit_table_data' in row 1 of site page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'site option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'site tab' in audit trail page
    Then User verifies 'create site audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
   # Then User verify numbering system audit tail table data 'txt_create_numbering_system_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'admin' sidebar menu
  	And User clicks on 'site tab' in site page
    And User verify 'site list' in site page
    Then User verify 'new site' in site page
    #And User verifies 'site table column headers' in site page
    Then User verify 'search option default value' in site page
     And User clicks on 'edit' icon in site page
    Then User verify 'edit site header' in site page
    Then User verify 'label edit site name' in site page
    Then User enters 'text site name' in 'edit business name' field of site page
    #Then User enters 'text site name' in 'site name' field of site page
    Then User enters 'text site code' in 'site code' field of site page
    And User clicks on 'update' button in site page
    Then User verify 'site updated successfully message' in site page
    #Then User verify 'txt_business_unit_table_data1' in row 1 of site page
    
    
 		And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'site option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'site tab' in audit trail page
    Then User verifies 'update site audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
   # Then User verify numbering system audit tail table data 'txt_update_business_unit_audit_table_data' for 'update' event in row 1
 
     And User clicks on 'admin' sidebar menu
  	And User clicks on 'site tab' in site page
    And User verify 'site list' in site page
    Then User verify 'new site' in site page
    #And User verifies 'site table column headers' in site page
    Then User verify 'search option default value' in site page
     And User clicks on 'delete icon' in site page
    Then User verify 'confirm your delete' in site page
    Then User verify 'delete' button in site page
    And User clicks on 'delete' button in site page
    Then User verify 'site deleted successfully message' in site page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'site option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'site tab' in audit trail page
    Then User verifies 'delete site audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify numbering system audit tail table data 'txt_delete_business_unit_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
   @audit10
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
    #And User selects 'text tag department option' as 'department' in tag page//No need this step
    And User clicks on 'create' button in tag page
    Then User verify 'tag created successfully message' in tag page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'tag option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'tag tab' in audit trail page
    Then User verifies 'create tag audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
   # Then User verify tag audit tail table data 'txt_create_tag_audit_table_data' for 'create' event in row 1
    
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
    And User selects 'all option' as 'search option' in tag page
    Then User enters 'text tag name' in 'search' field of tag page
   # Then User verify 'txt_update_tag_table_data' in row 1 of tag page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'tag option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'tag tab' in audit trail page
    Then User verifies 'update tag audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify tag audit tail table data 'txt_update_tag_audit_table_data' for 'update' event in row 1
    
     And User clicks on 'admin' sidebar menu
    Then User verify 'tags tab' in tag page
    And User clicks on 'tags tab' in tag page
    And User verify 'tag list' in tag page
    Then User verify 'new tag' in tag page
    And User verifies 'tag list table column headers' in tag page
    And User selects 'all option' as 'search option' in tag page
    Then User enters 'text tag name' in 'search' field of tag page
    And User clicks on 'delete icon' in tag page
    Then User verify 'confirm your delete' in tag page
    Then User verify 'delete' button in tag page
    And User clicks on 'delete' button in tag page
    Then User verify 'tag deleted successfully message' in tag page
    Then User verify 'reset filter' button in tag page  
    And User selects 'all option' as 'search option' in tag page
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
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'tag tab' in audit trail page
    Then User verifies 'delete tag audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify tag audit tail table data 'txt_delete_tag_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
  
  
     @audit11
  Scenario: 11_verify activities create, update, delete functionality in audit tral
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
  
    And User clicks on 'new activity' in activities page
    Then User verify 'label name' in activities page
    Then User enters 'text activity name' in 'name' field of activities page
    Then User enters 'text activity description' in 'description' field of activities page
    Then User enters 'text meaning of signature' in 'meaning of signature' field of activities page
    And User clicks on 'electronic signature yes' button in activities page
    Then User clicks on 'comments yes' button in activities page
    And User clicks on 'create' button
    Then User verify 'activity created successfully message' in activities page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'activities option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'activities tab' in audit trail page
    Then User verifies 'create activities audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify activities audit tail table data 'txt_create_activity_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'config' sidebar menu
    Then User verify 'activities tab' in activities page
    And User clicks on 'activities tab' in activities page
    And User verify 'activities list' in activities page
    Then User verify 'new activity' in activities page
    And User verifies 'activities list table column headers' in activities page
    And User clicks on 'edit' icon in activities page
    Then User verify 'edit activities header' in activities page
    #Then User verify 'label name' in activities page
    Then User enters 'text edit activity description' in 'description' field of activities page
    And User clicks on 'update' button in activities page
    Then User verify 'activity updated successfully message' in activities page
    Then User verify 'search option default value' in activities page
    And User selects 'name option' as 'search option' in activities page
    Then User enters 'text activity name' in 'search' field of activities page
    #Then User verify 'text_edit_activity_table_data' in row 1 of activities page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'activities option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'activities tab' in audit trail page
    Then User verifies 'update activities audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify activities audit tail table data 'txt_update_activity_audit_table_data' for 'create' event in row 1
        
     And User clicks on 'config' sidebar menu
     Then User verify 'activities tab' in activities page
    And User clicks on 'activities tab' in activities page
    And User verify 'activities list' in activities page
    Then User verify 'new activity' in activities page
    And User verifies 'activities list table column headers' in activities page
  	And User selects 'all option' as 'search option' in activities page
    #Then User enters 'text activity all' in 'search' field of activities page
    #Then User verify 'text_edit_activity_table_data' in row 1 of activities page
     And User clicks on 'delete icon' in activities page
    Then User verify 'confirm your delete' in activities page
    Then User verify 'delete' button in activities page
    And User clicks on 'delete' button in activities page
    Then User verify 'activities deleted message' in activities page  
    Then User verify 'reset filter' button in activities page  
    And User selects 'name option' as 'search option' in activities page
    Then User enters 'text tag name' in 'search' field of activities page  
    Then User verify 'no rows' in activities page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'activities option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'activities tab' in audit trail page
    Then User verifies 'delete activities audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify tag audit tail table data 'txt_delete_activities_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
    @Audit12
    Scenario: 12_verify checklist create, update, delete functionality in audit tral
   Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'checklist' in checklist page
    And User clicks on 'checklist' in checklist page
    And User verify 'checklist tab' in checklist page
    Then User verify 'new checklist' in checklist page
    And User verifies 'checklist table column headers' in checklist page

  
 		And User clicks on 'new checklist' in checklist page
    Then User verify 'label name' in checklist page
    Then User enters 'text checklist name' in 'name' field of checklist page
    Then User enters 'text checklist description' in 'description' field of checklist page
    And User clicks on 'add checkpoint' button in checklist page
		Then User verify 'label add checkpoint' in checklist page
    Then User enters 'text checkpoint name' in 'checkpoint name' field of checklist page
    And User clicks on 'add table column button' in checklist page
    Then User verify 'table column 1' in checklist page
    Then User verify 'label select type' in checklist page
    And User selects 'string and selection option' as 'select type' in checklist page 
    Then User enters 'text header name' in 'header name' field of checklist page
    And User enters 'text enter string name' in 'enter string name' field of checklist page
    And User selects 'label yes' as 'enter selection value' in checklist page 
    And User clicks on 'apply' button in checklist page 
    And User clicks on 'add' button in checklist page
    And User save 'id column' row 1 data in checklist page
    And User clicks on 'create' button
    Then User verify 'checklist has been added message' in checklist page

    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'checklist option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'checklist tab' in audit trail page
    Then User verifies 'create checklist audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify checklist audit tail table data 'text_create_checklist_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'config' sidebar menu
    Then User verify 'checklist' in checklist page
    And User clicks on 'checklist' in checklist page
    And User verify 'checklist tab' in checklist page
    Then User verify 'new checklist' in checklist page
    And User verifies 'checklist table column headers' in checklist page
    And User selects 'name option' as 'search option' in checklist page
    Then User enters 'text checklist name' in 'search' field of checklist page
    And User verify 'text checklist name' in row 1 column 1 in checklist page
    And User clicks on 'edit' icon in checklist page
    Then User verify 'edit checklist header' in checklist page
    Then User verify 'label name' in checklist page
    Then User enters 'text edit checklist description' in 'description' field of checklist page
    And User clicks on 'update' button in checklist page
    Then User verify 'checklist updated message' in checklist page
    Then User verify 'text_edit_checklist_table_data' in row 1 of checklist page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'checklist option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'checklist tab' in audit trail page
    Then User verifies 'update checklist audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify checklist audit tail table data 'txt_update_checklist_audit_table_data' for 'create' event in row 1
        
    And User clicks on 'config' sidebar menu
    Then User verify 'checklist' in checklist page
    And User clicks on 'checklist' in checklist page
    And User verify 'checklist tab' in checklist page
    Then User verify 'new checklist' in checklist page
    And User verifies 'checklist table column headers' in checklist page
    And User selects 'name option' as 'search option' in checklist page
    Then User enters 'text checklist name' in 'search' field of checklist page
    And User clicks on 'delete icon' in checklist page
    Then User verify 'confirm your delete' in checklist page
    Then User verify 'delete' button in checklist page
    And User clicks on 'delete' button in checklist page
    Then User verify 'checklist deleted message' in checklist page
    Then User clicks on 'reset filter' button in checklist page  
    And User selects 'name option' as 'search option' in checklist page
    Then User enters 'text checklist name' in 'search' field of checklist page
    Then User verify 'no rows' in checklist page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'checklist option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    #Then User verify 'activities tab' in audit trail page
    Then User verifies 'delete checklist audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
   # Then User verify checklist audit tail table data 'txt_delete_checklist_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
     
    
   @Audit13
    Scenario: 13_verify system data fields types create, update, delete functionality in audit tral
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

 		And User clicks on 'new system data field types' in system data fields types page
    Then User verify 'label name field' in system data fields types page
    Then User enters 'text system data fields types name' in 'name' field of system data fields types page
    And User selects 'string option' as 'data field type' in system data fields types page 
    Then User verify 'label define no' in system data fields types page
    Then User enters 'text system data define no' in 'define no' field of system data fields types page   
    And User clicks on 'save' button
    Then User verify 'system data field type created successfully message' in system data fields types page

    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'system data fields types option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'system data fields types' in audit trail page
    Then User verifies 'create system data fields types audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
   # Then User verify system data fields types audit tail table data 'txt_create_system_data_fields_types_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'config' sidebar menu
    Then User verify 'system data fields types' in system data fields types page
    And User clicks on 'system data fields types' in system data fields types page
    And User verify 'system data fields type list tab' in system data fields types page
    Then User verify 'new system data field types' in system data fields types page
    And User verifies 'system data fields types table column headers' in system data fields types page
		And User selects 'name option' as 'search option' in system data fields types page
    Then User enters 'text system data fields types name' in 'search' field of system data fields types page
    And User verify 'text data field type name' in row 1 column 1 in system data fields types page
    And User clicks on 'edit' icon in system data fields types page
    Then User verify 'edit system data fields types header' in system data fields types page
    Then User verify 'label name field' in system data fields types page
    Then User enters 'edit text system data define no' in 'edit define no' field of system data fields types page   
   	And User clicks on 'update' button in system data fields types page  
    Then User verify 'system data field type updated successfully message' in system data fields types page
 
      
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'system data fields types option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'system data fields types' in audit trail page
    Then User verifies 'update system data fields types audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify system data fields types audit tail table data 'txt_update_system_data_fields_types_audit_table_data' for 'create' event in row 1
        
    And User clicks on 'config' sidebar menu
    Then User verify 'system data fields types' in system data fields types page
    And User clicks on 'system data fields types' in system data fields types page
    And User verify 'system data fields type list tab' in system data fields types page
    Then User verify 'new system data field types' in system data fields types page
    And User verifies 'system data fields types table column headers' in system data fields types page
		And User selects 'name option' as 'search option' in system data fields types page
    Then User enters 'text system data fields types name' in 'search' field of system data fields types page
    And User verify 'text data field type name' in row 1 column 1 in system data fields types page
 		And User clicks on 'delete icon' in system data fields types page
    Then User verify 'confirm your delete' in system data fields types page
    Then User verify 'delete' button in system data fields types page
    And User clicks on 'delete' button in system data fields types page
    Then User verify 'system data field type delete message' in system data fields types page
    And User selects 'all option' as 'search option' in system data fields types page
    
    And User clicks on 'delete icon' in system data fields types page
    Then User verify 'confirm your delete' in system data fields types page
    Then User verify 'delete' button in system data fields types page
    And User clicks on 'delete' button in system data fields types page
    Then User verify 'system data field type delete message' in system data fields types page
    Then User clicks on 'reset filter' button in system data fields types page
    And User selects 'name option' as 'search option' in system data fields types page
    Then User enters 'text data field type name' in 'search' field of system data fields types page
    Then User verify 'no rows' in system data fields types page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'system data fields types option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'system data fields types' in audit trail page
    Then User verifies 'delete system data fields types audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
  # Then User verify system data fields types audit tail table data 'txt_delete_system_data_fields_types_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
  
  @Audit14
    Scenario: 14_verify workflow type create, update, delete functionality in audit tral
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
    Then User verify 'reset filter' button in workflow type page
    

 		And User clicks on 'new workflow type' in workflow type page
    Then User verify 'label name' in workflow type page
    Then User enters 'text workflow type name' in 'name' field of workflow type page
    Then User enters 'text workflow type description' in 'description' field of workflow type page
    Then User enters 'text workflow type prefix' in 'prefix' field of workflow type page
    And User selects 'executable option' as 'Workflow Content Type' in workflow type page
    Then User enters 'text wf serial number start value' in 'serial number start value' field of workflow type page
    Then User enters 'text wf serial number length' in 'serial number length in digit' field of workflow type page  
    And User selects 'manual option' as 'work flow release condition' in workflow type page 
    And User selects 'retire option' as 'Workflow Action Type' in workflow type page 
   	And User clicks on 'add life cycle state' in workflow type page
    Then User verify 'label select lifecycle state' in workflow type page    
    And User selects 0 index option in 'select life cycle state' in workflow type page
    Then User selects 0 index option in 'select role' in workflow type page
    Then User selects 0 index option in 'select department' in workflow type page
    Then User selects 0 index option in 'select action/activity' in workflow type page
    Then User selects 0 index option in 'select checklist' in workflow type page
    And User enters 'text worflow minimum user count' in 'minimum user count' field of workflow type page  
    #Then User selects 0 index option in 'select notification type' in workflow type page//this step not in the functionality
    Then User selects 0 index option in 'increment type' in workflow type page
    Then User selects 0 index option in 'select print type' in workflow type page
    And User enters 'text worflow sla/days' in 'sla/days' field of workflow type page  
    And User clicks on 'map' button in workflow type page  
    Then User clicks on 'create' button in workflow type page  
    Then User verify 'workflow type created successfully message' in workflow type page
    Then User verify 'reset filter' button in workflow type page
 		And User selects 'name option' as 'search option' in workflow type page
    Then User enters 'text workflow type name' in 'search' field of workflow type page
    And User verify 'text workflow type name' in row 1 column 1 in workflow type page
    And User clicks on 'reset filter' button in workflow type page
 
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'workflow type option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'workflow type tab' in audit trail page
    Then User verifies 'create workflow type audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify workflow type audit tail table data 'txt_create_workflow_type_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'config' sidebar menu
    Then User verify 'workflow type' in workflow type page
    And User clicks on 'workflow type' in workflow type page
    And User verify 'workflow type tab' in workflow type page
    Then User verify 'new workflow type' in workflow type page
    And User selects 'name option' as 'search option' in workflow type page
    Then User enters 'text workflow type name' in 'search' field of workflow type page
    And User verify 'text workflow type name' in row 1 column 1 in workflow type page
    And User clicks on 'edit' icon in workflow type page
    Then User verify 'edit workflow type header' in workflow type page
    Then User verify 'label name' in workflow type page
    Then User enters 'text edit workflow type description' in 'description' field of workflow type page   
    And User clicks on 'update' button in workflow type page  
    Then User verify 'workflow type updated successfully message' in workflow type page
          
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'workflow type option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'workflow type tab' in audit trail page
    Then User verifies 'update workflow type audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify workflow type audit tail table data 'txt_update_workflow_type_audit_table_data' for 'update' event in row 1
        
    And User clicks on 'config' sidebar menu
    Then User verify 'workflow type' in workflow type page
    And User clicks on 'workflow type' in workflow type page
    And User verify 'workflow type tab' in workflow type page
    Then User verify 'new workflow type' in workflow type page
    And User selects 'name option' as 'search option' in workflow type page
    Then User enters 'text workflow type name' in 'search' field of workflow type page
    And User verify 'text workflow type name' in row 1 column 1 in workflow type page
    And User clicks on 'delete icon' in workflow type page
    Then User verify 'confirm your delete' in workflow type page
    Then User verify 'delete' button in workflow type page
    And User clicks on 'delete' button in workflow type page
    Then User verify 'workflow type delete message' in workflow type page   		     		
    Then User clicks on 'reset filter' button in workflow type page
    And User selects 'name option' as 'search option' in workflow type page
    Then User enters 'text data field type name' in 'search' field of workflow type page
    Then User verify 'no rows' in workflow type page
    
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'workflow type option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'workflow type tab' in audit trail page
    Then User verifies 'delete system data fields types audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify workflow type audit tail table data 'txt_delete_workflow_type_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
    @Audit15
    Scenario: 15_verify user creation functionality in audit tral
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field    
 
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'user creation option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'all day' checkbox in audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'user creation tab' in audit trail page
    Then User verifies 'create user creation audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
              
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'user creation option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'all day' checkbox in audit trail page   
    And User clicks on 'identification id' checkbox in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'user creation tab' in audit trail page
    Then User verifies 'update user creation audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
            
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
     @Audit16
    Scenario: 16_verify user group create, update, delete functionality in audit tral
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'admin' sidebar menu
    Then User verify 'user group' in user group page
    And User clicks on 'user group' in user group page
    And User verify 'user group list tab' in user group page
    Then User verify 'new user group' in user group page
    And User verifies 'user group list table column headers' in user group page
    Then User verify 'search option default value' in user group page
    Then User verify 'table filter default value' in user group page
    Then User verify 'reset filter' button in user group page
    Then User verify 'download' button in user group page
    
  	And User clicks on 'new user group' in user group page
    Then User verify 'label name' in user group page
    Then User enters 'text user group name' in 'name' field of user group page
    Then User enters 'text user group description' in 'description' field of user group page
    And User clicks on 'add users link' button in user group page
    And User enters 'full name' in 'add user' field of user group page
    And User clicks on 'select all row check box' button in user group page  
    Then User clicks on '1' and '0' check box in user group page
   And User clicks on 'add users' button in user group page  
    And User clicks on 'add user group link' button in user group page
    Then User clicks on '0' and '0' check box in user group page
    And User clicks on 'add user group' button in user group page
    And User clicks on 'add privileges link' button in user group page
    Then User clicks on '0' and '1' check box in user group page
    And User clicks on 'add privileges' button in user group page
    And User clicks on 'save' button in user group page  
    Then User verify 'user group created successfully message' in user group page
    Then User verify 'table filter default value' in user group page
    Then User verify 'search option default value' in user group page
    And User selects 'user group name option' as 'search option' in user group page
    Then User enters 'text user group name' in 'search' field of user group page
    And User verify 'text user group name' in row 1 column 1 in user group page
    And User clicks on 'reset filter' button in user group page
 
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'user group option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'user group' in audit trail page
    Then User verifies 'create user group audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify workflow type audit tail table data 'text_create_user_group_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'admin' sidebar menu
    And User clicks on 'user group' in user group page
    And User verify 'user group list tab' in user group page
    Then User verify 'new user group' in user group page
    And User selects 'user group name option' as 'search option' in user group page
    Then User enters 'text user group name' in 'search' field of user group page
    And User verify 'text user group name' in row 1 column 1 in user group page
    And User clicks on 'edit' icon in user group page
    Then User verify 'edit user group header' in user group page
    Then User verify 'label name' in user group page
    And User enters 'text edit user group description' in 'description' field of user group page
    And User clicks on 'update' button in user group page  
    Then User verify 'user group updated successfully message' in user group page
          
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'user group option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'user group' in audit trail page
    Then User verifies 'update user group audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify workflow type audit tail table data 'text_update_user_group_audit_table_data' for 'update' event in row 1
        
    And User clicks on 'admin' sidebar menu
    And User clicks on 'user group' in user group page
    And User verify 'user group list tab' in user group page
    Then User verify 'new user group' in user group page
    And User selects 'name option' as 'search option' in workflow type page
    And User selects 'user group name option' as 'search option' in user group page
    Then User enters 'text user group name' in 'search' field of user group page
    And User verify 'text user group name' in row 1 column 1 in user group page
    And User clicks on 'delete icon' in user group page
    Then User verify 'confirm your delete' in user group page
    Then User verify 'delete' button in user group page
    And User clicks on 'delete' button in user group page
    Then User verify 'user group delete message' in user group page
    And User clicks on 'reset filter' button in user group page
    And User selects 'user group name option' as 'search option' in user group page
    Then User enters 'text user group name' in 'search' field of user group page
 		Then User verify 'no rows' in user group page
           
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'user group option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    Then User verify 'user group' in audit trail page
    Then User verifies 'delete user group audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    Then User verify workflow type audit tail table data 'text_delete_user_group_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
    
       @Audit17
    Scenario: 17_verify document type/template type create, update, delete functionality in audit tral
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    And User clicks on 'config' sidebar menu
    Then User verify 'document type/template type' in document type template type page
    And User clicks on 'document type/template type' in document type template type page
    And User verify 'document type/template type list tab' in document type template type page
    
    And User clicks on 'new document type/template type' in document type template type page
    Then User verify 'all the tabs in document type' displayed in document type template type page  
    Then User enters 'text document type name' in 'name' field of document type template type page
    Then User enters 'text document type description' in 'description' field of document type template type page
    And User selects 0 index option in 'select numbering system' in document type template type page
    Then User enters 'text retention schedule days' in 'retention schedule' field of document type template type page
    Then User enters 'text document type initial version' in 'initial version' field of document type template type page
    And User clicks on 'next' button in document type template type page
    
    And User verify 'label select system data field' in document type template type page
    And User selects 0 index option in 'select system data field' in document type template type page
    And User clicks on 'add' button in document type template type page
    Then User clicks on 'next' button in document type template type page
    
    And User verify 'label workflow type' in document type template type page
    And User selects 0 index option in 'select workflow type field' in document type template type page
    And User clicks on 'add' button in document type template type page
    Then User clicks on 'next' button in document type template type page
    
    And User verify 'label review period duration' in document type template type page
    Then User enters 'text review period duration' in 'review period duration' field of document type template type page
    And User enters 'text prior reminder starts from' in 'prior reminder starts from' field of document type template type page
    Then User enters 'text reminder recurrence schedule' in 'reminder recurrence schedule' field of document type template type page
    Then User clicks on 'next' button in document type template type page
    
    And User verify 'label notification users list' in document type template type page
    And User selects 0 index option in 'notification users list' in document type template type page
    Then User selects 0 index option in 'notification departments list' in document type template type page
    And User selects 0 index option in 'notification groups list' in document type template type page
    Then User selects 0 index option in 'notification roles list' in document type template type page
    Then User clicks on 'create' in document type template type page
 		Then User verify 'document type created successfully message' in document type template type page
 		
 		Then User verify 'reset filter' button in document type template type page
 		And User selects 'name option' as 'search option' in document type template type page
    Then User enters 'text document type name' in 'search' field of document type template type page
    And User verify 'text document type name' in row 1 column 1 in document type template type page
   
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'document type/template type option' as 'category name' in audit trail page
    And User selects 'created option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    #Then User verify 'document type/template type' in audit trail page
    Then User verifies 'create document type/template type audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify document type template type audit tail table data 'text_create_document_type_template_type_audit_table_data' for 'create' event in row 1
    
    And User clicks on 'admin' sidebar menu
    And User clicks on 'config' sidebar menu
    Then User verify 'document type/template type' in document type template type page
    And User clicks on 'document type/template type' in document type template type page
    And User verify 'document type/template type list tab' in document type template type page
   	And User selects 'name option' as 'search option' in document type template type page
    Then User enters 'text document type name' in 'search' field of document type template type page
    And User verify 'text document type name' in row 1 column 1 in document type template type page
    And User clicks on 'edit' icon in document type template type page
    Then User verify 'edit docuement type/template type header' in document type template type page
    And User verify 'label description' in document type template type page
    Then User enters 'text document type description1' in 'description' field of document type template type page
    Then User clicks on 'next' button in document type template type page
    Then User clicks on 'next' button in document type template type page
    Then User clicks on 'next' button in document type template type page
    Then User clicks on 'next' button in document type template type page
     And User clicks on 'update' button in document type template type page
    Then User verify 'document type updated successfully message' in document type template type page
      
    And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'document type option' as 'category name' in audit trail page
    And User selects 'updated option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
    #Then User verify 'document type/template type' in audit trail page
    Then User verifies 'update document type/template type audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
   # Then User verify document type template type audit tail table data 'text_update_user_group_audit_table_data' for 'update' event in row 1
     
    And User clicks on 'config' sidebar menu
    Then User verify 'document type/template type' in document type template type page
    And User clicks on 'document type/template type' in document type template type page
    And User verify 'document type/template type list tab' in document type template type page
   	And User selects 'name option' as 'search option' in document type template type page
    Then User enters 'text document type name' in 'search' field of document type template type page
    And User verify 'text document type name' in row 1 column 1 in document type template type page
    And User clicks on 'delete icon' in document type template type page
    Then User verify 'confirm your delete' in document type template type page
    Then User verify 'delete' button in document type template type page
    And User clicks on 'delete' button in document type template type page
    Then User verify 'document type deleted successfully message' in document type template type page
    And User clicks on 'reset filter' button in document type template type page
    And User selects 'name option' as 'search option' in document type template type page
    Then User enters 'text document type name' in 'search' field of document type template type page
 		Then User verify 'no rows' in document type template type page
 		
 		And User clicks on 'system' sidebar menu
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verify 'label select category name' in audit trail page
    And User selects 'document type option' as 'category name' in audit trail page
    And User selects 'deleted option' as 'event' in audit trail page    
    Then User verify 'current date' in 'start date' field of audit trail page
    Then User verify 'current date' in 'end date' field of audit trail page
    And User clicks on 'identification id' checkbox in audit trail page
    And User selects 'all option' as 'user' in audit trail page
    And User clicks on 'generate' button in audit trail page
    And User clicks on 'generate' button in audit trail page
   # Then User verify 'document type/template type' in audit trail page
    Then User verifies 'delete document type/template type audit trail table headers' in audit trail page
    Then User verify 'generate' button is 'disabled' in audit trail page
    And User clicks on 'download' button in audit trail page
    #Then User verify document type template type audit tail table data 'text_delete_document_type_template_type_audit_table_data' for 'delete' event in row 1
    
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
     
     
  