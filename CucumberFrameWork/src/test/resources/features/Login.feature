Feature: Validate login functionality
  Scenario: verify user can login with valid credentials
    Given user opens the website
    Then verify user is on login page
    When  user enters username "valid.username" and password "valid.password"
    Then verify user is on home page

  Scenario: Verify user login with invalid credentials
    Given user opens the website
    Then verify user is on login page
    When user enters username "invalid.username" and password "valid.password"
    Then verify locked out user error message is displayed as below
      |Sorry, this user has been locked out.|

  Scenario: Verify the default product order matches A to Z order
    Given user opens the website
    Then verify user is on login page
    When user enters username "valid.username" and password "valid.password"
    Then verify user is on home page
    When user filters the products by name in Z to A order
    Then verify the product is filtered

  Scenario: Verify the default product order matches A to Z order
    Given user opens the website
    Then verify user is on login page
    When user enters username "problem.username" and password "valid.password"
    Then verify user is on home page
    When user filters the products by name in Z to A order
    Then verify the product is filtered

#  Scenario: Verify the default product price matches low to high order
#    Given user opens the website
#    Then verify user is on login page
#    When user enters username "valid.username" and password "valid.password"
#    Then verify user is on home page
#    When user filters the products by price from low to high
#    Then verify the product is filtered in low to high