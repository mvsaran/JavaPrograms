package src.main.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListSearch {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Searching for an element
        System.out.println("Contains Banana: " + list.contains("Banana"));
    }
}
