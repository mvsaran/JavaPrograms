package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapNullKeysValues {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Adding null key and value
        map.put(null, "NullKey");
        map.put("Key", null);

        System.out.println(map);
    }
}
