package com.automation.Pages;

import com.automation.Utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    //Locator to get text inside table/cart
    @FindBy(xpath = "//table//a[text()='EST-1']")
    WebElement cartProductText;
    //updating quantity
    @FindBy(xpath = "//table//input[@name='EST-1']")
    WebElement quantityUpdateBox;
    //Locator for Update button
    @FindBy(xpath = "//table//input[@name='updateCartQuantities']")
    WebElement updateIcon;
    // Locator for the total price element in the cart
    @FindBy(xpath = "//*[@id=\"Cart\"]//table//tr[2]/td[7]")
    WebElement totalPriceElement;

    public String getCartProductId() {
        return cartProductText.getText();
    }

    public void updateQuantity() {
        quantityUpdateBox.clear();
        quantityUpdateBox.sendKeys(ConfigReader.getConfigProperty("quantity"));
    }

    public void clickUpdateIcon() {
        updateIcon.click();
    }

    public String verifyQuantity() {
        return quantityUpdateBox.getAttribute("value");
    }

    public String getTotalPrice() {
        String priceText = totalPriceElement.getText();
        // Remove currency symbol and any extra characters
        return priceText.replaceAll("[^\\d.]", "");
    }

}
