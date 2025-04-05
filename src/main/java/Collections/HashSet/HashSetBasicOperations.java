package src.main.java.Collections.HashSet;

import java.util.HashSet;

public class HashSetBasicOperations {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Removing an element
        set.remove("Banana");

        // Iterating over the set
        for (String item : set) {
            System.out.println(item);
        }

        // Checking if an element exists
        System.out.println("Contains Apple: " + set.contains("Apple"));
    }
}
