package src.main.java.java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExamples {
    public static void main(String[] args) {
        // Example 1: Filtering
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);

        // Example 2: Mapping
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        System.out.println("Uppercase Names: " + upperCaseNames);

        // Example 3: Reduction
        int sum = numbers.stream()
                         .reduce(0, Integer::sum);
        System.out.println("Sum of Numbers: " + sum);
    }
}
