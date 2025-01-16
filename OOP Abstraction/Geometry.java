// Demonstrating Abstraction

// Abstract class defining common characteristics for all shapes
abstract class Shape {
    String color; // Common property for all shapes

    // Abstract methods to enforce implementation in subclasses
    abstract double area(); // Must be implemented to calculate the area
    public abstract String toString(); // Must be implemented to return string representation

    // Constructor in abstract class to initialize the color property
    public Shape(String color) {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // Concrete method to get the color of the shape
    public String getColor() {
        return color;
    }
}

// Subclass representing a Circle
class Circle extends Shape {
    double radius;

    // Constructor for Circle, calls the Shape constructor to set the color
    public Circle(String color, double radius) {
        super(color); // Calls the constructor of Shape
        System.out.println("Circle constructor called");
        this.radius = radius;
    }

    // Implementation of abstract method to calculate the area of a circle
    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    // Implementation of abstract method to return a string representation
    @Override
    public String toString() {
        return "Circle color is " + super.getColor() + " and area is: " + area();
    }
}

// Subclass representing a Rectangle
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor for Rectangle, calls the Shape constructor to set the color
    public Rectangle(String color, double length, double width) {
        super(color); // Calls the constructor of Shape
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }

    // Implementation of abstract method to calculate the area of a rectangle
    @Override
    double area() {
        return length * width;
    }

    // Implementation of abstract method to return a string representation
    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor() + " and area is: " + area();
    }
}

// Exercise:

// Extend the Shape class with a Triangle class:

//     • The constructor should accept color, Base, and Height as input
//     • Override area() with the calculation 0.5 * Base * Height
//     • Override toString with an output showing the Triangle color and area.


// Subclass representing a Triangle
class Triangle extends Shape {
    double base;
    double height;

    // Constructor for Triangle, calls the Shape constructor to set the color
    public Triangle(String color, double base, double height) {
        super(color); // Calls the constructor of Shape
        System.out.println("Triangle constructor called");
        this.base = base;
        this.height = height;
    }

    // Implementation of abstract method to calculate the area of a triangle
    @Override
    double area() {
        return 0.5 * base * height;
    }

    // Implementation of abstract method to return a string representation
    @Override
    public String toString() {
        return "Triangle color is " + super.getColor() + " and area is: " + area();
    }
}

// Geometry class to demonstrate abstraction
public class Geometry {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Shape s1 = new Circle("Red", 2.2); // Upcasting Circle to Shape
        Shape s2 = new Rectangle("Yellow", 2, 4); // Upcasting Rectangle to Shape
        Shape s3 = new Triangle("Green", 3, 7); // Upcasting Triangle to Shape

        // Calling the overridden toString methods
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}

// Explanation

// 1. Abstract Class
// 	•	The Shape class is declared as abstract using the abstract keyword.
// 	•	It provides a common blueprint for all shapes (e.g., Circle, Rectangle).
// 	•	Abstract classes:
// 	•	Can have abstract methods (methods without implementation).
// 	•	Can also have concrete methods (methods with implementation).

// 2. Abstract Methods
// 	•	Declared without a body in the Shape class:

// abstract double area();
// public abstract String toString();


// 	•	These methods enforce that any subclass must provide an implementation for these methods.

// 3. Constructor in Abstract Class
// 	•	Abstract classes can have constructors.
// 	•	The constructor in the Shape class:

// public Shape(String color) {
//     System.out.println("Shape constructor called");
//     this.color = color;
// }

// 	•	Initializes the color property.
// 	•	Is called automatically when a subclass is instantiated (via super).

// 4. Subclasses (Circle and Rectangle)
// 	•	Subclasses extend the Shape class and:
// 	•	Provide their specific implementations for area() and toString().
// 	•	Call the Shape constructor using the super keyword to initialize the color property.

// 5. Concrete Method
// 	•	The getColor() method in Shape is a concrete method:

// public String getColor() {
//     return color;
// }


// 	•	Provides a common way to retrieve the color property for all shapes.

// 6. Geometry Class (Geometry)
// 	•	The main method demonstrates abstraction by:
// 	    •	Using the Shape reference (s1, s2) to store Circle and Rectangle objects (upcasting).
// 	    •	Calling the toString() method, which is polymorphic and resolves to the respective subclass implementation.

// Output of the Program

// When you run the program, the following output will be displayed:

// Shape constructor called
// Circle constructor called
// Shape constructor called
// Rectangle constructor called
// Circle color is Red and area is: 15.205308443374602
// Rectangle color is Yellow and area is: 8.0

// Key Points:
// 	1.	Abstraction:
// 	    •	Hides implementation details and exposes only essential functionality.
// 	    •	Enforced by abstract classes and abstract methods.
// 	2.	Polymorphism:
// 	    •	The toString() and area() methods are resolved dynamically at runtime based on the object’s type.
// 	3.	Constructor in Abstract Class:
// 	    •	Used to initialize common properties (color) and is always called when a subclass is instantiated.
// 	4.	Concrete Methods in Abstract Classes:
// 	    •	Provide default functionality that can be reused across subclasses.

// This program demonstrates how abstraction helps in creating a flexible, reusable, and maintainable design in Java.