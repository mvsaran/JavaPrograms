package src.main.java.Collections.HashSet;

import java.util.HashSet;

public class HashSetIteration {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("X");
        set.add("Y");
        set.add("Z");

        // Iterating using for-each loop
        for (String item : set) {
            System.out.println(item);
        }
    }
}
