package com.automation.Tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void isWebsiteOpening(){
        homePage.openWebsite();
    }
}
