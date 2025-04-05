package src.main.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListBasicOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Removing an element
        list.remove("Banana");

        // Iterating over the list
        for (String item : list) {
            System.out.println(item);
        }

        // Accessing an element
        System.out.println("First element: " + list.get(0));
    }
}
