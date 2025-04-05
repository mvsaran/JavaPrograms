package src.main.java.Collections.LinkedList;

import java.util.LinkedList;

public class LinkedListStackExample {
    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        stack.push("Page1");
        stack.push("Page2");
        stack.push("Page3");

        System.out.println("Initial Stack: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
