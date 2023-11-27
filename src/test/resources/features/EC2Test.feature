@ec2Test
Feature: Master product functionality

  Scenario Outline: validate newly created product in product list
    Given User launched the application
    When User clicks on 'Arcolab Bangalore' in login page
    And User clicks on 'Vender Login' in login page
    Then User enters 'username' in login page
    Then User enters 'password' in login page
    And User clicks on 'login' button in login page
    Then User clicks on 'e-commerce' button
    Then User clicks on 'product master' option
