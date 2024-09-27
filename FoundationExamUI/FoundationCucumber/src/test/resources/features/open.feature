Feature: Verify user can add products

  Scenario: Verify user can add product to cart
    Given user is on homePage
    When user clicks men's shirt icon
    And user clicks urban shirts
    Then verify user is on urban shirt product listing page
