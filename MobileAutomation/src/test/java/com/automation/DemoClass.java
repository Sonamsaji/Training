package com.automation;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DemoClass {
    public static void main(String[] args) throws MalformedURLException {
//        DesiredCapabilities caps = new DesiredCapabilities();
//        caps.setCapability("platformName", "Android");
//        caps.setCapability("deviceName", "storage:filename=expedia.apk");  // The filename of the mobile app
//        caps.setCapability("automationName", "Android GoogleAPI Emulator");
//        caps.setCapability("appium:platformVersion", "12.0");
//        caps.setCapability("appium:automationName", "UiAutomator2");
//        DesiredCapabilities sauceOptions = new DesiredCapabilities();
//        sauceOptions.setCapability("username", "oauth-sonamsaji3-cfacf");
//        sauceOptions.setCapability("accessKey", "8024ac58-5e21-411a-be32-08c7b3496b95");
//        sauceOptions.setCapability("build", "appium-test-build");
//        sauceOptions.setCapability("name", "My First Mobile Automation Test");
//        sauceOptions.setCapability("deviceOrientation", "PORTRAIT");
//        caps.setCapability("sauce:options", sauceOptions);
//
//        URL url = new URL("https://ondemand.eu-central-1.saucelabs.com:443/wd/hub");
//
//        AppiumDriver driver  = new AndroidDriver(url, caps);

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
//        caps.setCapability("appium:app", "C://Users//280681//Downloads//SauceLabs.apk");
      caps.setCapability("appium:app", "C://Users//280681//Downloads//expedia//expedia.apk");
        caps.setCapability("appium:deviceName", "emulator-5554");
        caps.setCapability("appium:automationName", "UiAutomator2");
//        caps.setCapability("appPackage", "com.swaglabsmobileapp");
        caps.setCapability("appPackage", "com.expedia.bookings");
//        caps.setCapability("appActivity", "com.swaglabsmobileapp.SplashActivity");
        caps.setCapability("appActivity", "com.expedia.bookings.activity.SearchActivity");
        URL url = new URL("http://127.0.0.1:4723");
        AppiumDriver driver = new AppiumDriver(url,caps);
//        URL url = new URL("http://127.0.0.1:4723/wd/hub");  // Appium server URL
//        AppiumDriver driver = new AndroidDriver(url, caps);

    }
}
