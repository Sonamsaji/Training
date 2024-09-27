package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AngelFishPage extends BasePage {
    //Locator for getting AngelFish Text
    @FindBy(xpath = "//h2")
    WebElement angelFishText;
    //Locator for add To Cart
    @FindBy(xpath = "//table//a[text()='Add to Cart']")
    WebElement addToCart;
    //Locator to get product ID from table in AngelFish listing Page
    @FindBy(xpath = "//table//a[text()='EST-1']")
    WebElement productNameText;

    public String isUserInAngelFishPage() {
        return angelFishText.getText();
    }

    public void clickAddToCart() {
        addToCart.click();
    }

    public String getProductNameId() {
        return productNameText.getText();
    }
}
