package src.main.java.miscallaneous;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        String input = "hello world";
        int vowels = 0, consonants = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if ("aeiou".indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}
