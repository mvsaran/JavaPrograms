package src.main.java.Collections.HashMap;

import java.util.HashMap;

public class HashMapFrequencyCount {
    public static void main(String[] args) {
        String str = "hello world";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        System.out.println(frequencyMap);
    }
}
