# 📐 Shapes - Java OOP

A Java-based **Shapes Management System** developed as part of **Tuwaiq Academy Lab 4**.

The project demonstrates important **Object-Oriented Programming (OOP)** concepts such as abstraction, inheritance, encapsulation, method overriding, and polymorphism.

## 📌 Project Overview

The system represents different geometric shapes and provides methods to calculate their:

- Area
- Circumference / Perimeter

The project contains three shape types:

- ⭕ Circle
- ▭ Rectangle
- 🔺 Triangle

All shapes inherit from the abstract `Shape` class.

## 🏗️ Class Structure

```text
                    ┌──────────────────┐
                    │      Shape       │
                    │    (abstract)    │
                    ├──────────────────┤
                    │ + calculateArea()│
                    │ + calculate...() │
                    └────────┬─────────┘
                             │
              ┌──────────────┼──────────────┐
              │              │              │
       ┌──────▼──────┐ ┌─────▼─────┐ ┌─────▼──────┐
       │   Circle    │ │ Rectangle │ │  Triangle  │
       ├─────────────┤ ├───────────┤ ├────────────┤
       │ radius      │ │ height    │ │ height     │
       │             │ │ width     │ │ base       │
       ├─────────────┤ ├───────────┤ ├────────────┤
       │ Area        │ │ Area      │ │ Area       │
       │ Circumference││ Perimeter │ │ Perimeter  │
       └─────────────┘ └───────────┘ └────────────┘
```

## 📂 Project Classes

### `Shape`

An abstract parent class for all shapes.

It defines the methods that every shape must implement:

```java
public abstract double calculateArea();

public abstract double calculateCircumference();
```

The class also contains `x` and `y` coordinates.

### `Circle`

Extends `Shape` and represents a circle.

**Attribute:**

- `radius`

**Methods:**

- `getRadius()`
- `setRadius()`
- `calculateArea()`
- `calculateCircumference()`
- `toString()`

The calculations use:

```text
Area = π × radius²

Circumference = 2 × π × radius
```

The project uses `3.14` as the value of π.

### `Rectangle`

Extends `Shape` and represents a rectangle.

**Attributes:**

- `height`
- `width`

**Methods:**

- `getHeight()`
- `setHeight()`
- `getWidth()`
- `setWidth()`
- `calculateArea()`
- `calculateCircumference()`
- `toString()`

The calculations are:

```text
Area = height × width

Perimeter = 2 × (height + width)
```

### `Triangle`

Extends `Shape` and represents a triangle.

**Attributes:**

- `height`
- `base`

**Methods:**

- `getHeight()`
- `setHeight()`
- `getBase()`
- `setBase()`
- `calculateArea()`
- `calculateCircumference()`
- `toString()`

The area is calculated using:

```text
Area = 0.5 × base × height
```

The implementation calculates the circumference as:

```text
Circumference = 3 × base
```

This assumes an equilateral triangle where all three sides have the same length as the base.

## 🧠 OOP Concepts Demonstrated

### 1. Abstraction

`Shape` is declared as an abstract class and defines common methods that all shapes must implement.

```java
public abstract class Shape {

    public abstract double calculateArea();

    public abstract double calculateCircumference();

}
```

### 2. Inheritance

The shape classes inherit from `Shape`:

```text
Shape
├── Circle
├── Rectangle
└── Triangle
```

For example:

```java
public class Circle extends Shape
```

### 3. Encapsulation

Shape attributes are declared `private` and accessed through getters and setters.

Example:

```java
private double radius;

public double getRadius() {
    return radius;
}

public void setRadius(double radius) {
    this.radius = radius;
}
```

### 4. Method Overriding

Each shape provides its own implementation of the abstract methods:

```java
@Override
public double calculateArea() {
    // Shape-specific calculation
}
```

and:

```java
@Override
public double calculateCircumference() {
    // Shape-specific calculation
}
```

### 5. Polymorphism

Because all shapes inherit from `Shape`, they can be treated as objects of the parent type while providing their own implementations of the calculation methods.

For example:

```java
Shape shape = new Circle(5);
System.out.println(shape.calculateArea());
```

The correct `Circle` implementation is executed at runtime.

## ⚙️ Main Program

The `Main` class creates multiple objects from each shape class and displays their information and calculations.

The program creates:

- 3 circles
- 3 rectangles
- 3 triangles

For each object, the program displays:

- Shape description
- Area
- Circumference / Perimeter

Example:

```java
Circle c1 = new Circle(2);

System.out.println(c1.toString());
System.out.println("Area = " + c1.calculateArea());
System.out.println("Circumference = " + c1.calculateCircumference());
```

## 🧪 Example Output

A simplified example of the program output:

```text
<====================================>
A circle with radius: 2.0
Area = 12.56
Circumference = 12.56
-----------------
A circle with radius: 3.0
Area = 28.26
Circumference = 18.84

<====================================>
A rectangle with height: 10.0, width: 20.0
Area = 200.0
Perimeter = 60.0

<====================================>
A triangle with height: 10.0, base: 8.0
Area = 40.0
Perimeter = 24.0
```

## ▶️ How to Run

### Requirements

- Java JDK
- IntelliJ IDEA, Eclipse, or VS Code

### Run the Project

1. Clone the repository:

```bash
git clone https://github.com/YOUR-USERNAME/YOUR-REPOSITORY.git
```

2. Open the project in your preferred Java IDE.

3. Compile the Java files.

4. Run:

```text
Main.java
```

## 📁 Project Structure

```text
Shapes/
│
├── Circle.java
├── Main.java
├── Rectangle.java
├── Shape.java
├── Triangle.java
│
└── README.md
```

> Note: If your Java file is currently named `Trinagle.java`, consider renaming it to `Triangle.java` and updating the class name to follow the correct spelling.

## 🎯 Learning Objectives

This project was created to practice:

- Java Object-Oriented Programming
- Abstract classes
- Abstraction
- Inheritance
- Polymorphism
- Encapsulation
- Method Overriding
- Constructors
- Getters and Setters
- Mathematical calculations
- Creating and working with objects

## 👨‍💻 Author

**Turki Alghamdi**

Software Engineering Graduate  
King Fahd University of Petroleum & Minerals (KFUPM)

## 📚 Academic Context

**Tuwaiq Academy — Lab 4**

The project was developed based on the provided UML class structure and focuses on applying Java OOP concepts through a simple geometric shapes system.
