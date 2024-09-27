package com.automation.test;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.automation.utils.ExtentReportManager;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLoginWithValidCredentials() throws IOException {
        loginPage.openWesite();
        loginPage.doLogin(ConfigReader.getConfigValue("login.username"), ConfigReader.getConfigValue("login.password"));
//        test.addScreenCaptureFromPath(takeScreenShot());
        ExtentReportManager.attachScreenshot();
//        DriverManager.ExtendReportManager.attachScreenshot();
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home page is not loaded properly");
    }

    @Test
    public void verifyUserCanLogout() {
//        LoginPage loginPage = new LoginPage();
        loginPage.openWesite();
        loginPage.doLogin("standard_user", "secret_sauce");
//        HomePage homePage = new HomePage();
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Home page is not loaded properly");
        homePage.clickOnBurgerMenu();
        homePage.clickLogoutLink();
        Assert.assertTrue(loginPage.isLoginPageDisplayed(), "No login page displayed");
    }

    @Test
    public void verifyProductCanBeAddedToCart() {
        loginPage.openWesite();
        loginPage.doLogin("standard_user", "secret_sauce");
        homePage.addToCart();
        Assert.assertTrue(homePage.productSuccessfullyAdded(), "Item not added to cart");
    }

    @Test
    public void verifyProductsCanBeRemoved() {
        loginPage.openWesite();
        loginPage.doLogin("standard_user", "secret_sauce");
        homePage.addThreeItemsToCart();
        Assert.assertTrue(homePage.productSuccessfullyRemoved(), "Item is not removed");
    }
}
