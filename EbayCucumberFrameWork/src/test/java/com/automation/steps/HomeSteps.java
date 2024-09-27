package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("User opens ebay home page")
    public void user_opens_ebay_home_page() {
        homePage.openWebsite();
    }

    @When("user searches for {string}")
    public void user_searches_for(String string) {
        homePage.searchForLapTop(string);
        homePage.switchToNewTab();
    }


}
