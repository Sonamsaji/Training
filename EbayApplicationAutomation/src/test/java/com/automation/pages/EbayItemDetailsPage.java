package com.automation.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class EbayItemDetailsPage extends BasePage{

    @FindBy(id ="com.ebay.mobile:id/imageview_image")
    WebElement itemImage;

    @FindBy(xpath = "//android.widget.ImageView[@resource-id='com.ebay.mobile:id/photo_gallery_item']")
    WebElement photoItem;

    public void verifyZoomFunctionality() throws InterruptedException {
        itemImage.click();
        zoom(photoItem);
        Thread.sleep(2000);
        zoom(photoItem);
        Thread.sleep(2000);
        zoom(photoItem);
        Thread.sleep(2000);
    }
}
