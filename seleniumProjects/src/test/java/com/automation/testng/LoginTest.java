package com.automation.testng;

import org.testng.annotations.Test;

public class LoginTest {
    @Test(groups = {"smoke"})
    public void test1(){
        System.out.println("Test1");
    }
    @Test(enabled=false,groups = {"wip"})
    public void test2(){
        System.out.println("Test2");
    }
    @Test(enabled = false)
    public void test3(){
        System.out.println("Test3");
    }
    @Test(groups = {"completed"})
    public void test4(){
        System.out.println("Test4");
    }
    @Test(groups = {"wip"})
    public void test5(){
        System.out.println("Test5");
    }

}
