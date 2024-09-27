package com.automation.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //Searching for GoldFish and verifying user is getting correct output
    @Test
    public void searchForGoldFish() {
        homePage.openWebsite();
        homePage.clickSearchFieldIcon();
        homePage.clickSearchButton();
        Assert.assertEquals(homePage.verifyGoldFishingIsDisplaying(), homePage.getSearchText());
    }

}
