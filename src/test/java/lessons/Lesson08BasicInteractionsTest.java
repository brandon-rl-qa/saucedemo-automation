package lessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lesson08BasicInteractionsTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(groups="lesson8",dependsOnGroups = "lesson7")
    public void practicingBasicInteractions() {
        logger.info("--- Starting Lesson 08: Basic Interactions ---");

        // Container-safe Chrome options
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");

        WebDriver driver = new ChromeDriver(options);
        logger.info("Browser launched for login automation.");

        try {
            // 1. Navigate to Saucedemo
            driver.get("https://www.saucedemo.com");

            // ==========================================
            // 🎯 YOUR CHALLENGE STARTS BELOW
            // ==========================================

            // TASK 1: Find the username input field and type "standard_user" into it.
            // Hint: The element has id="user-name"
            // TODO: Uncomment and complete the line below:
            // WebElement usernameField = driver.findElement(By.id("..."));
            // usernameField.sendKeys("standard_user");


            // TASK 2: Find the password input field and type "secret_sauce" into it.
            // Hint: The element has id="password"
            // TODO: Write your code here to find the password field and type the password


            // TASK 3: Find the login button and click it.
            // Hint: The element has id="login-button"
            // TODO: Write your code here to find the login button and click it


            // ==========================================
            // 🛑 DO NOT TOUCH THE CODE BELOW 
            // Automation check rules to pass this lesson.
            // ==========================================
            // Verify we successfully landed on the inventory page URL
            Thread.sleep(1000); // Small pause for transition visual confirmation
            String currentUrl = driver.getCurrentUrl();
            
            Assert.assertTrue(
                currentUrl.contains("inventory.html"), 
                "Login failed! The browser did not navigate to the inventory page. Current URL: " + currentUrl
            );
            
            logger.info("🎉 Outstanding! You successfully filled out the login form and navigated to the dashboard.");

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            logger.error("Test execution was interrupted", e);
        } finally {
            logger.info("Closing browser session...");
            driver.quit();
        }
    }
}