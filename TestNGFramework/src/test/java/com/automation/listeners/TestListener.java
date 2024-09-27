package com.automation.listeners;

import com.automation.utils.DriverManager;
import com.automation.utils.ExtentReportManager;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        ExtentReportManager.initExtentReporter();
//        System.out.println("Test suite '" + context.getName() + "' is starting...");
        // Add any setup or initialization logic here if needed
    }
    @Override
    public void onFinish(ITestContext context) {
        ExtentReportManager.flush();

//        System.out.println("Test suite '" + context.getName() + "' has finished.");
        // Perform any cleanup activities here
    }
    @Override
    public void onTestStart(ITestResult result) {
        ExtentReportManager.createTest(result.getMethod().getMethodName());
//        System.out.println("Starting execution of test case: " + result.getMethod().getMethodName());
    }
    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.getTest().pass("test pass");
//        DriverManager.ExtendReportManager.getTest().pass("test pass");
//        System.out.println("Test case passed: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
//        System.out.println("Test case failed: " + result.getMethod().getMethodName());
        ExtentReportManager.getTest().fail("test failed \n "+ result.getThrowable().getStackTrace());
//        DriverManager.ExtendReportManager.getTest().fail("test failed \n "+ result.getThrowable().getStackTrace());
    }
    @Override
    public void onTestSkipped(ITestResult result) {
//        System.out.println("Test case skipped: " + result.getMethod().getMethodName());
    }

    // Other methods from ITestListener can be overridden as needed

}
