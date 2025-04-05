package src.main.java.Oops;

class Animal {
    void sound() {
        System.out.println("Some generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Animal dog = new Dog(); // Polymorphism
        dog.sound();
    }
}
