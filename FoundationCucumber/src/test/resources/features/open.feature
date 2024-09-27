Feature: Verify user is on product page

  Scenario: Verify user is on correct page
    Given user is on homePage
    When user clicks men's shirt icon
    And user clicks urban shirts
    Then verify user is on urban shirt product listing page
