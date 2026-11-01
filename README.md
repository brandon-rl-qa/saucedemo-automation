# Lesson 07: Selenium Setup 🌐

Welcome to Phase 2! Up until now, your code has only lived inside the computer's memory. Today, we introduce **Selenium WebDriver**—an open-source framework that allows you to write code that controls a web browser just like a human user would.

In this lesson, we will cover:
1. **What is WebDriver?** (The bridge between your Java code and the browser)
2. **Browser Lifecycle** (Launching, navigating, and quitting safely)

---

## 📖 Concept Breakdown

### 1. Selenium WebDriver
WebDriver is an API that communicates directly with browser binaries (like Chrome, Firefox, or Edge). When you write automation scripts, WebDriver translates your Java commands into browser actions.

* *Automation Example:* 
  ```java
  WebDriver driver = new ChromeDriver(); // Boots up Chrome
  driver.get("[https://www.saucedemo.com](https://www.saucedemo.com)"); // Navigates to the URL