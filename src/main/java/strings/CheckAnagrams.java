package src.main.java.strings;

public class CheckAnagrams {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (str1.length() != str2.length()) {
            System.out.println("Are Anagrams: false");
            return;
        }
        int[] charCount = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i)]++;
            charCount[str2.charAt(i)]--;
        }
        boolean areAnagrams = true;
        for (int count : charCount) {
            if (count != 0) {
                areAnagrams = false;
                break;
            }
        }
        System.out.println("Are Anagrams: " + areAnagrams);
    }
}
