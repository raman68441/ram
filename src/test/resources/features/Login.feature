@regression @login
Feature: Login functionality

  @test1
  Scenario: login with valid credentials
    Given User launched the application
    When User verify 'forgot password' field name in login page
    And User verify 'user name default text' in login page
    And User verify 'password default text' in login page
    And User verify 'or field' field name in login page
    Then User verify 'login to dms' field name in login page
    And User clicks on 'login' button in login page
    Then User enters 'user name' in 'username' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'password protection off' button in login page
    Then User verifies password protection status is 'off'
    And User clicks on 'password protection on' button in login page
    Then User verifies password protection status is 'on'
    And User clicks on 'login' button in login page
    Then User verifies 'txt full name' is displayed in 'user name' field
    Then User verifies 'txt email id' is displayed in 'email id' field
    Then User clicks on 'close button'
    Given User launched the application
    Then User clicks on 'hover activated menu'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
    Then User clicks on 'back button'
    Then User clicks on 'forward button'
    Then User verify 'login to dms' field name in login page

  @test1
  Scenario: verify user is loged in after closing the application without logging out
    Given User launched the application
    Then User enters 'user name' in 'username' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'txt full name' is displayed in 'user name' field
    Then User verifies 'txt email id' is displayed in 'email id' field
    Then User clicks on 'new window'
    Then User clicks on 'close button'
    And User launched the application
    Then User verifies 'txt full name' is displayed in 'user name' field
    Then User verifies 'txt email id' is displayed in 'email id' field
    Then User clicks on 'refresh button'
    Then User verifies 'txt full name' is displayed in 'user name' field
    Then User verifies 'txt email id' is displayed in 'email id' field
    Then User clicks on 'hover activated menu'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @test1
  Scenario: verify after maximum number of unsuccessful login attempts with invalid password then not able to login with valid passwod
    Given User launched the application
    When User verify 'forgot password' field name in login page
    Then User enters 'user name1' in 'username' field of login page
    Then User enters invalid and click on login button in login page
      | invalid password1 |
      | invalid password2 |
      | invalid password3 |
      | invalid password4 |
      | invalid password5 |
      | valid password    |
    Then User verify 'login warning message' in login page

  @test1
  Scenario Outline: login with invalid credentials
    Given User launched the application
    When User verify 'forgot password' field name in login page
    Then User enters "<user name>" in 'username' field of login page
    Then User enters "<password>" in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verify 'login warning message' in login page

    Examples: 
      | user name            | password     |
      | abc123@gmail.com     | srinivas@    |
      | srinivas             | srinivas@    |
      | srinivas@neviton     | srinivas@    |
      | srinivas@            | srinivas@    |
      | srinivas@neviton.c   | srinivas@    |
      | abc123@gmail.com     | srinivas@123 |
      | srinivas             | srinivas@123 |
      | srinivas@neviton     | srinivas@123 |
      | srinivas@            | srinivas@123 |
      | srinivas@neviton.c   | srinivas@123 |
      | srinivas@neviton.com | abc123       |
      | srinivas@neviton.com | !@#ABC       |
      | srinivas@neviton.com | abc@         |
      | srinivas@neviton.com |       789987 |

  @test
  Scenario: Verify Forgot password screen
    Given User launched the application
    When User verify 'forgot password' field name in login page
    And User clicks on 'forgot password' button in login page
    When User verify 'forgot password' field in forgot password page
    Then User verify 'resolve message' field in forgot password page
    And User verify 'email default text' in forgot password page
    Then User verify 'document management system text' in forgot password page
    And User verify 'back to login link text' in forgot password page
    And User verify 'submit field text' in forgot password page
    Then User enters 'abcd' in 'email id' field of forgotten password page
    And User clicks on 'submit' button in forgot password page
    And User verify 'email id label' in forgot password page
    And User clicks on 'back to login link' in forgot password page
    Then User verify 'login to dms' field name in login page
    And User clicks on 'forgot password' button in login page
    When User verify 'forgot password' field in forgot password page
    Then User clicks on 'back button'
    Then User verify 'login to dms' field name in login page
    Then User clicks on 'forward button'
    When User verify 'forgot password' field in forgot password page
    Then User enters 'user name' in 'email id' field of forgotten password page
    And User clicks on 'submit' button in forgot password page
    When User verify 'forgot password' field in forgot password page
    Then User verify 'resolve message' field in forgot password page
    And User verify '"email id field diabled"' in forgot password page
    And User verify 'password default text' in forgot password page
    And User verify 'email field label text' in forgot password page
    And User verify 'enter otp default text' in forgot password page
    Then User verify 'otp field type' in forgot password page
    Then User verify 'document management system text' in forgot password page
    And User verify 'back to login link text' in forgot password page
    And User verify 'reset password' in forgot password page
    And User clicks on 'password protection off' button in forgot password page
    Then User verifies password protection status is 'off'
    And User clicks on 'password protection on' button in forgot password page
    Then User verifies password protection status is 'on'
    And User clicks on 'reset password' button in forgot password page
    And User verify 'otp warning message' in forgot password page
    Then User clicks on 'back button'
    And User verify 'submit field text' in forgot password page
    Then User clicks on 'forward button'
    And User verify 'email field label text' in forgot password page
    And User clicks on 'back to login link' in forgot password page
    Then User verify 'login to dms' field name in login page
