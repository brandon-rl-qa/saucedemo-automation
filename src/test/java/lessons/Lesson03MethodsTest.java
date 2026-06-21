package lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lesson03MethodsTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(dependsOnGroups = "lesson2", groups = "lesson3") // Preserves the clean cross-class order execution sequence!
    public void practicingMethods() {
        logger.info("--- Starting Lesson 03: Methods & Parameters ---");

        // EXAMPLE CODE: Calling a simple void method
        printWelcomeBanner();

        // ==========================================
        // 🎯 YOUR CHALLENGE STARTS BELOW
        // ==========================================

        // TASK 1: Complete and call the getStoreName method below.
        // It should return the string "Saucedemo Official Store".
        String storeName = getStoreName();


        // TASK 2: Repair the calculateTotalPrice method calculation logic.
        // We need to pass the item base price and the tax amount to get the total back.
        double itemPrice = 29.99;
        double taxAmount = 2.40;
        
        // TODO: Pass itemPrice and taxAmount as arguments inside the parentheses below
        double finalReceiptTotal = calculateTotalPrice(itemPrice,taxAmount); 


        // ==========================================
        // 🛑 DO NOT TOUCH THE CODE BELOW 
        // Automation check rules to pass this lesson.
        // ==========================================
        logger.info("--- Validating your answers ---");
        
        Assert.assertEquals(storeName, "Saucedemo Official Store", "The store name method did not return the correct text!");
        Assert.assertEquals(finalReceiptTotal, 32.39, 0.001, "The total price calculator method returned an incorrect calculation!");
        
        logger.info("🎉 Outstanding! You can now create reusable methods and pass dynamic parameters into them.");
    }

    // ==========================================
    // HELPER METHODS ZONE
    // ==========================================

    // Example void method: Takes no parameters, returns nothing.
    private void printWelcomeBanner() {
        logger.info("Example: [SYSTEM] Loading Virtual Shopping Cart Engine...");
    }

    // TODO: Fix this method so it returns the expected String instead of empty text
    private String getStoreName() {
        return "Saucedemo Official Store";
    }

    // TODO: Correct this method signature to accept two 'double' parameters: basePrice and tax
    // Then, make it return the sum of those two values combined!
    private double calculateTotalPrice(double basePrice, double tax) {
        // Fix the calculation line below to return the actual combined sum
        return basePrice+tax;
    }
}