package src.main.java.strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Is Palindrome: " + isPalindrome);
    }
}
