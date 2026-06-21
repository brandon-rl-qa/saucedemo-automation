package com.saucedemo.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class LoginPage {
    private final WebDriver driver;
    private final Logger logger;
    private final WebDriverWait wait;

    @FindBy(id = "user-name")
    WebElement username;
    @FindBy(id = "password")
    WebElement password;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(css = "h3")
    WebElement loginError;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        PageFactory.initElements(driver, this);
        logger = Logger.getLogger(getClass());
    }

    public LoginPage open() {
        logger.info("Navigating to saucedemo");
        driver.get("https://www.saucedemo.com/");
        return this;
    }

    public void enterUsername(String user) {
        logger.info("Typing username: "+user);
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(user);
    }

    public void enterPassword(String pass) {
        logger.info("Typing password: ******");
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pass);
    }

    public void clickLogin() {
        logger.info("Clicking on login button");
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public String getLoginError(){
        wait.until(ExpectedConditions.visibilityOf(loginError));
        return loginError.getText();
    }

    public void loginAs(String user, String pass) {
        open();
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}
