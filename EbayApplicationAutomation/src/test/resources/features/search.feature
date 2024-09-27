Feature: verify search functionality
  Scenario: user searches on ebay application
    Given user is on ebay application
    When user clicks on search icon
    And search for "product.name"
    Then verify user is on product page and display list of products

