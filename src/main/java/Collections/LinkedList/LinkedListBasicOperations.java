package src.main.java.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListBasicOperations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Initial List: " + list);

        list.addFirst("Mango");
        list.addLast("Orange");
        System.out.println("After adding elements: " + list);

        list.remove("Banana");
        System.out.println("After removing Banana: " + list);

        for (String item : list) {
            System.out.println("Item: " + item);
        }
    }
}
