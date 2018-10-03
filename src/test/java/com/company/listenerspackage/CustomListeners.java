package com.company.listenerspackage;

import org.testng.*;

public class CustomListeners implements IInvokedMethodListener,
        ITestListener, ISuiteListener{
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        // Before every method in the Test Class
        System.out.println("beforeInvocation: " + iTestResult.getTestClass().getName() +
                " => " + iInvokedMethod.getTestMethod().getMethodName());
    }

    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        // After every method in the Test Class
        System.out.println("afterInvocation: " + iTestResult.getTestClass().getName() +
                " => " + iInvokedMethod.getTestMethod().getMethodName());
    }

    public void onTestStart(ITestResult iTestResult) {
        // When test method starts
        System.out.println("onTestStart -> Test Name: " + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        // If test method is successful
        System.out.println("onTestSuccess -> Test Name: " + iTestResult.getName());
    }

    public void onTestFailure(ITestResult iTestResult) {
        // If test method is failed
        System.out.println("onTestFailure -> Test Name: " + iTestResult.getName());
    }

    public void onTestSkipped(ITestResult iTestResult) {
        // If test method is skipped
        System.out.println("onTestSkipped -> Test Name: " + iTestResult.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        // Ignore this
    }

    public void onStart(ITestContext iTestContext) {
        System.out.println("onStart -> Test Tag Name: " + iTestContext.getName());
        ITestNGMethod methods[] = iTestContext.getAllTestMethods();
        System.out.println("These methods will be executed in this test tag:");
        for(ITestNGMethod method : methods){
            System.out.println(method.getMethodName());
        }
    }

    public void onFinish(ITestContext iTestContext) {
        System.out.println("onFinish -> Test Tag Name: " + iTestContext.getName());
    }

    public void onStart(ISuite iSuite) {
        // When <suite> tag starts
        System.out.println("onStart: before suite starts");
    }

    public void onFinish(ISuite iSuite) {
        // When <suite> tag completes
        System.out.println("onFinish: after suite completes");
    }
}
