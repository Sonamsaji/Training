Feature: Add item to cart and calculate bill on ebay

  Scenario: Add a laptop and a phone to the cart and verify total bill
    Given User opens ebay home page
    When user searches for "laptop"
    And user selects a laptop
    And adds it to the cart
    And user searches for "Samsung Galaxy S23 FE 5G Graphite"
    And user selects a iphone and add it to the cart
    Then user verifies the items in the cart
    And user calculates the total bill including tax
    And user verifies the calculated total bill is correct
