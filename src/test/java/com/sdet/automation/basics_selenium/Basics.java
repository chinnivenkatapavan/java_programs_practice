package com.sdet.automation.basics_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Basics {

    @Test
    public void launchBrowser(){
        WebDriver driver = new ChromeDriver();
    }

}
