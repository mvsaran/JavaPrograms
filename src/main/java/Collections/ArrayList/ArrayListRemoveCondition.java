package src.main.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListRemoveCondition {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        // Remove elements greater than 15
        list.removeIf(value -> value > 15);

        System.out.println(list);
    }
}
