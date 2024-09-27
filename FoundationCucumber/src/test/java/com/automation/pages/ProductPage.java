package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    //Locator for getting text
    @FindBy(xpath = "//div[@class='right-side']//h1")
    WebElement urbanShirtText;

    public String verifyProductPage() {
        // trim the actual text
        String str = urbanShirtText.getText().trim();
        // Convert to upper case
        return str.toUpperCase();
    }


}
