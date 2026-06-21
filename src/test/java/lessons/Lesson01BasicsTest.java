package lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lesson01BasicsTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(groups = {"lesson1"})
    public void practicingJavaBasics() {
        logger.info("Starting Lesson 01: Java Basics");

        // EXAMPLE CODE:
        String websiteName = "Saucedemo";
        int itemsInCart = 3;
        boolean isUserLoggedIn = true;

        logger.info("Welcome to " + websiteName);
        logger.info("Items in your cart: " + itemsInCart);
        logger.info("Is user logged in? " + isUserLoggedIn);


        // ==========================================
        // 🎯 YOUR CHALLENGE START BELOW
        // ==========================================

        // STEP 1: Fix the variable type below. It should hold the text "standard_user".
        // TODO: Change 'int' to the correct data type for text
        String sauceUsername = "standard_user"; 

        // STEP 2: Create an integer variable named 'expectedItems' and assign it a value of 4.
        // TODO: Write your code below this line
        int expectedItems = 4;
        

        // STEP 3: Create a boolean variable named 'isLoginSuccessful'. 
        // Use a comparison operator (==) to check if 'sauceUsername' matches "standard_user".
        // TODO: Write your code below this line
        boolean isLoginSuccessful = sauceUsername == "standard_user";// complete this logic


        // ==========================================
        // 🛑 DO NOT TOUCH THE CODE BELOW 
        // These are automation assertions that validate your answers!
        // ==========================================
        logger.info("--- Validating your answers ---");
        Assert.assertEquals(sauceUsername, "standard_user", "Username value is incorrect!");
        Assert.assertEquals(expectedItems, 4, "The expected items count should be exactly 4!");
        Assert.assertTrue(isLoginSuccessful, "Login success logic should evaluate to true!");
        logger.info("🎉 Awesome job! You passed the first Java fundamentals lesson.");
    }


}