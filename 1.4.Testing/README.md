# Java Exercises: Collections, File Handling, Custom Classes, and JUnit Testing 📚

This repository contains Java exercises focused on working with collections (ArrayList, HashSet, HashMap), file handling, creating custom classes with specific behaviors, JUnit testing and Assertj. Below is a breakdown of the exercises and their objectives.

---

## 🧪 Level 1: JUnit Testing

### Exercise 1: Library Management System

#### Tasks:
1. Create a Java class to manage a collection of books in a library.
2. Implement the following functionalities:
   - Add books to the collection.
   - Retrieve the complete list of books.
   - Get the title of a book by its position.
   - Add a book at a specific position.
   - Remove a book by its title.
3. Verify the correct functionality using JUnit:
   - Ensure the list of books is not null after creating a new object.
   - Confirm the list has the expected size after inserting several books.
   - Ensure the list contains a specific book in its correct position.
   - Verify there are no duplicate book titles in the list.
   - Check that the title of a book can be retrieved by its position.
   - Ensure adding a book modifies the list correctly.
   - Confirm removing a book decreases the size of the list.
   - Verify the list remains alphabetically sorted after adding or removing a book.

---

### Exercise 2: DNI Letter Calculation

#### Tasks:
1. Create a class named `DniCalculation` that calculates the letter of a DNI (Spanish ID) when given the number as a parameter.
2. Create a JUnit test class to verify its correct functionality, parameterizing the test to validate the calculation for 10 predefined DNI numbers.

---

### Exercise 3: Exception Handling

#### Tasks:
1. Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.
2. Verify its correct functionality using a JUnit test.

---

## 🧪 Level 2: AssertJ Testing

### Exercise 1: Integer Comparison

#### Tasks:
1. Write an assertion to demonstrate that the value of two integer objects is equal.
2. Write another assertion to demonstrate that the value of two integer objects is not equal.

---

### Exercise 2: Object Reference Comparison

#### Tasks:
1. Write an assertion to demonstrate that the reference to an object is the same as another.
2. Write another assertion to demonstrate that the reference to an object is different.

---

### Exercise 3: Array Comparison

#### Tasks:
1. Write an assertion to demonstrate that two arrays of integers are identical.

---

### Exercise 4: ArrayList Order and Content Verification

#### Tasks:
1. Create an `ArrayList` containing various types of objects.
2. Write assertions to verify:
   - The order of objects in the `ArrayList` matches the insertion order.
   - The list contains objects in any order.
   - One of the objects has been added only once.
   - The list does not contain a specific object that was not added.

---

### Exercise 5: Map Key Verification

#### Tasks:
1. Create a `Map` and verify that it contains one of the keys added to it.

---

### Exercise 6: Exception Verification

#### Tasks:
1. Trigger an `ArrayIndexOutOfBoundsException` in a class.
2. Write an assertion to validate that the exception is thrown when expected.

---

### Exercise 7: Optional Object Verification

#### Tasks:
1. Create an empty `Optional` object.
2. Write the correct assertion to verify that it is indeed empty.

---

## 🛠️ How to Use
1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Run the `Main` class to test the functionality.
4. Explore all classes to understand the implementation details.

---

## 📝 Notes
- Ensure you have Java installed on your system.
- The exercises are designed to help you practice working with collections, file handling, custom classes, and testing in Java.
