package com.automation.test;

import com.automation.utils.ConfigReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyUserCanLoginWithValidCredentials(){
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValues("login.username"), ConfigReader.getConfigValues("login.password"));
    }
    @Test
    public void verifyAdminClickIsWorking(){
        loginPage.openWebsite();
        loginPage.doLogin(ConfigReader.getConfigValues("login.username"), ConfigReader.getConfigValues("login.password"));
        homePage.adminClickIsWorking();
        Assert.assertTrue(homePage.adminPageIsCorrectlyDisplaying(), "Admin page is not loading");
    }
}
