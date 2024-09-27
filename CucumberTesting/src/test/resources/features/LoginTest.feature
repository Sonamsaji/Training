Feature: As a user, I want to login in to the application
  Background:
    Given user open website
    Then verify user is on login page

  Scenario: Verify user can login with valid credentials
    When user login with valid credentials
    Then verify user is on home page

  Scenario: Verify user can logout of the application
    When user login with username "admin" and password "admin123"
    Then verify user is on home page
    When user click on user icon
    And click on logout link
    Then verify user is on login page

  Scenario: verify error message for invalid login credentials
    When user login with username "<username>" and password "<password>"
    Then verify invalid login error message is displayed

  Example:
    | username | password |
    | test     | test123  |
    | demo     | demo123  |
    | hello    | hello123 |
    | java     | java123  |

