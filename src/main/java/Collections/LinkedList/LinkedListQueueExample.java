package src.main.java.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListQueueExample {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");

        System.out.println("Initial Queue: " + queue);

        while (!queue.isEmpty()) {
            System.out.println("Processing: " + queue.poll());
        }
    }
}
