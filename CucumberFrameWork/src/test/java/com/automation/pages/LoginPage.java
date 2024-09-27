package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement userInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement signInBtn;

    @FindBy(xpath = "//h3[@data-test='error']")
    WebElement getInvalidLoginErrorMessage;



    public void openWebsite(){
        driver.get("https://www.saucedemo.com/");
    }
    public void doLogin(String username,String password){


        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInBtn.click();
    }
    public boolean isLoginPageDisplayed(){

        return userInput.isDisplayed() && passwordInput.isDisplayed();
    }
    public String getInvalidLoginErrorMessage(){
        return getInvalidLoginErrorMessage.getText();
    }
}