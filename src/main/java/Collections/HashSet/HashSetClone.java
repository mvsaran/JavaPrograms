package src.main.java.Collections.HashSet;

import java.util.HashSet;

public class HashSetClone {
    public static void main(String[] args) {
        HashSet<String> original = new HashSet<>();
        original.add("A");
        original.add("B");

        // Cloning
        HashSet<String> clone = new HashSet<>(original);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}
