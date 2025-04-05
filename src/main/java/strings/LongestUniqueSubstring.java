package src.main.java.strings;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int maxLength = 0;
        String longestSubstring = "";
        for (int i = 0; i < str.length(); i++) {
            String temp = "";
            for (int j = i; j < str.length(); j++) {
                if (temp.indexOf(str.charAt(j)) != -1) break;
                temp += str.charAt(j);
            }
            if (temp.length() > maxLength) {
                maxLength = temp.length();
                longestSubstring = temp;
            }
        }
        System.out.println("Longest Substring Without Repeating Characters: " + longestSubstring);
    }
}
