package src.main.java.java8features.lambda;

import java.util.Arrays;
import java.util.List;

public class LambdaExamples {
    public static void main(String[] args) {
        // Example 1: Simple Lambda Expression
        Runnable runnable = () -> System.out.println("Hello from Lambda!");
        new Thread(runnable).start();

        // Example 2: Lambda with Parameters
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        names.forEach(name -> System.out.println("Hello, " + name));

        // Example 3: Lambda with Return Value
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.operate(5, 3));
    }

    interface MathOperation {
        int operate(int a, int b);
    }
}
