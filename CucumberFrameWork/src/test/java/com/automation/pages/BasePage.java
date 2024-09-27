package com.automation.pages;

import com.automation.utils.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    WebDriver driver;

    public BasePage(){
        this.driver= DriverManager.getDriver();
        PageFactory.initElements(driver,this);
    }
}

//pagefactory is used in every page class
//It helps in creating page object instances and initializing their WebElements using annotations
//Initialization of Web Elements: Automates the creation and initialization of web elements annotated with @FindBy.
// Initialize the WebElements using pagefactory
