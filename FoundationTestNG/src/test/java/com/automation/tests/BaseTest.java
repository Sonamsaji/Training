package com.automation.tests;

import com.automation.pages.HomePage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    HomePage homePage;


    @BeforeMethod
    public void setUp() {
        DriverManager.createDriver();
        ConfigReader.initConfig();
        homePage = new HomePage();
    }
    @AfterMethod
    public void clearUp(){
        //DriverManager.getDriver().quit();
    }
}
