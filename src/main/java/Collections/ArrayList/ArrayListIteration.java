package src.main.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");

        // Iterating using for-each loop
        for (String item : list) {
            System.out.println(item);
        }

        // Iterating using for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
