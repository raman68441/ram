@regression @numberingSystem
Feature: Numbering System functionality

  @numberingSystem
  Scenario: 1_verify Numbering System functionality
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
    Then User verify 'search option default value' in numbering system page
    Then User verify 'table filter default value' in numbering system page
    Then User verify 'reset filter' button in numbering system page
    Then User verify 'download' button in numbering system page
    Then User verify "10" displayed in pagination field
    Then User verify "previous page" arrow is "disabled" in pagination field
    And User verify total number of records displayed in pagination
    And User verify number of rows in numbering system table numbering system page
    And User clicks on 'new numbering system' in numbering system page
    Then User verify 'label name field' in numbering system page
    Then User verify 'label string value' in numbering system page
    Then User verify 'label maximum digit' in numbering system page
    Then User verify 'label display leading zero' in numbering system page
    Then User verify 'add field type' button in numbering system page
    Then User verify 'label description field' in numbering system page
    Then User verify 'label selected numbering system' in numbering system page
    Then User verify 'no field type added' in numbering system page
    Then User verify 'numbering format' in numbering system page
    Then User verify 'generate' button in numbering system page
    And User clicks on 'generate' button in numbering system page
    Then User verify 'warning message system name required' in numbering system page
    Then User verify 'warning message starting value required' in numbering system page
    Then User verify 'warning message maximum digit required' in numbering system page
    Then User verify 'warning message description required' in numbering system page
    Then User verify 'warning message at least one field type is required' in numbering system page
    Then User verify 'cancel' button in numbering system page
    And User clicks on 'cancel' button in numbering system page
    Then User verify 'reset filter' button in numbering system page
    And User clicks on 'new numbering system' in numbering system page
    Then User enters 'text numbering system name' in 'name' field of numbering system page
    Then User enters 'text numbering system string value' in 'string value' field of numbering system page
    Then User enters 'text numbering system maximum digit' in 'maximum digit' field of numbering system page
    Then User enters 'text numbering system description' in 'description' field of numbering system page 
    And User clicks on 'add field type' button in numbering system page
    Then User verify 'add field type header' in numbering system page
    Then User verify 'label select feild type' in numbering system page
    And User clicks on 'select field type option' in numbering system page
    Then User verify 'system data field Type option' in numbering system page
    Then User verify 'list manager option' in numbering system page
    Then User verify 'document type option' in numbering system page
    Then User verify 'constant string option' in numbering system page
    Then User verify 'year option' in numbering system page
    And User clicks on 'select field type option' in numbering system page
    And User selects 'system data field Type option' as 'select field type' in numbering system page
    Then User verify 'label select system data field Type' in numbering system page
    And User selects 'option1' as 'select sub field value' in numbering system page
    And User clicks on 'add' button in numbering system page
    Then User verify 'selected numbering system data' in numbering system page
    Then User verify 'number format data' in numbering system page
    And User clicks on 'generate' button in numbering system page
    Then User verify 'numbering system create message' in numbering system page
    Then User verify 'txt_numbering_system_table_data' in row 1 of numbering system page
    And User selects 'option active' as 'table filter' in numbering system page
    Then User verify only 'active' numbering system records will display
    And User selects 'option inactive' as 'table filter' in numbering system page
    Then User verify only 'inactive' numbering system records will display
    And User selects 'option numbering system name' as 'search option' in numbering system page
    Then User enters 'text numbering system name' in 'search' field of numbering system page
    Then User verify 'txt_numbering_system_table_data' in row 1 of numbering system page
    And User clicks on 'reset all' button in numbering system page
    Then User verify 'search option default value' in numbering system page
    Then User verify 'table filter default value' in numbering system page
    And User clicks on 'new numbering system' in numbering system page
    Then User enters 'text numbering systme name' in 'name' field of numbering system page
    Then User enters 'text numbering system description' in 'description' field of numbering system page
    And User clicks on 'generate' button in numbering system page
    Then User verify 'numbering system is allready present' in numbering system page
    And User clicks on 'cancel' button in numbering system page
    And User clicks on 'edit' icon in numbering system page
    Then User verify 'edit numbering system header' in numbering system page
    Then User verify 'label name' in numbering system page
    Then User verify 'label description' in numbering system page
    And User clicks on 'cancel' button in numbering system page
    And User clicks on 'edit' icon in numbering system page
    Then User verify 'edit numbering system header' in numbering system page
    Then User verify 'label name' in numbering system page
    Then User verify 'label string value' in numbering system page
    Then User enters 'text edit numbering system name' in 'name' field of numbering system page
    Then User enters 'text edit numbering system string value' in 'string value' field of numbering system page
    Then User enters 'text edit numbering system maximum digit' in 'maximum digit' field of numbering system page
    Then User enters 'text edit numbering system description' in 'description' field of numbering system page
    And User clicks on 'update' button in numbering system page
    Then User verify 'numbering system updated successfully message' in numbering system page
    Then User verify 'reset all' button in numbering system page
    And User clicks on 'delete icon' in numbering system page
    Then User verify 'confirm you delete' in numbering system page
    Then User verify 'delete' button in numbering system page
    And User clicks on 'delete' button in numbering system page
    Then User verify 'numbering system delete message' in numbering system page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
