@regression @login
Feature: Login functionality

  @test1
  Scenario: 1_verify basic login functionality
    Given User launched the application
    When User verify 'forgot password' field name in login page
    And User verify 'email default text' in login page
    And User verify 'password default text' in login page
    Then User verify 'login to dms' field name in login page
    Then User verify 'enter your login details' field name in login page
    Then User verify 'login with sso link' field name in login page
    Then User verify 'powered by text' field name in login page
    Then User verify 'arcolab logo text' field name in login page
    And User clicks on 'login' button in login page
    Then User verify 'email is required field' in login page
    Then User verify 'password is required field' in login page
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'password protection off' button in login page
    Then User verifies password protection status is 'off'
    And User clicks on 'password protection on' button in login page
    Then User verifies password protection status is 'on'
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    And User verifies 'your profile option name' is displayed in 'your profile' field
    Then User verifies 'notifications option name' is displayed in 'notifications' field
    Then User clicks on 'logout option'
    Then User clicks on 'back button'
    Then User verify 'login to dms' field name in login page
    Then User enters 'invalid email id' in 'email' field of login page
    And User clicks on 'login' button in login page
    Then User verify 'invalid email' in login page

  @test1
  Scenario: 2_verify application is logged in status after user closed the application without logging out
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'new tab'
    Then User clicks on 'close button'
    And User switch to window number 0
    And User launched the application
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'refresh button'
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'

  @test1
  Scenario: 3_verify when application is logged out in one tab will reflect in other tab
    Given User launched the application
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'new tab'
    And User switch to window number 1
    And User launched the application
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'refresh button'
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'logged in user drop down'
    And User verifies 'logout option name' is displayed in 'logout' field
    Then User clicks on 'logout option'
    And User switch to window number 0
    Then User clicks on 'refresh button'
    Then User verify 'login to dms' field name in login page

  @test1
  Scenario Outline: 4_verify login functionality with invalid credentials and error message
    Given User launched the application
    When User verify 'forgot password' field name in login page
    Then User enters '<email id>' in 'email' field of login page
    Then User enters '<Password>' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verify '<Error Message>' in login page

    Examples: 
      | email id          | Password          | Error Message                          |
      | email id          | invalid password1 | invalid login credential error message |
      | email id          | invalid password2 | invalid login credential error message |
      | email id          | invalid password3 | invalid login credential error message |
      | email id          | valid password    | no error message                       |
      | invalid email id1 | invalid password4 | invalid login credential error message |

  @test1
  Scenario: 5_verify after clicking on enter key able to login application
    Given User launched the application
    When User verify 'forgot password' field name in login page
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'enter' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    And User clicks on 'logged in user drop down'
    Then User clicks on 'logout option'
    And User clicks on 'forgot password' button in login page
    Then User enters 'email id' in 'email id' field of forgotten password page
    And User clicks on 'enter' button in forgot password page
    Then User verify 'otp success message' in forgot password page

  @test1
  Scenario: 6_Verify Forgot password screen
    Given User launched the application
    When User verify 'forgot password' field name in login page
    And User clicks on 'forgot password' button in login page
    When User verify 'forgot password' field in forgot password page
    Then User verify 'resolve message' field in forgot password page
    And User verify 'email field default text' in forgot password page
    And User verify 'back to login link text' in forgot password page
    And User verify 'send email text' in forgot password page
    And User verify 'submit field text' in forgot password page
    Then User enters 'invalid email id' in 'email id' field of forgotten password page
    And User clicks on 'submit' button in forgot password page
    And User verify 'invalid email label' in forgot password page
    And User verify 'invalid email id label message' in forgot password page
    And User clicks on 'back to login link' button in forgot password page
    And User clicks on 'forgot password' button in login page
    Then User enters 'email id' in 'email id' field of forgotten password page
    And User clicks on 'submit' button in forgot password page
    Then User verify 'otp success message' in forgot password page
    And User verify 'enter otp default text' in forgot password page
    And User verify 'resend otp text' in forgot password page
    And User verify 'otp message text' in forgot password page
    Then User enters 'invalid digit otp' in 'otp' field of forgotten password page
    And User clicks on 'otp submit button' button in forgot password page
    And User verify 'otp less than six digit error message' in forgot password page
    Then User clicks on 'refresh button'
    Then User enters 'email id' in 'email id' field of forgotten password page
    And User clicks on 'submit' button in forgot password page
    Then User verify 'otp success message' in forgot password page
    Then User enters 'invalid otp' in 'otp' field of forgotten password page
    And User clicks on 'otp submit button' button in forgot password page
    #And User verify 'otp error message' in forgot password page
    And User clicks on 'back to login link' button in forgot password page
    Then User enters 'email id' in 'email' field of login page
    Then User enters 'password' in 'password' field of login page
    And User clicks on 'login' button in login page
    Then User verifies 'full name' is displayed in 'logged in user' field
    Then User verifies 'email id' is displayed in 'email id' field
    Then User clicks on 'logged in user drop down'
    Then User clicks on 'logout option'
    Then User verify 'login to dms' field name in login page

  @test1
  Scenario: 7_Verify erromessage for invalid email id in forgot password field
    Given User launched the application
    And User clicks on 'forgot password' button in login page
    Then User enters 'email id not registered' in 'email id' field of forgotten password page
    And User clicks on 'submit' button in forgot password page
    Then User verify 'invalid email error message' in forgot password page
    
    
