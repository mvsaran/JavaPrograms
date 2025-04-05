package src.main.java.Collections.HashSet;

import java.util.HashSet;

public class HashSetDifference {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        // Difference
        set1.removeAll(set2);

        System.out.println("Difference: " + set1);
    }
}
