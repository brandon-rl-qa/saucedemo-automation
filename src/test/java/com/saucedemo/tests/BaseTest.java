package com.saucedemo.tests;

import com.saucedemo.core.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

public class BaseTest {
    protected WebDriver driver;
    protected Logger logger;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.createDriver();
        logger = Logger.getLogger(BaseTest.class);
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
