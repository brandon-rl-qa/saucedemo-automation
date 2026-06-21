# Lesson 01: Java Basics ☕

Welcome to your first step in learning Java! Before we can make selenium click buttons or read text from a website, we need to understand how Java stores information and manipulates data. 

In this lesson, we will cover:
1. **Variables & Data Types** (String, int, boolean)
2. **Basic Operators** (Assignment, Arithmetic, and Comparison)

---

## 📖 Concept Breakdown

### 1. Variables & Data Types
Think of a **variable** as a labeled storage box. Inside the box goes your data. The **data type** tells Java what *kind* of data is allowed inside that box.

* **`String`**: Used for text. Must be enclosed in double quotes `" "`. 
  * *Automation Example:* Storing a username, password, or page title.
* **`int`** (Integer): Used for whole numbers (positive or negative, no decimals).
  * *Automation Example:* Storing the number of items in a shopping cart or a countdown timer.
* **`boolean`**: Can only hold two values: `true` or `false`.
  * *Automation Example:* Checking if a login button is visible (`true`) or if an error message is displayed (`false`).

### 2. Basic Operators
Operators are symbols that let you perform actions on your variables.
* **Assignment (`=`)**: Puts a value inside a variable. (e.g., `String name = "Standard_user";`)
* **Arithmetic (`+`, `-`)**: Standard math. In Java, `+` is also used to join text strings together (Concatenation).
* **Comparison (`==`, `!=`)**: Used to compare two values. 
  * `==` checks if two things are equal.
  * `!=` checks if two things are *not* equal.

---

## 💻 Code Example

Switch to your VNC GUI browser tab. Open the file located at:
📁 `src/test/java/lessons/Lesson01Basics.java`

You will see how we declare these variables and print them out to the console using `System.out.println()`.

---

## 🎯 Your Challenge: Help Fix the Saucedemo Script!

Your assignment is inside `Lesson01Basics.java`. Some variables are missing, and some values are incorrect, causing our automated checks to fail.

### Instructions:
1. Open `src/test/java/lessons/Lesson01Basics.java` in your Codespace.
2. Scroll down to the `// TODO` comments.
3. Fill in the correct data types, fix the username assignment, and complete the comparison logic.
4. Run your code using the terminal:
```bash
mvn test -Dtest=Lesson01Basics