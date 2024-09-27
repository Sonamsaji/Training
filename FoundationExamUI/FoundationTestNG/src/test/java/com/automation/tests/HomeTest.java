package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest{

    @Test
    public void userAddProductToCart(){
        homePage.openWebsite();
        homePage.userClicksMensShirtIcon();
        homePage.userClicksAProduct();
//        homePage.userSelectRequirements();
        homePage.userClicksAddToCartIcon();
//        Assert.assertEquals(homePage.verifyCartCount(),"1");
    }

}
