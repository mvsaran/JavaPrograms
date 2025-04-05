package src.main.java.Oops;
class Vehicle {
    void run() {
        System.out.println("The vehicle is running.");
    }
}

class Car extends Vehicle {
    @Override
    void run() {
        System.out.println("The car is running.");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.run();
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // Polymorphism
        vehicle.run();
    }
}
