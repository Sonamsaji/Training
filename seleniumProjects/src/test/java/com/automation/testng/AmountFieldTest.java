package com.automation.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AmountFieldTest {
    @Test(dataProvider = "PositiveDataProvider")
    public void test1(String amount){
        System.out.println("Positive Test with " + amount);
    }
    @DataProvider(name = "PositiveDataProvider")
    public Object[] getPositiveData(){
        Object[] data = {"100", "1", "10.0"};
        return data;
    }
    @Test(dataProvider = "NegativeDataProvider")
    public void test2(String amount){
        System.out.println("Negative Test with " + amount);
    }
    @DataProvider(name = "NegativeDataProvider")
    public Object[] getNegativeData(){
        Object[] data = {"0.9", "-5", "100.1", "abc", "10/2", "0.0009"};
        return data;
    }
}
