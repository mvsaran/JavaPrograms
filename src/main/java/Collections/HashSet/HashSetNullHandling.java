package src.main.java.Collections.HashSet;

import java.util.HashSet;

public class HashSetNullHandling {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding null value
        set.add(null);
        set.add("A");

        System.out.println(set);
    }
}
