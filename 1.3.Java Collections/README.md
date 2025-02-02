# Java Exercises: Collections, File Handling, and Custom Classes 📚

This repository contains Java exercises focused on working with collections (ArrayList, HashSet, HashMap), file handling, and creating custom classes with specific behaviors. Below is a breakdown of the exercises and their objectives.

---

## 🌟 Level 1: Exercises

### Main 1: Month Class and ArrayList/HashSet Operations

#### Class:
- **Month**:
   - Attribute: `name` (stores the name of the month).

#### Tasks:
1. Create 11 `Month` objects (each with a unique name) and add them to an `ArrayList`, excluding the month "Agost" (August).
2. Insert the "Agost" object in its correct position in the `ArrayList` and demonstrate that the list maintains the correct order.
3. Convert the `ArrayList` into a `HashSet` and ensure that it does not allow duplicates.
4. Iterate through the list using a `for` loop and an `Iterator`.

---

### Main 2: Reversing a List Using ListIterator

#### Tasks:
1. Create and populate a `List<Integer>`.
2. Create a second `List<Integer>` and insert the elements of the first list in reverse order.
3. Use `ListIterator` to read elements from the first list and insert them into the second list.

---

### Main 3: Country-Capital Quiz with File Handling

#### Tasks:
1. Read the file `countrties.txt` (provided in the resources section) which contains countries and their capitals.
2. Store the data in a `HashMap<String, String>` where the key is the country and the value is the capital.
3. Ask the user for their name.
4. Randomly select a country from the `HashMap` and prompt the user to enter the corresponding capital.
   - If the user answers correctly, add one point to their score.
5. Repeat the process 10 times.
6. Save the user's name and score in a file named `classification.txt`.

---

## 🚀 Level 2: Exercises

### Main 1: Restaurant Class with Unique Constraints

#### Class:
- **Restaurant**:
   - Attributes: `name`, `score`.

#### Tasks:
1. Implement the necessary methods to ensure that no two `Restaurant` objects with the same name and score can be added to a `HashSet`.
   - Restaurants with the same name but different scores are allowed.
   - Restaurants with the same name and score are not allowed.

---

### Main 2: Sorting Restaurants by Name and Score

#### Tasks:
1. Using the `Restaurant` class from the previous exercise, implement the necessary logic to sort `Restaurant` objects by name and score in descending order.
   - Example:
      - `name: restaurant1, score: 8`
      - `name: restaurant1, score: 7`

---

## 🛠️ How to Use
1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Run the `Main` class to test the functionality.
4. Explore all classes to understand the implementation details.

---

## 📝 Notes
- Ensure you have Java installed on your system.
- The exercises are designed to help you practice working with collections, file handling, and custom classes in Java.