package com.automation.Tests;

import com.automation.Pages.HomePage;
import com.automation.Pages.RegistrationPage;
import com.automation.Utils.ConfigReader;
import com.automation.Utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    HomePage homePage;
    RegistrationPage registrationPage;


    @BeforeMethod
    public void setUp() {
        DriverManager.createDriver();
        ConfigReader.initConfig();
        homePage = new HomePage();
        registrationPage = new RegistrationPage();
    }

    @AfterMethod
    public void clearUp() {
        DriverManager.getDriver().quit();
    }
}
