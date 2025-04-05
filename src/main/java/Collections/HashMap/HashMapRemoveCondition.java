package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapRemoveCondition {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);

        // Remove if value is greater than 15
        map.entrySet().removeIf(entry -> entry.getValue() > 15);

        System.out.println(map);
    }
}
