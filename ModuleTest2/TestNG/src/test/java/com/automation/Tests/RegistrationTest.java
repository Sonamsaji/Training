package com.automation.Tests;

import com.automation.Pages.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest {
    @DataProvider(name = "registrationData")
    public Object[][] provideRegistrationData() {
        return new Object[][]{
                {"4", "123456", "123456", "Noah", "Shaz", "Noah@123", "1234323456", "NY-yc-6", "10001 green fort", "Ny", "kerala", "234", "germany"}
        };
    }

    @Test(dataProvider = "registrationData")
    public void testRegistration(String userId, String newPassword, String repeatPassword, String firstName, String lastName, String email, String phoneNumber,
                                 String address1, String address2, String city, String state, String zip, String country) {
        //open Website
        homePage.openWebsite();
        //click signIn button
        registrationPage.clickSignInButton();

        //click register now button
        registrationPage.clickRegisterNow();

        //Enter user id
        registrationPage.enterUserId(userId);

        //Enter user newPassword
        registrationPage.enterPassword(newPassword);

        //Enter user repeatPassword
        registrationPage.enterRepeatPassword(repeatPassword);

        //Enter user firstName
        registrationPage.enterFirstName(firstName);

        //Enter user lastName
        registrationPage.enterLastName(lastName);

        //Enter user email
        registrationPage.enterEmail(email);

        //Enter user phoneNumber
        registrationPage.enterPhone(phoneNumber);

        //Enter user address1
        registrationPage.enterAddress1(address1);

        //Enter user address2
        registrationPage.enterAddress2(address2);

        //Enter user city
        registrationPage.enterCity(city);

        //Enter user state
        registrationPage.enterState(state);

        //Enter user zip
        registrationPage.enterZip(zip);

        //Enter user country
        registrationPage.enterCountry(country);

        //click account button
        registrationPage.clickNewAccountButton();

        //Verify user is getting home Page back
        Assert.assertEquals(registrationPage.isRegistered(), "Sign In");
    }
}
