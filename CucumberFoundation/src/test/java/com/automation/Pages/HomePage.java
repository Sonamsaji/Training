package com.automation.Pages;

import com.automation.Utils.ConfigReader;

public class HomePage extends BasePage{

    public void openWebsite(){
        driver.get(ConfigReader.getConfigProperty("url"));
    }
}
