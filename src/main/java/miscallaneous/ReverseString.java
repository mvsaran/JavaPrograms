package src.main.java.miscallaneous;
public class ReverseString {
    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);
        System.out.println("Reversed String: " + reversed);
    }

    private static String reverseString(String input) {
        char[] chars = input.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }
        return reversed.toString();
    }
}
