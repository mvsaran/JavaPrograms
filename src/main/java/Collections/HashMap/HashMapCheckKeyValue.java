package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapCheckKeyValue {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Dog", 1);
        map.put("Cat", 2);

        // Check if key exists
        System.out.println("Contains key 'Dog': " + map.containsKey("Dog"));

        // Check if value exists
        System.out.println("Contains value 2: " + map.containsValue(2));
    }
}
