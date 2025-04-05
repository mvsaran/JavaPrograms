package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapMerge {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        // Merging maps
        map2.forEach((key, value) -> map1.merge(key, value, Integer::sum));

        System.out.println(map1);
    }
}
