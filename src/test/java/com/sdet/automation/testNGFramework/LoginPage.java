package com.sdet.automation.testNGFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private final WebDriver driver;
    private final By userNameBox = By.name("user-name");
    private final By passwordBox = By.id("password");
    private final SeleniumActions seleniumActions;
    private final By loginButton = By.className("submit-button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        seleniumActions = new SeleniumActions(driver);

    }

    @FindBy(name = "user-name")
    private WebElement userNameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(className = "submit-button")
    private WebElement signInButton;

    public void loginAsUser(String username, String password) {
        driver.findElement(userNameBox).sendKeys(username);
        driver.findElement(passwordBox).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void loginAsAdmin(String username, String password) {
        seleniumActions.typeValue(userNameBox, username);
        seleniumActions.typeValue(passwordBox, password);
        seleniumActions.clickOnWebElement(loginButton);
    }

    public void login(String username, String password) {
        seleniumActions.typeValue(userNameInput, username);
        seleniumActions.typeValue(passwordInput, password);
        driver.findElement(loginButton).click();
    }




}
