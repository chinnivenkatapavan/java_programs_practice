package com.sdet.automation.testNG;

import org.testng.annotations.*;

public class TestNGAnnotations {

    @BeforeSuite
    public void initializeDBReports(){
        System.out.println("BeforeSuite :: initializeDBReports");
    }

    @AfterSuite
    public void finalizeDBReports(){
        System.out.println("AfterSuite :: finalizeDBReports");
    }

    @Test
    public void firstTest(){
        System.out.println("Test :: firstTest");
    }
    @Test
    public void lastTest(){
        System.out.println("Test :: lastTest");
    }
    @Test
    public void secondTest(){
        System.out.println("Test :: secondTest");
    }

    @BeforeTest
    public void launchApplication(){
        System.out.println("BeforeTest :: lanuchApplication");
    }

    @AfterTest
    public void closeApplication(){
        System.out.println("AfterTest :: closeApplication");
    }

    @BeforeMethod
    public void beforeEveryTestcase(){
        System.out.println("BeforeMethod :: beforeEveryTestcase");
    }

    @AfterMethod
    public void afterEveryTestcase(){
        System.out.println("AfterMethod :: afterEveryTestcase");
    }

    @BeforeClass
    public void launchBrowserTest(){
        System.out.println("BeforeClass :: launchTest");
    }

    @AfterClass
    public void closeBrowserTest(){
        System.out.println("AfterClass :: closeBrowserTest");
    }

}
