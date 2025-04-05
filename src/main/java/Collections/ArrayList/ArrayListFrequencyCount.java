package src.main.java.Collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFrequencyCount {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        // Count frequency
        System.out.println("Frequency of Apple: " + Collections.frequency(list, "Apple"));
    }
}
