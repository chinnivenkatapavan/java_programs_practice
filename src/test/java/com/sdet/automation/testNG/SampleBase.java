package com.sdet.automation.testNG;

import org.testng.annotations.*;

public class SampleBase {
    @BeforeClass
    public void sampleClass() {
        System.out.println("BeforeClass :: SampleClassBase");
    }

    @BeforeTest
    public void sampleTest() {
        System.out.println("BeforeTest :: SampleTestBase");
    }

    @BeforeSuite
    public void sampleSuite() {
        System.out.println("BeforeSuite :: SampleTestBase");
    }

    @BeforeMethod
    public void beforeEveryTestcase(){
        System.out.println("BeforeMethod :: beforeEveryTestcase");
    }

    @AfterMethod
    public void afterEveryTestcase(){
        System.out.println("AfterMethod :: afterEveryTestcase");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass :: afterClass");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest :: afterTest");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite :: afterSuite");
    }

}
