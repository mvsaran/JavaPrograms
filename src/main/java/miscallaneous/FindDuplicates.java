package src.main.java.miscallaneous;
import java.util.HashMap;

public class FindDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        HashMap<Character, Integer> charCount = new HashMap<>();
        
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Duplicate Characters:");
        charCount.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + ": " + value);
            }
        });
    }
}
