package com.automation.Steps;

import com.automation.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("user is on homePage")
    public void user_is_on_home_page() {
        homePage.openWebsite();
    }

    @When("user clicks Fish product icon")
    public void user_clicks_fish_product_icon() {
        homePage.userClickFishIcon();
    }


}
