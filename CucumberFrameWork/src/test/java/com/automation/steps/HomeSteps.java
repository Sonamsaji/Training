package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomeSteps {
    HomePage  homePage = new HomePage();
    @Then("verify user is on home page")
    public void verify_user_is_on_home_page(){
        Assert.assertTrue(homePage.isHomePageIsDisplayed());
    }

    @When("user filters the products by name in Z to A order")
    public void userFiltersTheProductsByNameInZToAOrder() {
        homePage.isClickFilterIcon();
    }
    @Then("verify the product is filtered")
    public void verifyTheProductIsFiltered() {
        Assert.assertTrue(homePage.isFilteringWorks());
    }

//    @When("user filters the products by price from low to high")
//    public void userFiltersTheProductsByPriceFromLowToHigh() {
//        homePage.isPriceLowHighIcon();
//    }
//
//    @Then("verify the product is filtered in low to high")
//    public void verifyTheProductIsFilteredInLowToHigh() {
//        Assert.assertTrue(homePage.isPriceFilteringWorks());
//    }
}
