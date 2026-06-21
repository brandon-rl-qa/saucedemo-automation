# Lesson 03: Methods & Parameters 🛠️

Up until now, all of our code has lived directly inside a single test method block. As your test suite grows, writing everything in one big block makes your scripts messy, hard to read, and impossible to reuse. 

In this lesson, we will learn how to break our code down into reusable building blocks called **Methods**.

In this lesson, we will cover:
1. **Method Structure** (Return types and names)
2. **Method Parameters** (Passing data into a method)

---

## 📖 Concept Breakdown

### 1. Methods
A method is a collection of code grouped together to perform a specific operation. You can think of it like a recipe: you give it a name, and whenever you call that name, Java runs all the steps inside it.

* **`void`**: This keyword means the method performs an action but returns nothing back to you.
  * *Automation Example:* `public void clickLoginButton()` — It clicks, but doesn't hand back data.
* **Return Value**: Instead of `void`, you can specify a data type (like `String` or `int`). This means when the method finishes, it hands a piece of data back to you.
  * *Automation Example:* `public String getPageTitle()` — It grabs the text and hands it back to your test for validation.

### 2. Parameters
Parameters are variables listed inside the method’s parentheses `()`. They act as placeholders for data that the method needs to do its job.

* *Automation Example:* Think of a login method. It needs a username and a password to work. We pass those in as parameters:
  ```java
  public void login(String username, String password) {
      // Logic to type into the fields goes here
  }