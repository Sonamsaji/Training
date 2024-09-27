package com.automation.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
    @Given("user open website")
    public void user_open_website() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("user login with valid credentials")
    public void user_login_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }

    @And("click on logout link")
    public void clickOnLogoutLink() {

    }

    @When("user click on user icon")
    public void userClickOnUserIcon() {
    }

    @When("user login with invalid credentials")
    public void userLoginWithInvalidCredentials() {
        
    }

    @Then("verify invalid login error message is displayed")
    public void verifyInvalidLoginErrorMessageIsDisplayed() {
    }

    @When("user login with username {string} and password {string}")
    public void userLoginWithUsernameAndPassword(String arg0, String arg1) {
    }
}
