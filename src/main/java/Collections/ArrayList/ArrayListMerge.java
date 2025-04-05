package src.main.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListMerge {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("C");
        list2.add("D");

        // Merge lists
        list1.addAll(list2);

        System.out.println("Merged List: " + list1);
    }
}
