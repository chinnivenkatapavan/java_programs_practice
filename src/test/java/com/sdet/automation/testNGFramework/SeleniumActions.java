package com.sdet.automation.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SeleniumActions {
    private WebDriver driver;

    public SeleniumActions(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnWebElement(By by) {
        driver.findElement(by).click();
    }

    public void typeValue(WebElement element, String text) {
        element.sendKeys(text);
    }

    public void typeValue(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }


    public String getTextMessage(WebElement element) {
        return element.getText();
    }

    public int getNumberOfElements(List<WebElement> elements) {
        return elements.size();
    }
}
