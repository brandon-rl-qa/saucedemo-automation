package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.log4testng.Logger;

public class InventoryPage {
    private final WebDriver driver;
    private final Logger logger;
    
    
    @FindBy(id = "inventory_container")
    WebElement inventoryList;

    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        logger = Logger.getLogger(getClass());
    }

    public boolean isInventoryVisible() {
        logger.info("Verifying if inventory is visible");
        return inventoryList.isDisplayed();
    }
}
