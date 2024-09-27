package com.automation.Steps;

import com.automation.Pages.AngelFishPage;
import com.automation.Pages.FishPage;
import com.automation.Pages.HomePage;
import com.automation.Pages.ShoppingCartPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ShoppingCartSteps {
    AngelFishPage angelFishPage = new AngelFishPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    HomePage homePage = new HomePage();
    FishPage fishPage = new FishPage();

    @Then("verify product is added to shopping cart")
    public void verifyProductIsAddedToShoppingCart() {
        Assert.assertEquals(angelFishPage.getProductNameId(), shoppingCartPage.getCartProductId());
    }

    @Given("user added a product to the cart")
    public void user_added_a_product_to_the_cart() {
        homePage.openWebsite();
        homePage.userClickFishIcon();
        fishPage.clickAngelFishIcon();
        angelFishPage.clickAddToCart();
    }

    @Given("user increased the quantity of product and clicks update icon")
    public void user_increased_the_quantity_of_product_and_clicks_update_icon() {
        shoppingCartPage.updateQuantity();
        shoppingCartPage.clickUpdateIcon();
    }

    @Then("verify that the cart displays the updated quantity of the product")
    public void verify_that_the_cart_displays_the_updated_quantity_of_the_product() {
//        Assert.assertEquals(shoppingCartPage.verifyQuantity(),"3");
        // Assuming quantity is updated to "3"
        String expectedQuantity = "3";
        String actualQuantity = shoppingCartPage.verifyQuantity();
        Assert.assertEquals(actualQuantity, expectedQuantity);
    }

    @Then("verify that the total price for the product in the cart reflects the correct amount based on the updated quantity")
    public void verify_that_the_total_price_for_the_product_in_the_cart_reflects_the_correct_amount_based_on_the_updated_quantity() {
        Assert.assertEquals(shoppingCartPage.getTotalPrice(), "49.50");
    }
}
