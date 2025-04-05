package src.main.java.Oops;
// Abstract class Shape, which serves as a blueprint for specific shapes
abstract class Shape {
    // Abstract method draw, to be implemented by subclasses
    abstract void draw();
}

// Circle class extends Shape and provides implementation for the draw method
class Circle extends Shape {
    // Implementation of the draw method for Circle
    void draw() {
        System.out.println("Drawing a circle."); // Prints a message indicating a circle is being drawn
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();
    }
}

// Main class to demonstrate abstraction and polymorphism
public class AbstractionExample {
    public static void main(String[] args) {
        // Creating a Shape reference pointing to a Circle object (polymorphism)
        Shape shape = new Circle();
        shape.draw(); // Calls the draw method of the Circle class
    }
}
