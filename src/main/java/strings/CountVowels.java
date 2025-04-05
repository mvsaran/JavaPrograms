package src.main.java.strings;

public class CountVowels {
    public static void main(String[] args) {
        String str = "Programming";
        int vowelCount = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Number of Vowels: " + vowelCount);
    }
}
