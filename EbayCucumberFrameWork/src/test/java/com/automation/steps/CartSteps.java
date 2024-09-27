package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Then("user verifies the items in the cart")
    public void user_verifies_the_items_in_the_cart() {
        Assert.assertEquals(" 2 items are not added", "2", cartPage.isCartCountTwo());
    }

    @Then("user calculates the total bill including tax")
    public void user_calculates_the_total_bill_including_tax() {
        cartPage.getPrice();
    }

    @Then("user verifies the calculated total bill is correct")
    public void user_verifies_the_calculated_total_bill_is_correct() {
        Assert.assertEquals("not same", cartPage.getCartPrice(), cartPage.getPrice());
    }
}
