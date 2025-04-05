package src.main.java.Collections.HashMap;

import java.util.*;

public class HashMapSorting {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Zebra", 3);
        map.put("Apple", 1);
        map.put("Mango", 2);

        // Sorting by keys
        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
