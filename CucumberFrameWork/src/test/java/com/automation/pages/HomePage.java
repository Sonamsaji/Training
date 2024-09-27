package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomePage extends BasePage {

    @FindBy(id = "react-burger-menu-btn")
    WebElement breadCrumIcon;

    @FindBy(id = "logout_sidebar_link")
    WebElement logoutLink;

    @FindBy(className = "product_sort_container")
    WebElement filterDropDown;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    @FindBy(id = "item_4_title_link")
    WebElement productClick;

    @FindBy(id = "add-to-cart")
    WebElement addToCart;

    @FindBy(className = "shopping_cart_badge")
    WebElement getCartIcon;

    @FindBy(className = "shopping_cart_link")
    WebElement cartImg;

    @FindBy(className = "cart_desc_label")
    WebElement cartProduct;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> productListForFilterSorting;

    @FindBy(className = "product_sort_container")
    WebElement clickFilterIcon;

    @FindBy(xpath = "//select[@class='product_sort_container']//option[2]")
    WebElement clickFilterIconZToA;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")
    WebElement clickFilterlowToHigh;

    @FindBy(className = "inventory_item_price")
    private List<WebElement> productListForPriceSorting;

    public void clickOnBurgerMenu() {
        //click logout
        breadCrumIcon.click();
    }

    public void clickOnLogoutLink() {
        logoutLink.click();
    }

    public boolean isHomePageIsDisplayed() {

        return filterDropDown.isDisplayed() && cartIcon.isDisplayed();
    }

    public void addtoCart() {
        productClick.click();
        addToCart.click();
    }

    public String updateCartIcon() {
        return getCartIcon.getText();
    }

    public void verifyCart(){
        cartImg.click();
    }
    public String verifyProductPresent(){
        return cartProduct.getText();
    }
    public void isClickFilterIcon(){
        clickFilterIcon.click();
        clickFilterIconZToA.click();
    }
    public boolean isFilteringWorks(){
        List<String> productList = new ArrayList<>();
        for (WebElement i: productListForFilterSorting ){
            productList.add(i.getText());
        }
        List<String> copy1 = new ArrayList<>(productList);
        Collections.sort(productList);
        Collections.reverse(productList);
        return copy1.equals(productList);
    }
//    public void isPriceLowHighIcon(){
//        clickFilterIcon.click();
//        clickFilterlowToHigh.click();
//    }
//    public boolean isPriceFilteringWorks(){
//        List<String> productList = new ArrayList<>();
//        for (WebElement i: productListForPriceSorting ){
//            productList.add(i.getText());
//        }
//        List<String> copy1 = new ArrayList<>(productList);
//        Collections.sort(productList);
//        return copy1.equals(productList);
//    }


}
