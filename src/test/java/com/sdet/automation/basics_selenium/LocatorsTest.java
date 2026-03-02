package com.sdet.automation.basics_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.List;

public class LocatorsTest {
    public WebDriver driver;

    @Test
    public void locatorExample() throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        driver.findElement(By.className("btn_action")).click();

        Thread.sleep(5000);

        WebElement dropDownElement = driver.findElement(By.xpath("//select[@data-test=\"product-sort-container\"]"));
        Select dropDown = new Select(dropDownElement);
        List<WebElement> allOptions = dropDown.getOptions();

        for(WebElement option : allOptions){
            System.out.println(option.getText());
        }

        //dropDown.selectByIndex(1);
        //dropDown.selectByVisibleText("Price (low to high)");
        //dropDown.selectByContainsVisibleText("high to low");
        dropDown.selectByValue("za");



        List<WebElement> getAddtoCart = driver.findElements(By.xpath("//button[starts-with(@id,\"add-to\")]"));
        System.out.println(getAddtoCart.size());

        for(WebElement button : getAddtoCart){
            System.out.println(button.getRect());
        }
        getAddtoCart.get(2).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(text(),\"Remove\")]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[starts-with(@class,\"shopping_cart_link\")]")).click();
        Thread.sleep(5000);
        driver.quit();
    }

}
