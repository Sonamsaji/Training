package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    //Locator for Men's shirt icon
    @FindBy(xpath = "//li[preceding-sibling::li[4]]/a\n")
    WebElement mensShirtIcon;
    //locator for selecting a product
    @FindBy(xpath = "//*[@id=\"__next\"]/section[1]/div/div[2]/div[3]/div[3]/a")
    WebElement selectPrice;
    //size

    @FindBy(xpath = "//*[@id=\"__next\"]//li[2]/div/div[2]/div[3]")
    WebElement clickExp;

    @FindBy(xpath="//*[@id=\"__next\"]//li[1]/select")
    WebElement userSelectOption1;

    //locator for green option
    @FindBy(xpath = "//*[@id=\"__next\"]//ul/li[1]/select/option[2]")
    WebElement userSelectsGreen;

    @FindBy(xpath="//*[@id=\"__next\"]//ul/li[2]/select")
    WebElement userSelectOption2;

    //locator for green option
    @FindBy(xpath = "//*[@id=\"__next\"]//ul/li[2]/select/option[2]")
    WebElement userSelectsSize1;

    //locator for color2
    @FindBy(xpath = " ")
    WebElement color2;

    //locator for secondColor
    @FindBy(xpath = "//*[@id=\"__next\"]//ul/li[3]/select/option[2]")
    WebElement color2Selection;

    //locator for size2 selection
    @FindBy(xpath = "//*[@id=\"__next\"]//ul/li[4]/select")
    WebElement size2Icon;

    //locator for size 2
    @FindBy(xpath = "//*[@id=\"__next\"]//li[4]/select/option[3]")
    WebElement size2Selection;


    //locator for color3
    @FindBy(xpath = "//*[@id=\"__next\"]//div[7]/ul/li[5]/select")
    WebElement color3;

    //locator for thirdColor
    @FindBy(xpath = "//*[@id=\"__next\"]//ul/li[5]/select/option[2]")
    WebElement color3Selection;

    //locator for size3 selection
    @FindBy(xpath = "//*[@id=\"__next\"]//ul/li[6]/select")
    WebElement size3Icon;

    //locator for size 3
    @FindBy(xpath = "//*[@id=\"__next\"]//ul/li[6]/select/option[5]")
    WebElement size3Selection;


    //locator for Add to cart
    @FindBy(xpath = "//*[@id=\"__next\"]/div[4]/section[1]/div/div[2]/div[9]/div[1]/a/img")
    WebElement addToCart;

    //locator for getting cart count
    @FindBy(xpath = "//*[@id=\"__next\"]//a[3]/span")
    WebElement cartCount;

    public void openWebsite() {
        driver.get(ConfigReader.getConfigProperty("url"));
    }
    public void userClicksMensShirtIcon(){
        mensShirtIcon.click();
    }
    public void userClicksAProduct(){
        selectPrice.click();
    }
//    public void userSelectRequirements(){
//        userSelectOption1.click();
//        userSelectsGreen.click();
//        userSelectOption2.click();
//        userSelectsSize1.click();
//        color2.click();
//        color2Selection.click();
//        size2Icon.click();
//        size2Selection.click();
//        color3.click();
//        color3Selection.click();
//        size3Icon.click();
//        size3Selection.click();
//    }
    public void userClicksAddToCartIcon(){
        clickExp.click();
        addToCart.click();
    }
//    public String verifyCartCount(){
//        return cartCount.getText();
//    }
}
