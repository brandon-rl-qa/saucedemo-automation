package lessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lesson07SeleniumSetupTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(groups="lesson7",dependsOnGroups = "lesson6")
    public void practicingSeleniumSetup() {
        logger.info("--- Starting Lesson 07: Selenium Setup ---");

        // 1. Configure container-safe Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");               // Bypass OS security sandbox restriction
        options.addArguments("--disable-dev-shm-usage");    // Overcome limited shared memory space in containers
        options.addArguments("--disable-gpu");              // Disable GPU hardware acceleration

        // 2. Initialize the Chrome WebDriver instance with options
        WebDriver driver = new ChromeDriver(options);
        logger.info("Browser successfully launched inside the container GUI!");

        try {
            // ==========================================
            // 🎯 YOUR CHALLENGE STARTS BELOW
            // ==========================================

            // TASK 1: Navigate to the Saucedemo website.
            // TODO: Use driver.get() to navigate to "https://www.saucedemo.com"
            // driver.get("");

            // TASK 2: Retrieve the page title.
            // TODO: Use driver.getTitle() to grab the browser tab's title text and assign it to the variable below.
            String actualPageTitle = "";

            // ==========================================
            // 🛑 DO NOT TOUCH THE CODE BELOW 
            // Automation check rules to pass this lesson.
            // ==========================================
            logger.info("\n--- Validating browser state ---");
            
            Assert.assertEquals(
                actualPageTitle, 
                "Swag Labs", 
                "The browser failed to load the correct page title!"
            );
            
            logger.info("🎉 Success! Chrome opened, navigated to Saucedemo, and verified the title.");

        } finally {
            // 3. Clean up and close the browser session
            logger.info("Closing browser session...");
            driver.quit();
        }
    }
}