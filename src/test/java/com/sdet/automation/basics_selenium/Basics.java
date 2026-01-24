package com.sdet.automation.basics_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Basics {

    @Test
    public void launchBrowser(){
        WebDriver driver = null;

        String baseURL = "https://www.google.com";
        String browser = "chrome";

        switch (browser){
            case "chrome":
                driver = new ChromeDriver();
                driver.get(baseURL);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.get(baseURL);
                break;
            default:
                System.err.println("Browser Not Found");
        }



    }

}
