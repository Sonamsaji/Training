package com.automation.testng;

import org.testng.annotations.Test;

public class HomeTest {
    @Test(groups = {"smoke"})
    public void test6(){
        System.out.println("Test6");
    }
    @Test(groups = {"smoke","completed"})
    public void test7(){
        System.out.println("Test7");
    }
    @Test(groups = {"wip"})
    public void test8(){
        System.out.println("Test8");
    }
    @Test
    public void test9(){
        System.out.println("Test9");
    }

}
