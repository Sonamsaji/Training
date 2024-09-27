package com.automation.Steps;

import com.automation.Pages.AngelFishPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AngelFishSteps {
    AngelFishPage angelFishPage = new AngelFishPage();

    @Then("verify user is on AngleFish product listing page")
    public void verify_user_is_on_angle_fish_product_listing_page() {
        Assert.assertEquals(angelFishPage.isUserInAngelFishPage(), "Angelfish");
    }

    @When("user add a product to cart")
    public void user_add_a_product_to_cart() {
        angelFishPage.clickAddToCart();
    }
}
