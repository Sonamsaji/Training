package com.automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.automation.Utils.DriverManager;

public class BasePage {
    WebDriver driver;

    public BasePage() {
        driver = DriverManager.getDriver();
        PageFactory.initElements(driver, this);
    }
}
