# Lesson 05: OOP Basics 🏗️

Welcome to Object-Oriented Programming (OOP)! When automating an e-commerce site like Saucedemo, you interact with specific webpages (like the Login Page, the Inventory Page, and the Cart Page). In Java, we represent these real-world pages as **Classes**, and we create **Objects** out of them inside our tests. 

This concept forms the structural foundation of the **Page Object Model (POM)**—the industry standard design pattern for organizing professional automation frameworks.

In this lesson, we will cover:
1. **Classes as Blueprints** (Defining variables and actions for a webpage)
2. **Objects as Instances** (Creating an actual working copy of that page)

---

## 📖 Concept Breakdown

### 1. Classes (The Blueprint)
A class is a template or blueprint used to create objects. It defines what properties the object will have (fields/variables) and what actions it can perform (methods).

* *Automation Example:* A `LoginPage` class acts as the master blueprint. It specifies that every login page has a username text field, a password text field, and a `clickLogin()` action.

### 2. Objects (The Instance)
An object is an instance of a class. The class is just the drawing on paper; the object is the actual physical structure built from that drawing. We use the **`new`** keyword to instantiate an object in Java.

## 💻 Code Example

Open your working file located at:
📁 `src/test/java/lessons/Lesson05OOPBasicsTest.java`

Notice that at the bottom of the file, we have defined a miniature, simulated `SauceLoginPage` class blueprint:

```java
static class SauceLoginPage {
    String username;
    String password;

    public String performSimulatedLogin() {
        return "Attempting login for " + username;
    }
}
```

Inside our main test method, we can instantiate an actual object instance of that blueprint, assign its distinct data fields, and trigger its internal action methods like this:

```java
SauceLoginPage loginPage = new SauceLoginPage();
loginPage.username = "standard_user";
loginPage.password = "secret_sauce";
loginPage.performSimulatedLogin();
```

## 🎯 Your Challenge: Instantiate the Login Page Object!

Your assignment is inside `Lesson05OOPBasicsTest.java`. We have defined the blueprint for a login page object at the bottom of the file, but our test execution suite is currently failing because the object is uninitialized (`null`) and its core credential data fields are not configured properly.

### Instructions:
1. Open `src/test/java/lessons/Lesson05OOPBasicsTest.java`.
2. Scroll down to the `// TODO` checkpoints inside the test block.
3. Instantiate the page object using the `new` keyword to clear the `null` pointer.
4. Uncomment the parameter initialization code and assign the object fields to match valid Saucedemo credentials.
5. Run your code using the quiet Maven test filter to verify everything passes:

```bash
mvn test -q