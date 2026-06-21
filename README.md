# Saucedemo Automation - Java & Selenium Quick Start 🚀

Welcome to the ultimate beginner-friendly guide to learning Java and test automation from scratch! 

This repository is specifically designed for absolute beginners. You don't need to spend hours installing software, configuring environment variables, or dealing with "it works on my machine" issues. Thanks to GitHub Codespaces, your entire development environment is pre-configured and ready to run in the cloud.

---

## ☁️ Instant Cloud Setup with GitHub Codespaces (with GUI)

This repository comes with a pre-configured **Codespace** that has Java, Maven, Selenium, and a virtual desktop environment fully installed. 

Unlike traditional cloud environments that run tests blindly in "headless" mode, this Codespace includes a **VNC Graphical User Interface (GUI)**. This means you will actually see Chrome open up and click through the website in real-time!

### How to Launch and Connect to the GUI:

1. **Create the Codespace:** Click the green **Code** button at the top right of this repository, select the **Codespaces** tab, and click **Create codespace on main** (or on your current lesson branch).
2. **Wait for the Port Pop-up:** Once the environment loads, GitHub will attempt to automatically open a new browser tab forwarding **Port 6080** (our GUI desktop).
3. **Handle Permissions (Crucial):** * If your browser blocks the pop-up, look at your browser's address bar for a blocked pop-up icon. **You must grant permission / mark the page as trusted** for the GitHub Codespaces domain to allow the tab to open.
   * *Alternatively, if it doesn't open automatically:* Look at the bottom terminal panel in VS Code, click on the **Ports** tab, find Port `6080`, and click the small globe icon (**Open in Browser**).
4. **Connect to the Desktop:** On the new web page that opens, you will see a NoVNC interface. Click the blue **Connect** button.
5. **Watch the Magic:** You are now looking at a virtual Ubuntu desktop! Keep this tab open next to your code. When you run your Selenium tests, Google Chrome will visibly open up right here in **non-headless mode**.

---

## 🗺️ Learning Roadmap & Branch Guide

To make learning manageable, this course is broken down into standalone **branches**. Instead of completing everything on the `main` branch, you will switch branches as you progress through lessons. 

Each branch contains specific code examples, explanations, and exercises.

### ☕ Phase 1: Java Fundamentals (Prerequisites)
Before writing automation scripts, you need to speak the language. Switch to these branches in order to learn the core Java concepts required for automation:

* **`lesson-01-java-basics`**: Variables, Data Types (String, int, boolean), and Basic Operators.
* **`lesson-02-conditionals-loops`**: Making decisions in code (`if/else`) and repeating actions (`for` and `while` loops).
* **`lesson-03-methods`**: How to write reusable blocks of code (functions) and pass data into them.
* **`lesson-04-oop-basics`**: Introduction to Object-Oriented Programming—Classes, Objects, and Constructors (Crucial for Page Object Model later!).
* **`lesson-05-collections`**: Working with data structures, specifically `Lists` and arrays to handle multiple web elements.

### 🌐 Phase 2: Selenium WebDriver Automation
Once you master the Java basics, switch to these branches to start interacting with the **Saucedemo** website:

* **`lesson-06-selenium-setup`**: Launching the browser, navigating to `https://www.saucedemo.com`, and closing the browser cleanly.
* **`lesson-07-locators`**: How to find elements on a webpage using ID, Name, Class, XPath, and CSS Selectors.
* **`lesson-08-basic-interactions`**: Simulating user actions—clicking buttons, typing text into fields, and clearing inputs (The Login Test).
* **`lesson-09-assertions`**: Using TestNG/JUnit to verify that your test actually passed or failed (e.g., verifying you reached the inventory page).
* **`lesson-10-page-object-model`**: Organizing your code like a professional automation engineer using the Page Object Model (POM) design pattern.

---

## 🕹️ How to Switch Branches & Practice

When you are inside your Codespace, you can easily jump to any lesson using the built-in terminal:

1. **Check your current branch:**
```bash
git status

```

2. **Switch to a specific lesson (e.g., Lesson 1):**
```bash
git checkout lesson-01-java-basics

```


3. **Pull the latest updates (if any):**
```bash
git pull origin lesson-01-java-basics

```



Each branch will have its own instructions inside its unique `README.md` file explaining the code and the exercise for that day!

---

## 🛠️ Running Your Automation Tests

Once your GUI tab is connected and visible, go back to your Codespace terminal and execute your test suite using Maven:

```bash
mvn clean test

```

Switch back to your GUI tab immediately to watch Selenium open the browser, navigate to Saucedemo, and interact with the elements live!

---

## 🎯 Target Practice Application

We are targeting **[Sauce Demo](https://www.saucedemo.com/)**, a realistic, mock e-commerce website designed specifically for practicing test automation. You will learn to log in, sort products, add items to the shopping cart, and complete a checkout flow.

---

⭐ **Don't forget to Star this repository if you find it helpful on your QA Automation journey!**
