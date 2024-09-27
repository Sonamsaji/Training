package com.automation.selenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
    @Test
    public void softAssertTest(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(4,4);
        softAssert.assertEquals(10,11);
        softAssert.assertTrue(10 >= 11);
        softAssert.assertAll();
    }
}
