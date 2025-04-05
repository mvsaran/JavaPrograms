package src.main.java.Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListClone {
    public static void main(String[] args) {
        ArrayList<String> original = new ArrayList<>();
        original.add("A");
        original.add("B");

        // Cloning
        @SuppressWarnings("unchecked")
        ArrayList<String> clone = (ArrayList<String>) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);
    }
}
