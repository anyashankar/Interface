# Java OOP Concepts Demonstration

These files are part of a programming exercise or demonstration focusing on object-oriented programming concepts in Java.

## Overview

The project showcases several key OOP principles, including interface implementation, abstract classes, inheritance, polymorphism, and encapsulation.

## Code Breakdown

### Interface and Abstract Class Implementation

- **IF.java**: Defines an interface with two method signatures.
- **AB.java**: Contains an abstract class that implements the `IF` interface.
- **NL class**: (Referenced in `Main.java`, but not provided) Likely extends `AB` and provides concrete implementations of the methods.

### Inheritance and Polymorphism

- **Main.java**: Demonstrates polymorphism by creating instances of the `NL` class using references of types `NL`, `AB`, and `IF`.
  - This illustrates how methods from different classes or interfaces can be accessed based on the reference type.

### Encapsulation

- **Employee.java**: Demonstrates encapsulation with private fields and public getter/setter methods, ensuring controlled access to an employee's data.

## Key Concepts Demonstrated

- **Interface implementation**: The `IF` interface defines behavior that must be implemented by any class that implements it.
- **Abstract classes**: The `AB` abstract class provides a partial implementation of the `IF` interface, requiring further specialization by subclasses.
- **Inheritance**: The `NL` class likely extends the `AB` abstract class and implements its abstract methods.
- **Polymorphism**: The `Main.java` file shows how objects of type `NL` can be accessed through references of type `AB` and `IF`, demonstrating polymorphism in action.
- **Encapsulation**: The `Employee.java` file illustrates how to use getter and setter methods to control access to private fields.

## Exercise Purpose

The comments in `Main.java` suggest that part of the exercise involves identifying which methods are accessible through different reference types, which is key to understanding:
- Polymorphism
- Method visibility in Java

This code structure is typically used to teach or demonstrate foundational OOP principles in Java.

## Usage

To run the demonstration:
1. Compile and run the `Main.java` file.
2. Observe the behavior of objects created using different reference types (e.g., `NL`, `AB`, and `IF`).
3. Review the encapsulation example in `Employee.java` for understanding data protection in object-oriented design.
