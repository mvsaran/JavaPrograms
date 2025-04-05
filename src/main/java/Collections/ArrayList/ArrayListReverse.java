package src.main.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Reverse the list
        Collections.reverse(list);

        System.out.println("Reversed: " + list);
    }
}
