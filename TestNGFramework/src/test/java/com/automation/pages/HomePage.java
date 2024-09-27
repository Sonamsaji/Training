package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "react-burger-menu-btn")
    WebElement burgerMenu;
    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;
    @FindBy(css = ".product_sort_container")
    WebElement filterDropDown;
    @FindBy(css = ".shopping_cart_link")
    WebElement cartIcon;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addProductCart;
    //cart
    @FindBy(id = "shopping_cart_link")
    WebElement clickCartIcon;
    @FindBy(css = ".shopping_cart_badge")
    WebElement cartQuantity;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addProductTwoCart;
    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement addProductThreeCart;
    @FindBy(id = "remove-sauce-labs-backpack")
    WebElement removeProductOneCart;
    //checkout
    @FindBy(id = "checkout")
    WebElement clickCheckout;


    public HomePage() {
        this.driver = DriverManager.getDriver();
    }

    public void clickOnBurgerMenu() {
        burgerMenu.click();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public boolean isHomePageDisplayed() {
        return filterDropDown.isDisplayed() && cartIcon.isDisplayed();
    }

    public void addToCart() {
        addProductCart.click();
//        clickCartIcon.click();
    }

    public boolean productSuccessfullyAdded() {
        // Check the cart quantity for confirmation
        String quantity = cartQuantity.getText();
        return quantity.equals("1");
    }

    public void addThreeItemsToCart() {
        addProductCart.click();
        addProductTwoCart.click();
        addProductThreeCart.click();
        removeProductOneCart.click();
    }

    public boolean productSuccessfullyRemoved() {
        String quantity = cartQuantity.getText();
        return quantity.equals("2");
    }

    public void firstnameValidationForPurchasingProduct() {
        addProductCart.click();
        addProductTwoCart.click();
        addProductThreeCart.click();
        cartQuantity.click();
        clickCheckout.click();
    }
}
