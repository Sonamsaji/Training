package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.awt.geom.Arc2D;
import java.util.List;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"gh-cart-n\"]")
    WebElement cartCountTwo;

    @FindBy(className = "price-details")
    List<WebElement> productPrice;

    @FindBy(className = "logistics-costs")
    List<WebElement> taxForProduct;

    @FindBy(xpath = "//*[@id=\"mainContent\"]//div[4]/div[2]/span/span/span")
    WebElement finalCartPrice;

    public String isCartCountTwo() {
        return cartCountTwo.getText().trim();
    }

    public Double getPrice() {
        double prodAmount = productPrice.stream().map(WebElement::getText).map(e -> e.contains("Free") ? "0.0" : (e.split("\\$"))[1].replace(",", "")).mapToDouble(Double::parseDouble).sum();
        double taxAmount = taxForProduct.stream().map(WebElement::getText).map(e -> e.contains("Free") ? "0.0" : (e.split("\\$"))[1].replace(",", "")).mapToDouble(Double::parseDouble).sum();
        return prodAmount + taxAmount;
    }

    public Double getCartPrice() {
        String[] str = finalCartPrice.getText().split("\\$");
        String strTotal = str[1].trim().replace(",", "");
        return Double.parseDouble(strTotal);
    }

}
