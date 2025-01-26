###🛍️ Product and Sale Application

##📋 Description

This project demonstrates an object-oriented approach to creating a simple product management and sales system in Java. It includes the following:

- Product class with attributes name and price.

- Sale class that holds a collection of products and a totalPrice attribute.

- A method named calculateTotal() in the Sale class that:

    - Throws a custom exception named EmptySaleException if the product collection is empty.

    - Calculates the total price of all products and stores it in the totalPrice attribute.

- EmptySaleException class extending Exception, displaying a custom message.

- An example of handling an IndexOutOfBoundsException.

##🛠️ Prerequisites

- Java Development Kit (JDK) 8 or later

- A Java-compatible IDE or text editor (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code)

##▶️ Running the Application

1. Clone or download the repository.

2. Open the project in your preferred Java IDE.

3. Compile and run the main Java file.

4. Test cases will demonstrate the behavior of:

    Adding products to a sale.

    Calculating the total sale price.

    Handling EmptySaleException when the product list is empty.

    Catching and displaying an IndexOutOfBoundsException.

##💻 Technologies Used

- Java: Programming language for creating object-oriented classes and custom exceptions.

- JDK: Java Development Kit for compiling and running the program.
