# ✏️ Java Annotations Exercises

This repository contains Java exercises focused on understanding and implementing annotations. The exercises are divided into two levels, each with specific tasks to practice different aspects of annotations in Java.

## Level 1

### Exercise 1

Create a hierarchy of objects with three classes: `Worker`, `OnlineWorker`, and `FaceToFaceWorker`.

- The `Worker` class has the following attributes: `name`, `surname`, and `priceHour`. It also has a method `calculateSalary()` that takes the number of hours worked as a parameter and multiplies it by the `priceHour`.
- The child classes (`OnlineWorker` and `FaceToFaceWorker`) must override this method using the `@Override` annotation.

From the `main()` method in the `Principal` class, make the necessary invocations to demonstrate the functionality of the `@Override` annotation.

- For `FaceToFaceWorker`, the `calculateSalary()` method will receive the number of hours worked in a month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the `priceHour`, and the value of a static attribute called `gasoline` will be added.
- For `OnlineWorker`, the `calculateSalary()` method will receive the number of hours worked in a month as a parameter. When calculating the salary, the number of hours worked will be multiplied by the `priceHour`, and the price of the flat Internet rate, which will be a constant in the `OnlineWorker` class, will be added.

### Exercise 2

Add some deprecated methods to the child classes and use the corresponding annotation. Invoke these deprecated methods from an external class, suppressing the warnings using the appropriate annotation.

## Level 2

### Exercise 1

Create a custom annotation that allows serializing a Java object into a JSON file. The annotation should receive the directory where the resulting file will be placed.

## How to Use

1. Clone this repository.
2. Open the project in your preferred Java IDE.
3. Navigate to the `main` class to see the main method and run the program to observe the output.
4. Explore the custom annotation in the Level 2 exercise to understand how to serialize objects to JSON.

## Requirements

- Java 8 or higher.
- Maven (for dependency management, if needed).
