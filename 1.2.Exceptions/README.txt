# Java Exercises: Exception Handling and Input Management 🚀

This repository contains Java exercises focused on exception handling and input management using the `Scanner` class. Below is a breakdown of the exercises and their objectives.

## 📦 Level 1: Exercise 1 - Product and Sale Management

### Classes:
1. **Product**:
   - Attributes: `nom` (name), `preu` (price).

2. **Sale**:
   - Attributes: A collection of `Product` objects and `totalPrice`.
   - Method: `calculateTotal()`:
     - Throws a custom exception `EmptySaleException` if the product collection is empty.
     - If the collection is not empty, it calculates the total price by summing the prices of all products.

### Custom Exception:
- **EmptySaleException**:
  - Extends the `Exception` class.
  - Constructor takes a message: `"To make a sale, you must add products first"`.
  - The exception message is displayed using `getMessage()` when caught.

### Additional Task:
- Write code to generate and catch an `IndexOutOfBoundsException`.

---

## 🎯 Level 2: Exercise 1 - Input Management with Exception Handling

### Class:
- **Entry** (Input):
  - Purpose: Manages different exceptions that may occur when reading user input using the `Scanner` class.

### Methods:
All methods are static and handle exceptions by prompting the user to re-enter data until it is correctly formatted.

1. **Reading Primitive Types** (Handling `InputMismatchException`):
   - `public static byte readByte(String message)`: Reads a `byte`.
   - `public static int readInt(String message)`: Reads an `int`.
   - `public static float readFloat(String message)`: Reads a `float`.
   - `public static double readDouble(String message)`: Reads a `double`.

2. **Reading Other Types** (Handling Custom Exceptions):
   - `public static char readChar(String message)`: Reads a `char`.
   - `public static String readString(String message)`: Reads a `String`.
   - `public static boolean readYesOrNot(String message)`: Reads a `boolean` (returns `true` for "y" and `false` for "n").

### Key Features:
- If an exception occurs (e.g., incorrect format), the program displays an error message (e.g., `"Error de format"`) and prompts the user to re-enter the data.
- Each method takes a `String` parameter (`missatge`) to display a prompt to the user.

---

## 🛠️ How to Use
1. Clone the repository.
2. Open the project in your preferred Java IDE.
3. Run the `Main` class to test the functionality.
4. Explore the different classes to understand the implementation details.

---

## 📝 Notes
- Ensure you have Java installed on your system.
- The exercises are designed to help you practice exception handling and input validation in Java.

