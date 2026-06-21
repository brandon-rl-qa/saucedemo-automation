package lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import java.util.ArrayList;
import java.util.List;

public class Lesson04CollectionsTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(dependsOnGroups = "lesson3", groups ="lesson4")
    public void practicingArraysAndLists() {
        logger.info("--- Starting Lesson 04: Arrays & Collections ---");

        // EXAMPLE CODE: Fixed Array configuration
        String[] productCategories = {"Shirts", "Pants", "Shoes"};
        logger.info("Example Category at index 0: " + productCategories[0]);

        // ==========================================
        // 🎯 YOUR CHALLENGE STARTS BELOW
        // ==========================================

        // TASK 1: Fix the broken indexing for our static warehouse array.
        // We want to grab the item "Sauce Labs Backpack" which is the FIRST item in the array.
        String[] warehouseInventory = {"Sauce Labs Backpack", "Sauce Labs Bike Light", "Sauce Labs Bolt T-Shirt"};
        
        // TODO: add indexed call reference and point to the correct value. 
        // Remember, Java arrays are zero-indexed!
        String firstItem = warehouseInventory[0];


        // TASK 2: Populate a dynamic ArrayList representing a user's shopping cart.
        // We need an ArrayList that holds Strings. It must contain exactly two items:
        // "Sauce Labs Bike Light" and "Sauce Labs Onesie".
        
        // TODO: Initialize the 'shoppingCart' variable below
        List<String> shoppingCart = new ArrayList<>(); 

        // TODO: search for the proper List methods that you can use to add the correct items to the list
        shoppingCart.add("Sauce Labs Bike Light");
        shoppingCart.add("Sauce Labs Onesie");

        // ==========================================
        // 🛑 DO NOT TOUCH THE CODE BELOW 
        // Automation check rules to pass this lesson.
        // ==========================================
        logger.info("--- Validating your answers ---");
        
        // Validate Task 1
        Assert.assertEquals(firstItem, "Sauce Labs Backpack", "You grabbed the wrong warehouse item! Check your index assignment.");
        
        // Validate Task 2
        Assert.assertNotNull(shoppingCart, "The shopping cart collection has not been initialized yet!");
        Assert.assertEquals(shoppingCart.size(), 2, "Your shopping cart should contain exactly 2 items.");
        Assert.assertTrue(shoppingCart.contains("Sauce Labs Onesie") && shoppingCart.contains("Sauce Labs Bike Light"),
    "expected [Sauce Labs Onesie,Sauce Labs Bike Light]"+" but found "+shoppingCart+",");
        
        logger.info("🎉 Sensational! You're ready to collect, store, and verify datasets dynamically.");
    }
}
