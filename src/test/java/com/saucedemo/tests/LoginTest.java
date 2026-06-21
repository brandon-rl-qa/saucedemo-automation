package com.saucedemo.tests;

import com.saucedemo.pages.InventoryPage;
import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        LoginPage login = new LoginPage(driver);
        InventoryPage inventory = login.open().loginAs("standard_user", "secret_sauce");
        Assert.assertTrue(inventory.isInventoryVisible(), "Inventory list should be visible after login");
    }

    @Test
    public void testInvalidLogin() {
        LoginPage login = new LoginPage(driver);
        login.open().loginAs("locked_out_user", "wrong_password");
        // could add assertions for error messages here
    }
}
