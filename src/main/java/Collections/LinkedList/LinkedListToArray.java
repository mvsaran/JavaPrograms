package src.main.java.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        System.out.println("LinkedList: " + list);

        String[] array = list.toArray(new String[0]);
        System.out.println("Array: ");
        for (String color : array) {
            System.out.println(color);
        }
    }
}
