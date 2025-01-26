# 🧑‍💻 Java Collections and File Handling Exercises

This repository contains Java exercises focused on **collections**, **file handling**, and **user interaction**. The exercises demonstrate key concepts such as working with `ArrayList`, `HashSet`, `HashMap`, `ListIterator`, and reading/writing files in Java.

---

## Exercise Overview

### Level 1: Exercise 1
**Topic: ArrayList and HashSet Operations**  
Create a class called `Month` with an attribute `name` (to store the name of the month).
- Add 11 `Month` objects (each with a different name) to an `ArrayList`, excluding the month "Agost".
- Insert the missing month ("Agost") in its correct position and demonstrate that the `ArrayList` maintains the correct order.
- Convert the `ArrayList` into a `HashSet` and ensure that duplicates are not allowed.
- Iterate through the list using a `for` loop and an `Iterator`.

**Key Concepts**:
- Working with `ArrayList` and `HashSet`.
- Inserting elements at specific positions.
- Iterating through collections.

---

### Level 1: Exercise 2
**Topic: List and ListIterator Operations**
- Create and populate a `List<Integer>`.
- Create a second `List<Integer>` and insert the elements of the first list in reverse order.
- Use `ListIterator` to read elements from the first list and insert them into the second list.

**Key Concepts**:
- Using `ListIterator` for bidirectional traversal.
- Reversing the order of elements in a list.

---

### Level 2: Exercise 1
**Topic: HashMap and File Handling**  
Given a file named `countries.txt` (provided in the resources section) that contains countries and their capitals:
- Read the file and store the data in a `HashMap<String, String>`.
- Ask the user for their name.
- Display a random country from the `HashMap` and prompt the user to enter the corresponding capital.
- If the user answers correctly, add one point to their score.
- Repeat this process 10 times.
- Save the user's name and score in a file named `classificacio.txt`.

**Key Concepts**:
- Reading from and writing to files.
- Using `HashMap` to store key-value pairs.
- Random selection and user interaction.

---

## Running the Exercises

1. Clone the repository.

2. Compile and run the Java files:
   ```bash
   javac 1.3.1.Exercise1.java
   java 1.3.1.Exercise1
   
3. Repeat the process for `1.3.1Exercise2.java` and `1.3.1.Exercise3.java`.

## Resources

`countries.txt`- A text file containing countries and their capitals in the format:

Country1:Capital1
Country2:Capital2
...
