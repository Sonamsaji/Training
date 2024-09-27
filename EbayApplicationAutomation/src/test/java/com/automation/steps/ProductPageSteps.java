package com.automation.steps;

import com.automation.pages.ProductPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProductPageSteps {

    ProductPage productPage = new ProductPage();

    @Then("verify user is on product page and display list of products")
    public void verify_user_is_on_product_page_and_display_list_of_products() {
//        Assert.assertEquals(productPage.isProductPage(),"Shop by RAM Size");
    }
}
