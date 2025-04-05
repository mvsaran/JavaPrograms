package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapClone {
    public static void main(String[] args) {
        HashMap<String, Integer> original = new HashMap<>();
        original.put("X", 10);
        original.put("Y", 20);

        // Cloning
        HashMap<String, Integer> clone = new HashMap<>(original);

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}
