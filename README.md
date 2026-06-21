# Lesson 06: Java Fundamentals Capstone 🎓

Welcome to your final test of Phase 1! Before we write actual Selenium code to pilot a real browser, you need to prove you can combine all your core Java skills into a single, cohesive program. 

In this capstone, you will not be handed step-by-step instructions. Instead, you are given a business requirement for a virtual e-commerce checkout engine, and you must build the logic to make it work.

---

## 🏗️ The Scenario: Automated Order Processor

You are writing a backend verification engine for a shopping cart. Your script must process a user's chosen inventory items, calculate the total dynamically, check if the user qualifies for a promotional discount, and ensure the system behaves perfectly.

To pass this milestone, you must apply:
1. **OOP Basics:** Instantiate a simulated inventory database object.
2. **Collections:** Loop through an array or list of selected items.
3. **Conditionals:** Apply a discount code only if the total matches specific criteria.
4. **Methods:** Pass arguments and return exact calculation values to the automation assertion engine.

---

## 💻 Code Example

Open your working file located at:
📁 `src/test/java/lessons/Lesson06JavaCapstoneTest.java`

You will see that the file contains structure, but the core execution logic is completely blank. Your job is to fill in the missing puzzle pieces without breaking the pre-written TestNG assertions at the bottom.

---

## 🎯 Your Challenge: Build the Checkout Engine!

Your assignment is inside `Lesson06JavaCapstoneTest.java`. Read the business rules carefully and implement the logic inside the requested method frames.

### Business Rules:
1. **Item Verification:** Loop through the cart. If an item costs more than `$20.00`, print a log statement tagging it as a `[PREMIUM ITEM]`.
2. **Subtotal Calculation:** Sum up the price of all items in the customer's cart.
3. **Discount Logic:** If the customer passes the coupon code `"THANKYOU"`, deduct `$5.00` *only* if their calculated subtotal is greater than `$40.00`. If it's less than `$40.00`, the coupon should not be applied!

### Instructions:
1. Open `src/test/java/lessons/Lesson06JavaCapstoneTest.java`.
2. Review the `SauceItem` class blueprint at the bottom of the file.
3. Implement the missing logic loops inside the `processOrder` method.
4. Run your final capstone validation suite using the quiet Maven filter:
```bash
mvn test -q