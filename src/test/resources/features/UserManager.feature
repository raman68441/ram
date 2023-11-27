@userManager @regression
Feature: User Manager functionality

  Scenario Outline: Create new user and map the newly created user and verify
    Given User launched the application
    When User clicks on 'Arcolab Bangalore' in login page
    And User clicks on 'Vender Login' in login page
    Then User enters 'username' in login page
    Then User enters 'password' in login page
    And User clicks on 'login' button in login page
    Then User clicks on 'user manager' navigation
    Then User clicks on 'user list' option
    And User verify 'user list table column headers names' in user list page
    Then User clicks on 'add new user' in user list page
    And User enters "<first name>" in 'first name' field of user list page
    And User enters "<last name>" in 'last name' field of user list page
    And User enters "<user name>" in 'user name' field of user list page
    And User selects "<gender>" in 'gender' field of user list page
    And User enters "<email>" in 'email' field of user list page
    And User enters "<designation>" in 'designation' field of user list page
    Then User enters 'contact number' in 'contact number' field of user list page
    And User selects "<previleges>" checkbox for 'all' document in usr list page
    Then User clicks on 'create' in user list page
    Then User verifies 'txt_new_user' in user list row 1
    When User clicks on 'user manager' navigation
    Then User clicks on 'my account' option
    Then User clicks on 'partner account mapping' in my account page
    Then User clicks on 'map user from list' in my account page
    When User search for newly created user in my account page
    Then User clicks on 'check box' in my account page
    And User clicks on 'map user' in my account page
    Then User verifies maped user is displayed in mapped vender table 1 row
    When User clicks on 'profile' navigation
    Then User clicks on 'logout' option

    Examples: 
      | first name | last name | user name  | gender | designation | email      | previleges |
      | test       | user      | @gmail.com | Female | Tester      | @gmail.com | all        |
