package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    WebElement usernameInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    public LoginPage() {
        this.driver = DriverManager.getDriver();
    }

    public void openWebsite() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    public void doLogin(String username, String password) {
        WebElement loginButton = driver.findElement(By.xpath("//button"));
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }



}
