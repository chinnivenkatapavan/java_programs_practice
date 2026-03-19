package com.sdet.automation.testNGFramework;

import com.beust.jcommander.Parameter;
import com.java.hooks.WebHooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BasePage {

    WebDriver driver;

    @BeforeSuite
    public void initializeDriver(){
        System.out.println("Driver Initialized");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @BeforeTest
    public void lanuchApplication(){
        driver.get("https://www.saucedemo.com/");
    }

    @AfterTest
    public void closeDriver(){
        System.out.println("Driver Closed");
        driver.quit();
    }

}
