# Lesson 04: Arrays & Collections 🎒

When automating a website, you often have to deal with multiple things at once. For example, grabbing all the product titles on a page or clicking every checkbox in a form. Storing each title in its own variable (`product1`, `product2`, etc.) would be a nightmare. 

In this lesson, we will learn how to store groups of data in **Arrays** and **ArrayLists**.

In this lesson, we will cover:
1. **Fixed Arrays** (Static sizes)
2. **ArrayLists** (Dynamic, flexible collections)

---

## 📖 Concept Breakdown

### 1. Arrays (Fixed Size)
An array is a container object that holds a fixed number of values of a single type. The length of an array is established when it is created and cannot change.
* Elements inside an array are accessed by their **index**, starting at `0`.
* *Automation Example:* Storing the predefined list of valid usernames for Saucedemo (`standard_user`, `locked_out_user`).

### 2. ArrayLists (Dynamic Size)
An `ArrayList` is a class in Java's Collections framework that acts like an array, but has **no size limit**. You can add or remove items dynamically at runtime.
* We use `.add()` to insert elements, `.get(index)` to read them, and `.size()` to find out how many items are inside.
* *Automation Example:* Scraping a shopping cart page to extract whatever items the user decided to add. Because the cart size changes constantly, an `ArrayList` is perfect.

---

## 💻 Code Example

Open your working file located at:
📁 `src/test/java/lessons/Lesson04CollectionsTest.java`

Observe how arrays use square brackets `[]` and a fixed length, while `ArrayList` uses regular methods to expand or shrink on the fly.

---

## 🎯 Your Challenge: Audit the Inventory Cart!

Your assignment is inside `Lesson04CollectionsTest.java`. We are building a verification engine that takes a dynamic list of items chosen by a user and matches it against our static warehouse list. Right now, the lists are misconfigured, causing our automation checks to fail.

### Instructions:
1. Open `src/test/java/lessons/Lesson04CollectionsTest.java`.
2. Scroll down to the `// TODO` checkpoints inside the test block.
3. Fix the array indexing, declare the dynamic shopping list correctly, and populate it with the requested items.
4. Run your code using the quiet Maven test filter:
```bash
mvn test -q