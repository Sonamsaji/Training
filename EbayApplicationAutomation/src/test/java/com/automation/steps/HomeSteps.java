package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user is on ebay application")
    public void user_is_on_ebay_application() {
        homePage.openApplication();
    }

    @When("user clicks on search icon")
    public void userClicksOnSearchIcon() {
        homePage.clickSearchIcon();
    }

    //zoomEbay
    @Given("user opens the ebay application")
    public void user_opens_the_ebay_application() {
        homePage.openApplication();
    }
    @Given("search with keyword {string}")
    public void search_with_keyword(String keyword) {
        homePage.searchWithKeyword(keyword);
    }
    @Given("click on the first item")
    public void click_on_the_first_item() {
        homePage.clickOnFirstLink();
    }


}
