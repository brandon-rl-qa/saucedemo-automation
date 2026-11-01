# Lesson 08: Basic Interactions 🖱️⌨️

Now that our browser can open and navigate to Saucedemo, it’s time to interact with the webpage like a real user. To do this, Selenium uses **Locators** to find elements on the page, and **Action Methods** to manipulate them.

In this lesson, we will cover:
1. **Finding Elements** (`By.id`, `By.name`, `By.cssSelector`)
2. **Core User Actions** (`sendKeys()`, `click()`, `clear()`)

---

## 📖 Concept Breakdown

### 1. Locating Elements
Before you can click a button or type into a box, Selenium needs to find it in the HTML DOM. We use `driver.findElement(By.locatorStrategy("selector"))` to target elements.
* *Example:* `driver.findElement(By.id("user-name"))` finds the username text box by its HTML `id` attribute.

### 2. Performing Actions
Once Selenium holds a reference to an element, you can execute web interactions:
* **`sendKeys("text")`**: Types text into an input field (e.g., entering a username or password).
* **`click()`**: Clicks a button or link (e.g., submitting the login form).
* **`clear()`**: Clears pre-existing text out of an input box.

---

## 💻 Code Example

Open your working file located at:
📁 `src/test/java/lessons/Lesson08BasicInteractionsTest.java`

Notice how we locate the username field, clear it, type `"standard_user"`, do the same for the password field, and finally click the login button.

---

## 🎯 Your Challenge: Automate the Saucedemo Login Flow!

Your assignment is inside `Lesson08BasicInteractionsTest.java`. The browser setup and container options are already provided for you, but the actual interaction commands are missing.

### Instructions:
1. Open your VNC GUI tab (Port 6080) to watch the test run live.
2. Open `src/test/java/lessons/Lesson08BasicInteractionsTest.java`.
3. Locate the username field (`id="user-name"`), password field (`id="password"`), and login button (`id="login-button"`), then write the code to fill them out and click submit.
4. Run your code using the quiet Maven test filter:
   ```bash
   mvn test -Dtest=Lesson08BasicInteractionsTest -q -Dorg.slf4j.simpleLogger.defaultLogLevel=info