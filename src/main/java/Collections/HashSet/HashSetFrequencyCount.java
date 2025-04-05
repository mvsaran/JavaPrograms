package src.main.java.Collections.HashSet;

import java.util.HashSet;
import java.util.Arrays;

public class HashSetFrequencyCount {
    public static void main(String[] args) {
        String str = "apple banana apple orange banana apple";
        String[] words = str.split(" ");

        HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        for (String word : uniqueWords) {
            long count = Arrays.stream(words).filter(w -> w.equals(word)).count();
            System.out.println(word + ": " + count);
        }
    }
}
