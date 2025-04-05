package src.main.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        // Convert to array
        String[] array = list.toArray(new String[0]);

        for (String item : array) {
            System.out.println(item);
        }
    }
}
