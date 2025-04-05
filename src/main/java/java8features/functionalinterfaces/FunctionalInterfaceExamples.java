package src.main.java.java8features.functionalinterfaces;

import java.util.function.Predicate;

public class FunctionalInterfaceExamples {
    public static void main(String[] args) {
        // Example 1: Predicate
        Predicate<Integer> isEven = number -> number % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));

        // Example 2: Consumer
        java.util.function.Consumer<String> print = message -> System.out.println(message);
        print.accept("Hello from Consumer!");

        // Example 3: Supplier
        java.util.function.Supplier<Double> randomSupplier = Math::random;
        System.out.println("Random number: " + randomSupplier.get());
    }
}
