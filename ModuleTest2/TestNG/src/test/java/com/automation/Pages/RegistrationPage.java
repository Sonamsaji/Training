package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;

public class RegistrationPage extends BasePage {

    //Locator for SignIn button
    @FindBy(xpath = "//a[text()='Sign In']")
    WebElement signInButton;

    //locator for register now button
    @FindBy(xpath = "//div//a[text()='Register Now!']")
    WebElement registerNow;

    //locator for userId
    @FindBy(xpath = "//input[@name='username']")
    WebElement userIds;

    //locator for newPassword
    @FindBy(xpath = "//input[@name='password']")
    WebElement newPasswordText;

    //locator for repeatPassword
    @FindBy(xpath = "//input[@name='repeatedPassword']")
    WebElement repeatPasswordText;

    //locator for firstName
    @FindBy(xpath = "//input[@name='account.firstName']")
    WebElement firstName;

    //locator for lastName
    @FindBy(xpath = "//input[@name='account.lastName']")
    WebElement lastName;

    //locator for email
    @FindBy(xpath = "//input[@name='account.email']")
    WebElement email;

    //locator for phone
    @FindBy(xpath = "//input[@name='account.phone']")
    WebElement phone;

    //locator for address1
    @FindBy(xpath = "//input[@name='account.address1']")
    WebElement address1;

    //locator for address2
    @FindBy(xpath = "//input[@name='account.address2']")
    WebElement address2;

    //locator for city
    @FindBy(xpath = "//input[@name='account.city']")
    WebElement city;

    //locator for state
    @FindBy(xpath = "//input[@name='account.state']")
    WebElement state;

    //locator for zip
    @FindBy(xpath = "//input[@name='account.zip']")
    WebElement zip;

    //locator for country
    @FindBy(xpath = "//input[@name='account.country']")
    WebElement country;

    //locator for create account
    @FindBy(xpath = "//input[@name='newAccount']")
    WebElement newAccountButton;

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickRegisterNow() {
        registerNow.click();
    }

    public void enterUserId(String id) {
        userIds.sendKeys(id);
    }

    public void enterPassword(String newPassword) {
        newPasswordText.sendKeys(newPassword);
    }

    public void enterRepeatPassword(String password) {
        repeatPasswordText.sendKeys(password);
    }

    public void enterFirstName(String fstName) {
        firstName.sendKeys(fstName);
    }

    public void enterLastName(String lstName) {
        lastName.sendKeys(lstName);
    }

    public void enterEmail(String id) {
        email.sendKeys(id);
    }

    public void enterPhone(String id) {
        phone.sendKeys(id);
    }

    public void enterAddress1(String id) {
        address1.sendKeys(id);
    }

    public void enterAddress2(String id) {
        address2.sendKeys(id);
    }

    public void enterCity(String id) {
        city.sendKeys(id);
    }

    public void enterState(String id) {
        state.sendKeys(id);
    }

    public void enterZip(String id) {
        zip.sendKeys(id);
    }

    public void enterCountry(String id) {
        country.sendKeys(id);
    }

    public void clickNewAccountButton() {
        newAccountButton.click();
    }

    public String isRegistered() {
        return signInButton.getText();
    }

}
