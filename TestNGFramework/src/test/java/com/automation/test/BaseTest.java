package com.automation.test;

import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;
import com.automation.utils.DriverManager;
import com.automation.utils.ConfigReader;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;


public class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    private static ExtentReports extentreports;
    public static ExtentTest test;
    private static ExtentSparkReporter sparkReporter;

    @BeforeMethod
    public void setUp() throws IOException {
        String reportFilePath = "test-output/extent-report.html";
        sparkReporter = new ExtentSparkReporter(reportFilePath);
        sparkReporter.config().setTheme(Theme.DARK);

        extentreports = new ExtentReports();

//        extentreports.setSystemInfo("Tester", "Sona");
//        extentreports.setSystemInfo("OS", System.getProperty("os.name"));
//        extentreports.setSystemInfo("Java Version", System.getProperty("java.version"));
        test = extentreports.createTest("verify Login");
//        test.info("navigate to another page");

        ConfigReader.initConfig();
        DriverManager.createDriver();
        loginPage = new LoginPage();
        homePage = new HomePage();
    }

    @AfterMethod
    public void cleanUp() {
        extentreports.attachReporter(sparkReporter);
        extentreports.flush();
        DriverManager.getDriver().quit();
    }

    public String takeScreenShot() throws IOException {
        TakesScreenshot ts = (TakesScreenshot) DriverManager.getDriver();
        File file = ts.getScreenshotAs(OutputType.FILE);
        String filePath = "src/test/resources" + "/screenshot.png";
        FileUtils.copyFile(file, new File(filePath));
        return System.getProperty("user.dir") + "/" + filePath;
    }
}
