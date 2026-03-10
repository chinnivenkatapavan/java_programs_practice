package com.sdet.automation.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderdata {

    @DataProvider(name = "login")
    public Object[][] login() {
        return new Object[][] {
                {"Automation" , "test123" , "12345678"},
                {"Automation1","test123"}
        };
    }

    @Test(dataProvider = "login")
    public void login(String username, String password , String test) {
        System.out.println(username + "::" + password+ "::" + test);
    }
}



