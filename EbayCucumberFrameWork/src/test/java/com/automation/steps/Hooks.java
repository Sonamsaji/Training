package com.automation.steps;

import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(Scenario scenario) {
        System.out.println("starting" + scenario.getName());
        ConfigReader.initConfig();
        DriverManager.createDriver();
    }

    @After
    public void cleanUp(Scenario scenario) {
        if(scenario.isFailed()){
            scenario.attach(takeScreenshot(), "image/png", "failed");
        }
//         DriverManager.getDriver().quit();
    }

    public byte[] takeScreenshot(){
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
        return screenshot;
    }
}
