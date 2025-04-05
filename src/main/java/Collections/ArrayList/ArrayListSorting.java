package src.main.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);

        // Sorting in ascending order
        Collections.sort(list);
        System.out.println("Ascending: " + list);

        // Sorting in descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending: " + list);
    }
}
