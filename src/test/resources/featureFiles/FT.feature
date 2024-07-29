Feature: login
  The user should be able to access his account using login functionality

  Background: 
    Given User has opened the application URL
    And Navigated to Login Page
@Smoke @regression
  Scenario Outline: Login with valid credentials
    When Enters valid email address <username>
    And User Enters valid password <password>
    And Clicks on Login button
    Then User should be able to successfully login

    Examples: 
      | username                   | password  |
      | arjunyalapalli44@gmail.com | Arjun@123 |
      | arjunyalapalli33@gmail.com | Arjun@124 |

@Smoke
  Scenario: Login with Invalid credentials
    When User enters invalid email address "arjunyalapalli434@gmail.com"
    And Enters invalid password "Arjun@1233"
    And Clicks on Login button
    Then User should not be able to login
    And get proper warning message
@sanity
  Scenario: Login with valid username and invalid password
    When User enters valid email address "arjunyalapalli45@gmail.com"
    And Enters invalid password "Arjun@12dw3"
    And Clicks on Login button
    Then User should not be able to login
    And get proper warning message
