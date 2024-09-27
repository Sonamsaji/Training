package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("user is on homePage")
    public void user_is_on_home_page() {
        homePage.openWebsite();
    }

    @When("user clicks men's shirt icon")
    public void userClicksMenSShirtIcon() {
        homePage.clicksMensShirtIcon();
    }

}
