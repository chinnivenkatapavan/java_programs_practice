package com.sdet.automation.testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {

        if(counter < maxRetryCount){
            counter++;
            return true;
        }


        return false;

    }
}