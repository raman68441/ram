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
    
    
  @audit
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
  
    
    
