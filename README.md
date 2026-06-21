# Lesson 02: Conditionals & Loops 🔄

Now that you know how to store data in variables, it's time to give your code a brain! Right now, your code runs strictly from top to bottom. In this lesson, we will learn how to make decisions and repeat actions.

In this lesson, we will cover:
1. **Conditionals** (`if`, `else if`, `else`)
2. **Loops** (The `for` loop)

---

## 📖 Concept Breakdown

### 1. Conditionals (`if / else`)
Conditionals allow your program to execute certain blocks of code only if a specific condition evaluates to `true`.

* **`if`**: The initial gateway. "If this condition is true, do this."
* **`else if`**: A secondary check. "If the first thing wasn't true, try checking this condition instead."
* **`else`**: The safety net. "If none of the above conditions were true, do this by default."
* *Automation Example:* **If** the user is locked out, verify the error message appears. **Else**, verify the dashboard inventory page loads.

### 2. Loops (`for` loops)
Loops allow you to repeat a block of code a set number of times without rewriting it.
* A `for` loop uses a counter variable (usually `i`), a target limit, and an increment step (like `i++` which means add 1).
* *Automation Example:* Looping through all 6 product inventory titles displayed on Saucedemo to check if any of them say "Sauce Labs Backpack".

---

## 💻 Code Example

Open your working file located at:
📁 `src/test/java/lessons/Lesson02ConditionalsLoops.java`

Look closely at how the logic gates evaluate boolean values and how the loop increments its counter.

---

## 🎯 Your Challenge: Inventory Counter & System Verification!

Your assignment is inside `Lesson02ConditionalsLoops.java`. We are mimicking an item parsing engine for the Saucedemo store, but the conditions are incomplete and the inventory loop is broken.

### Instructions:
1. Open `src/test/java/lessons/Lesson02ConditionalsLoops.java`.
2. Scroll down to the `// TODO` checkpoints.
3. Fix the conditional logic to accurately print matching system alert banners.
4. Correct the `for` loop parameters so it counts through the virtual items list completely.
5. Run your test suite using the TestNG configuration engine:
```bash
mvn test -q