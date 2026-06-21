package lessons;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Lesson02ConditionalsLoopsTest {

    private Logger logger = Logger.getLogger(getClass());

    @Test(groups="lesson2",dependsOnGroups = "lesson1")
    public void practicingConditionalsAndLoops() {
        logger.info("--- Starting Lesson 02: Conditionals & Loops ---");

        // ==========================================
        // TASK 1: Complete the conditional logic for user access states.
        // We need to validate THREE different states: "locked_out", "problem_user", and "standard_user".
        // ==========================================
        
        String[] testUserStates = {"locked_out", "problem_user", "standard_user"};
        String[] expectedBanners = {"ERROR_BANNER", "GLITCH_WARNING", "DASHBOARD_LOADED"};
        String[] actualBanners = new String[3];

        // We loop through each scenario to test your conditional logic against every user state!
        for (int i = 0; i < testUserStates.length; i++) {
            String userState = testUserStates[i];
            String systemMessage = "";

            // 🎯 YOUR CHALLENGE: Complete this conditional statement to assign systemMessage accurately
            if (userState.equals("locked_out")) {
                systemMessage = "ERROR_BANNER";
            } else if (userState.equals("problem_user")) {
                // TODO: Assign systemMessage the value "GLITCH_WARNING"
                systemMessage = "GLITCH_WARNING";
            } else {
                // TODO: Assign systemMessage the value "DASHBOARD_LOADED"
                systemMessage = "DASHBOARD_LOADED";
            }

            // Store the result for validation
            actualBanners[i] = systemMessage;
        }


        // ==========================================
        // TASK 2: Fix the loop boundaries.
        // We need to simulate scanning inventory items from index 1 up to exactly 6 items.
        // ==========================================
        int finalLoopCount = 0;

        // 🎯 YOUR CHALLENGE: Fix the condition inside the loop below so it loops exactly 6 times
        // Right now, it exits immediately because i < 0 is false.
        for (int i = 0; i < 6; i++) {
            finalLoopCount++;
            logger.info("Scanning inventory shelf item #" + i);
        }


        // ==========================================
        // 🛑 DO NOT TOUCH THE CODE BELOW 
        // Automation check rules to pass this lesson.
        // ==========================================
        logger.info("--- Validating your answers ---");
        
        // Dynamic Path Validation Matrix
        for (int i = 0; i < testUserStates.length; i++) {
            Assert.assertEquals(
                actualBanners[i], 
                expectedBanners[i], 
                "The conditional logic failed for user state: '" + testUserStates[i] + "'!"
            );
        }
        
        // Loop Boundary Validation
        Assert.assertEquals(finalLoopCount, 6, "Your loop did not run exactly 6 times! It ran: " + finalLoopCount);
        
        logger.info("🎉 Brilliant! You mastered conditional flow controls and looping structures across all execution paths.");
    }
}