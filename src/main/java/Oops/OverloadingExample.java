package src.main.java.Oops;

class Calculator {
    // Method overloading: same method name, different parameters
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of two integers: " + calculator.add(5, 10));
        System.out.println("Sum of three integers: " + calculator.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + calculator.add(5.5, 10.5));
    }
}
