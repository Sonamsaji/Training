Feature: verify admin operations are working properly in application
  Scenario: verify at least one admin user is present in user list
    Given user open website
    Then verify user is on login page
    When user login with valid credentials
    Then verify user is on home page
    When user click on admin option
    Then verify user is on admin page
    When user select user role to "Admin" from dropdown
    And  user click on search button
    Then verify the list of users are greater than or equal to 1
