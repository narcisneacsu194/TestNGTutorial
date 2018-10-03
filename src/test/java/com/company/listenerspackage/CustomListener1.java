package com.company.listenerspackage;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CustomListener1 implements IInvokedMethodListener{
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
}
