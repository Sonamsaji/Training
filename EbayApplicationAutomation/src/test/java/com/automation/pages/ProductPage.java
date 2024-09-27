package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    @FindBy(id = "com.ebay.mobile:id/textview_header_title")
    WebElement pageHeader;

    public String isProductPage(){
        return pageHeader.getText();
    }

}
