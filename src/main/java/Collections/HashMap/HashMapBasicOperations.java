package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapBasicOperations {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Adding elements
        map.put("Apple", 3);
        map.put("Banana", 5);
        map.put("Cherry", 7);

        // Accessing elements
        System.out.println("Value for Apple: " + map.get("Apple"));

        // Removing an element
        map.remove("Banana");

        // Iterating over the map
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
