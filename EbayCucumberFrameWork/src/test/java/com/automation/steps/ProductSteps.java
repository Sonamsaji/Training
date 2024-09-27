package com.automation.steps;

import com.automation.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ProductSteps {
    ProductPage productPage = new ProductPage();

    @When("user selects a laptop")
    public void user_selects_a_laptop_and_adds_it_to_the_cart() {
        productPage.clickOnLapTop();
    }

    @And("adds it to the cart")
    public void addsItToTheCart() {
        productPage.addToCart();
    }

    @And("user selects a iphone and add it to the cart")
    public void userSelectsAIphoneAndAddItToTheCart() {
        productPage.clickOnLapTop();
        productPage.addPhoneToCart();


    }

}
