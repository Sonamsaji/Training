package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    HomePage homePage = new HomePage();
    //click laptop icon/Text
    @FindBy(xpath = "//li[contains(@id,'item')][1]//span[@role='heading']")
    WebElement selectLaptop;
    //click add to cart
    @FindBy(xpath = "//span[text()='Add to cart']")
    WebElement lapTopAddToCartIcon;
    //click iphone add to cart
    @FindBy(xpath = "//span[text()='Add to cart']")
    WebElement addPhoneToCart;

    public void clickOnLapTop() {
        selectLaptop.click();
    }

    public void addToCart() {
        homePage.switchToNewTab();
        lapTopAddToCartIcon.click();
        driver.close();
        driver.switchTo().window(driver.getWindowHandles().stream().toList().getFirst());
    }

    public void addPhoneToCart() {
        homePage.switchToNewTab();
        addPhoneToCart.click();
    }

}
