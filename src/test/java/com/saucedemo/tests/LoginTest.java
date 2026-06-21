package com.saucedemo.tests;

import com.saucedemo.core.DriverFactory;
import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    
    LoginPage login;
    InventoryPage inventory;

    @BeforeMethod
    @Override
    public void setUp() {
        super.setUp();
        login = new LoginPage(driver);
        inventory = new InventoryPage(driver);
    }

    @Test
    public void testLogin() {
        logger.info("Starting testLogin");
        login.loginAs("standard_user","secret_sauce");
        Assert.assertTrue(inventory.isInventoryVisible(), "Inventory list should be visible after login");
    }

    @Test
    public void testInvalidLogin() {
        logger.info("Starting testInvalidLogin");
        login.loginAs("standard_user", "wrong_sauce");
        var error = login.getLoginError();
        Assert.assertTrue(error.contains("Epic sadface"));
    }
}
