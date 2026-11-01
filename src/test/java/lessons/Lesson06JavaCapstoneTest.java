package lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import java.util.ArrayList;
import java.util.List;

public class Lesson06JavaCapstoneTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(dependsOnGroups = "lesson5") // Keeps our execution hierarchy intact!
    public void runJavaCapstoneChallenge() {
        logger.info("--- 🎓 Starting Phase 1: Java Fundamentals Capstone 🎓 ---");

        // 1. Setting up our simulated inventory pool
        SauceItem item1 = new SauceItem("Sauce Labs Backpack", 29.99);
        SauceItem item2 = new SauceItem("Sauce Labs Bolt T-Shirt", 15.99);
        SauceItem item3 = new SauceItem("Sauce Labs Fleece Jacket", 49.99);

        // 2. Creating a user cart with items 1 and 3
        List<SauceItem> customerCart = new ArrayList<>();
        customerCart.add(item1);
        customerCart.add(item3);

        // ==========================================
        // 🎯 YOUR CHALLENGE STARTS HERE
        // ==========================================
        
        // TODO: Complete the logic inside the processOrder() method below so that it 
        // processes the customerCart and applies the coupon code accurately.
        
        double finalPriceWithCoupon = processOrder(customerCart, "THANKYOU");
        double finalPriceNoCoupon = processOrder(customerCart, "INVALID_CODE");

        // ==========================================
        // 🛑 DO NOT TOUCH THE CODE BELOW 
        // Validation rules to pass the capstone milestone!
        // ==========================================
        logger.info("\n--- Evaluating Capstone Solutions ---");
        
        // Verification 1: Did the engine calculate the base items and handle the coupon rule?
        // Item 1 (29.99) + Item 3 (49.99) = 79.98. Since 79.98 > 40.00, coupon "THANKYOU" cuts $5.00 -> 74.98
        Assert.assertEquals(finalPriceWithCoupon, 74.98, 0.001, "Order processing failed when using a valid discount coupon code!");
        
        // Verification 2: Did the engine ignore the coupon code if it was invalid?
        Assert.assertEquals(finalPriceNoCoupon, 79.98, 0.001, "Order processing altered the total price using an invalid coupon code!");
        
        // Verification 3: Let's make sure the subtotal boundary gate works.
        // If a cart has just item 2 (15.99), it is less than $40.00, so the coupon MUST be ignored.
        List<SauceItem> smallCart = new ArrayList<>();
        smallCart.add(item2);
        double smallCartTotal = processOrder(smallCart, "THANKYOU");
        Assert.assertEquals(smallCartTotal, 15.99, 0.001, "Security Loophole! Coupon was applied to an order total below $40.00.");

        logger.info("🎉 CONGRATULATIONS! You passed the Java Capstone. You are officially ready for Selenium Automation!");
    }

    /**
     * UNGUIDED METHOD CHALLENGE: Complete the core business logic loops.
     * * @param cart       - List of SauceItem objects currently in the checkout queue.
     * @param couponCode - A string string inputting a code voucher.
     * @return double    - The final calculated price after running all business checks.
     */
    public double processOrder(List<SauceItem> cart, String couponCode) {
        double subtotal = 0.0;
        double total = 0;

        // TODO STEP A: Loop through every item in the cart, add its price to the subtotal, 
        // and if an item's price is greater than 20.00, use logger.info() to print: "[PREMIUM ITEM] " + item.name
        for (SauceItem sauceItem : cart) {
            subtotal += sauceItem.price;
        }

        // TODO STEP B: Apply coupon logic rules. 
        // If couponCode is equal to "THANKYOU" AND the calculated subtotal is greater than 40.00, 
        // deduct 5.00 from the final total. Otherwise, make no changes.
        if (couponCode.equalsIgnoreCase("thankyou")&&subtotal>40.00) {
            total = subtotal-5.00;
        }else{
            total = subtotal;
        }

        // Fix the return statement below to return your real calculation total
        return total; 
    }

    // ==========================================
    // 🏗️ DATA BLUEPRINT
    // ==========================================
    static class SauceItem {
        String name;
        double price;

        // Constructor to easily create items
        public SauceItem(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }
}