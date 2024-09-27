package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        ConfigReader.initConfig();
        DriverManager.createdRiver();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @AfterMethod
    public void cleanUp(){
        DriverManager.getDriver().quit();
    }
}
