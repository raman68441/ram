@regression @lifeCycleStates1
Feature: Life Cycle States functionality

  @lifeCycleStates1
  Scenario: 1_verify Life Cycle States functionality
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
    Then User verify 'search option default value' in life cycle states page
    Then User verify 'table filter default value' in life cycle states page
    #Then User verify "10" displayed in pagination field
    #Then User verify "previous page" arrow is "disabled" in pagination field
    #And User verify total number of records displayed in pagination
    #And User verify number of rows in life cycle states table life cycle states page
    And User clicks on 'new life cycle states' in life cycle states page
    Then User verify 'label name' in life cycle states page
    Then User verify 'label select icon' in life cycle states page
    Then User verify 'label locked state' in life cycle states page
    Then User verify 'label yes' radio button in life cycle states page
    Then User verify 'label no' radio button in life cycle states page
    Then User verify 'label description' in life cycle states page
    Then User verify 'cancel' button in life cycle states page
    Then User verify 'save button' in life cycle states page
    And User clicks on 'save' button in life cycle states page
    Then User verify 'warning message name required' in life cycle states page
    Then User verify 'warning message description required' in life cycle states page
    And User clicks on 'cancel' button in life cycle states page
    And User clicks on 'new life cycle states' in life cycle states page
    Then User enters 'text life cycle state name' in 'name' field of life cycle states page
    Then User enters 'text life cycle state description' in 'description' field of life cycle states page
    And User clicks on 'lock state no' radio button in life cycle states page
    And User clicks on 'save' button in life cycle states page
    Then User verify 'life cycle state create message' in life cycle states page
    Then User verify 'txt_life_cycle_states_table_data' in row 1 of life cycle states page
    And User selects 'option active' as 'table filter' in life cycle states page
    #Then User verify only 'active' life cycle states records will display
    And User selects 'option inactive' as 'table filter' in life cycle states page
    #Then User verify only 'inactive' life cycle states records will display
    And User selects 'option life cycle name' as 'search option' in life cycle states page  
    And User clicks on 'reset all' button in life cycle states page
    Then User verify 'search option default value' in life cycle states page
    Then User verify 'table filter default value' in life cycle states page
    Then User enters 'text life cycle state name' in 'search' field of life cycle states page
    Then User verify 'txt_life_cycle_states_table_data' in row 1 of life cycle states page
    And User clicks on 'new life cycle states' in life cycle states page
    Then User enters 'text life cycle state name' in 'name' field of life cycle states page
    Then User enters 'text life cycle state description' in 'description' field of life cycle states page
    And User clicks on 'save' button in life cycle states page
    #Then User verify 'life cycle state is allready present' in life cycle states page
    And User clicks on 'cancel' button in life cycle states page
    And User clicks on 'edit' icon in life cycle states page
    Then User verify 'edit life cycle states header' in life cycle states page
    Then User verify 'label name' in life cycle states page
    Then User verify 'label description' in life cycle states page
    And User clicks on 'cancel' button in life cycle states page
    And User clicks on 'edit' icon in life cycle states page
    Then User verify 'edit life cycle states header' in life cycle states page
    Then User verify 'label name' in life cycle states page
    Then User verify 'label description' in life cycle states page
    Then User enters 'text edit life cycle state name' in 'name' field of life cycle states page
    Then User enters 'text edit life cycle state description' in 'description' field of life cycle states page
    And User clicks on 'update' button in life cycle states page
    Then User verify 'life cycle state updated successfully message' in life cycle states page
    And User clicks on 'delete icon' in life cycle states page
    Then User verify 'confirm you delete' in life cycle states page
    Then User verify 'delete' button in life cycle states page
    And User clicks on 'delete' button in life cycle states page
    Then User verify 'life cycle state delete message' in life cycle states page
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
    
   @lifeCycleStates
     Scenario: 2_create life cycle state with upload image and validate delete functionality
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
    Then User upload image 'txt_file_ipad_image'
     And User verify 'image exists' in life cycle states page
     And User verify 'txt jpg image file name' in life cycle states page
    #And User clicks on 'delete icon' in life cycle states page
    #Then User verify 'confirm you delete' in life cycle states page
    #Then User verify 'delete' button in life cycle states page
    #And User clicks on 'delete' button in life cycle states page
    #Then User upload image 'txt_file_iyespad_image'
     #And User verify 'image exists' in life cycle states page
     #And User verify 'txt jpg image file name' in life cycle states page
      And User clicks on 'save' button in life cycle states page
    Then User verify 'life cycle state create message' in life cycle states page
    Then User verify 'txt_lock_life_cycle_states_table_data' in row 1 of life cycle states page
      Then User verify 'new life cycle states' in life cycle states page
    Then User enters 'text life cycle state name' in 'search' field of life cycle states page
   	Then User verify 'txt_lock_life_cycle_states_table_data' in row 1 of life cycle states page
     And User clicks on 'delete icon' in life cycle states page
    Then User verify 'confirm you delete' in life cycle states page
    Then User verify 'delete' button in life cycle states page
    And User clicks on 'delete' button in life cycle states page
    Then User verify 'life cycle state delete message' in life cycle states page
     Then User verify 'no rows' in life cycle states page
       Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option' 
