package com.automation.pages;

import com.automation.test.BaseTest;
import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    WebElement usernameInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "login-button")
    WebElement signInBtn;

//    WebDriver driver;
    public LoginPage(){
        this.driver= DriverManager.getDriver();
    }
    public  void openWesite(){
        driver.get("https://www.saucedemo.com/");
    }
    public void doLogin(String username , String password){
        WebElement userInput = driver.findElement(By.id("user-name"));
        WebElement passwordInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        userInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

    }
    public boolean isLoginPageDisplayed(){
        return usernameInput.isDisplayed() && passwordInput.isDisplayed();
    }
}
