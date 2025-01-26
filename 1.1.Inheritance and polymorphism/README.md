# 🧑‍💻 Inheritance and Polymorphism Exercises

This repository contains Java exercises focused on **inheritance**, **polymorphism**, and **interface implementation**. The exercises demonstrate key object-oriented programming concepts, including abstract classes, method overriding, static and non-static members, and interface usage.

## Exercise Overview

### Level 1: Exercise 1
**Topic: Musical Instruments and Polymorphism**  
Create a hierarchy of musical instruments, including:
- **Wind instruments**  
- **String instruments**  
- **Percussion instruments**  

Each instrument has:
- **Attributes**: `name` and `price`  
- **Method**: `play()`, which is abstract in the base class and implemented in each subclass to print a unique message:  
  - Wind instrument: `"A wind instrument is playing"`  
  - String instrument: `"A stringed instrument is playing"`  
  - Percussion instrument: `"A percussion instrument is playing"`  

**Additional Concepts**:  
- Demonstrate how class loading occurs once, triggered by creating an instance or accessing a static member.  
- Explore **static and initialization blocks** in Java.

### Level 1: Exercise 2
**Topic: Static, Final, and Static Final Variables in a Car Class**  
Create a `Car` class with the following attributes:
- `BRAND`: static final  
- `model`: static  
- `power`: final  

Add methods:
- `brake()`: Static method to print `"The vehicle is braking"`.  
- `accelerate()`: Non-static method to print `"The vehicle is accelerating"`.  

**Main Method Demonstration**:
- Show how to call static and non-static methods.  
- Modify and display static and final attributes to highlight their differences.

### Level 2: Exercise 1
**Topic: Interface Implementation in a Smartphone Class**  
Create the following structure:
- **Class `Phone`**:  
  Attributes: `brand` and `model`  
  Method: `call(String phoneNumber)` — prints `"Calling {phoneNumber}"`.  

- **Interface `Camera`**:  
  Method: `photograph()` — prints `"A photo is being taken"`.  

- **Interface `Watch`**:  
  Method: `alarm()` — prints `"The alarm is sounding"`.  

- **Class `Smartphone`**:  
  Inherits from `Phone` and implements `Camera` and `Watch`.  
  Overrides the respective methods with the provided functionality.

**Main Method Demonstration**:
- Instantiate a `Smartphone` and call `call()`, `photograph()`, and `alarm()`.

## Running the Exercises
1. Clone the repository:  
   ```bash
   git clone https://github.com/username/1.1.Inheritance-and-polymorphism.git
   cd 1.1.Inheritance-and-polymorphism
