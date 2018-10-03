package com.company.listenerspackage;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class CustomListener3 implements ISuiteListener{
    public void onStart(ISuite iSuite) {
        // When <suite> tag starts
        System.out.println("onStart: before suite starts");
    }

    public void onFinish(ISuite iSuite) {
        // When <suite> tag completes
        System.out.println("onFinish: after suite completes");
    }
}
