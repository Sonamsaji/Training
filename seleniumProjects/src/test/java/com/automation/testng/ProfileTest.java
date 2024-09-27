package com.automation.testng;

import org.testng.annotations.Test;

public class ProfileTest {
    @Test(groups = {"smoke"})
    public void test10(){
        System.out.println("Test10");
    }
    @Test(groups = {"wip"})
    public void test11(){
        System.out.println("Test11");
    }
    @Test(groups = {"wip"})
    public void test12(){
        System.out.println("Test12");
    }
    @Test
    public void test13(){
        System.out.println("Test13");
    }



}
