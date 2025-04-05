package src.main.java.Collections.HashSet;

import java.util.HashSet;

public class HashSetSubset {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        // Check subset
        System.out.println("Is set1 a subset of set2? " + set2.containsAll(set1));
    }
}
