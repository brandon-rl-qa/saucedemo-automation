package lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lesson05OOPBasicsTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(dependsOnGroups = "lesson4", groups = "lesson5")
    public void practicingOOPBasics() {
        logger.info("--- Starting Lesson 05: OOP Basics ---");

        // ==========================================
        // 🎯 YOUR CHALLENGE STARTS BELOW
        // ==========================================

        // TASK 1: Instantiate the login page object.
        // Right now, 'loginPage' is null. Use the 'new' keyword to instantiate a SauceLoginPage object.
        
        // TODO: Change 'null' to an instance of SauceLoginPage object
        SauceLoginPage loginPage = null; 


        // TASK 2: Configure the object properties.
        // Once the object is instantiated, assign 
        // the correct values to the object's variables.
        
        // TODO: Set the username property of the loginPage object to "standard_user"
        
        // TODO: Set the password property of the loginPage object to "secret_sauce"


        // ==========================================
        // 🛑 DO NOT TOUCH THE CODE BELOW 
        // Automation check rules to pass this lesson.
        // ==========================================
        logger.info("--- Validating your answers ---");
        
        // Validate object initialization
        Assert.assertNotNull(loginPage, "The loginPage object has not been instantiated yet! Use the 'new' keyword.");
        
        // Validate object states
        Assert.assertEquals(loginPage.username, "standard_user", "The object's username property is incorrect.");
        Assert.assertEquals(loginPage.password, "secret_sauce", "The object's password property is incorrect.");
        
        // Trigger simulated behavior action
        String actionSummary = loginPage.performSimulatedLogin();
        Assert.assertEquals(actionSummary, "Attempting login for standard_user", "The action method failed to execute correctly.");
        
        logger.info("🎉 Spectacular! You understand how to build blueprints and instantiate them as runtime objects.");
    }

    // ==========================================
    // 🏗️ SIMULATED PAGE OBJECT BLUEPRINT (CLASS)
    // ==========================================
    // This is our blueprint class definition. It lives outside our test method block.
    static class SauceLoginPage {
        // Properties (Fields)
        String username;
        String password;

        // Action (Method)
        public String performSimulatedLogin() {
            return "Attempting login for " + username;
        }
    }
}