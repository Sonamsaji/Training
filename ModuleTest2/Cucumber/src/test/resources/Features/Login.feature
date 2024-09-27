Feature: Validate add to cart functionality and verify the price is correct

  Scenario: User add a product to cart
    Given user is on homePage
    When user clicks Fish product icon
    Then verify user is on Fish product listing page
    When user clicks Angel Fish icon
    Then verify user is on AngleFish product listing page
    When user add a product to cart
    Then verify product is added to shopping cart

  Scenario: Add a product to the cart, increase its quantity, and verify the price
    Given user added a product to the cart
    And user increased the quantity of product and clicks update icon
    Then verify that the cart displays the updated quantity of the product
    And verify that the total price for the product in the cart reflects the correct amount based on the updated quantity




