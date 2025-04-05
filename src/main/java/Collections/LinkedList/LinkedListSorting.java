package src.main.java.Collections.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListSorting {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);

        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
