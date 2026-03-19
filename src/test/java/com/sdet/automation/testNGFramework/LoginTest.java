package com.sdet.automation.testNGFramework;

import com.beust.jcommander.Parameter;
import com.java.workshop_OOPs.inheritances.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BasePage {

    private LoginPage loginPage;

    @BeforeClass
    public void initializePage(){
        loginPage = new LoginPage(driver);
    }

    @Parameters({"userName","passWord"})
    @Test
    public void werifyLoginSuccess(String userName, String passWord){
        loginPage.loginAsAdmin(userName,passWord);
    }

}
