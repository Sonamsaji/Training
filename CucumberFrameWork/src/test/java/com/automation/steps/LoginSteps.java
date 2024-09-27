package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user opens the website")
    public void user_opens_the_website() {
        loginPage.openWebsite();

    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());

    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String userNameKey, String passwordKey) {
        loginPage.doLogin(ConfigReader.getConfigValue(userNameKey), ConfigReader.getConfigValue(passwordKey));

    }


    @Then("verify locked out user error message is displayed as below")
    public void verifyLockedOutUserErrorMessageIsDisplayedAsBelow(String errorMessage) {
        // Assert.assertEquals(errorMessage, loginPage.getInvalidLoginErrorMessage());
        Assert.assertTrue(loginPage.getInvalidLoginErrorMessage().contains(errorMessage));
    }
}




