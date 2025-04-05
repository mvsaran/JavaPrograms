package src.main.java.Substring;

public class SubstringExample {
    public static void main(String[] args) {
        String originalString = "Hello, Java Programming!";
        int startIndex = 7;
        int endIndex = 11;

        // Extract substring
        String substring = originalString.substring(startIndex, endIndex);

        // Print the result
        System.out.println("Original String: " + originalString);
        System.out.println("Substring (from index " + startIndex + " to " + endIndex + "): " + substring);
    }
}
