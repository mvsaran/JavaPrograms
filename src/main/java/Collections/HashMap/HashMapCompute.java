package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapCompute {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);

        // Using compute
        map.compute("A", (key, value) -> value + 10);
        map.compute("B", (key, value) -> (value == null) ? 5 : value + 5);

        System.out.println(map);
    }
}
