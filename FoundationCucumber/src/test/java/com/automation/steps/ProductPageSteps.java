package com.automation.steps;

import com.automation.pages.ProductPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @Then("verify user is on urban shirt product listing page")
    public void verifyUserIsOnUrbanShirtProductListingPage() {
        // Get the actual text
        String actualText = productPage.verifyProductPage();

        // Compare the texts
        Assert.assertEquals(actualText, ConfigReader.getConfigProperty("expectedText"));
    }

}
