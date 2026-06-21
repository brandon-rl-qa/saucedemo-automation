package lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import java.util.ArrayList;
import java.util.List;

public class Lesson06JavaCapstoneTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(dependsOnGroups = "lesson5")
    public void runJavaCapstoneChallenge() {
        logger.info("--- 🎓 Starting Phase 1: Java Fundamentals Capstone 🎓 ---");

        // ==========================================
        // 🎯 YOUR CHALLENGE STARTS HERE
        // ==========================================

        // TODO: Set up a simulated inventory pull with instances of SauceItem
        SauceItem item1 = null;
        SauceItem item2 = null;
        SauceItem item3 = null;

        // TODO: Create a customerCart list with items 1 and 3 (consider the list to be of SauceItem objects)
        

        
        
        // TODO: Complete the logic inside the processOrder() method below so that it 
        // processes the customerCart and applies the coupon code accurately.
        
        double finalPriceWithCoupon = processOrder(customerCart, "THANKYOU");
        double finalPriceNoCoupon = processOrder(customerCart, "INVALID_CODE");

        // ==========================================
        // 🛑 DO NOT TOUCH THE CODE BELOW 
        // Validation rules to pass the capstone milestone!
        // ==========================================
        logger.info("--- Evaluating Capstone Solutions ---");
        
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

        // TODO STEP A: Loop through every item in the cart, add its price to the subtotal, 
        // and if an item's price is greater than 20.00, use logger.info() to print: "[PREMIUM ITEM] " + item.name
        

        // TODO STEP B: Apply coupon logic rules. 
        // If couponCode is equal to "THANKYOU" AND the calculated subtotal is greater than 40.00, 
        // deduct 5.00 from the final total. Otherwise, make no changes.
        

        // Fix the return statement below to return your real calculation total
        return 0.0; 
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