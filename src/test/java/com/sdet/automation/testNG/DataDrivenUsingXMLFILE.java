package com.sdet.automation.testNG;

import org.testng.annotations.*;

public class DataDrivenUsingXMLFILE {

    //DB credentials, browser
    @Parameters({"DB", "browser"})
    @BeforeSuite
    public void initializingDB(@Optional("DBoptional") String DB , @Optional("OptionalBrowser") String browser) {
    System.out.println(DB + "::" +  browser);
    }

    @Parameters("url")
    @BeforeTest
    public void lanuchBrowser(String url) {
        System.out.println("Intializing Browser ::" + url);
    }

    @Parameters({"userName","Password"})
    @Test
    public void login(String username, String password) {
        System.out.println("UserName :: " +username+ "Password :: " +password);
    }

}
