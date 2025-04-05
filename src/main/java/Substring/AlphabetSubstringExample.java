package src.main.java.Substring;

public class AlphabetSubstringExample {
    public static void main(String[] args) {
        String alphabetString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int startIndex = 0;
        int endIndex = 5;

        // Extract substring
        String substring = alphabetString.substring(startIndex, endIndex);

        // Print the result
        System.out.println("Alphabet String: " + alphabetString);
        System.out.println("Substring (from index " + startIndex + " to " + endIndex + "): " + substring);
    }
}
