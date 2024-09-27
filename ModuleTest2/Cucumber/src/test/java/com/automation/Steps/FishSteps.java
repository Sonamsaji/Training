package com.automation.Steps;

import com.automation.Pages.FishPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FishSteps {
    FishPage fishPage = new FishPage();

    @Then("verify user is on Fish product listing page")
    public void verify_user_is_on_fish_product_listing_page() {
        Assert.assertEquals(fishPage.isUserInFishPage(), "Fish");
    }

    @When("user clicks Angel Fish icon")
    public void user_clicks_angel_fish_icon() {
        fishPage.clickAngelFishIcon();
    }
}
