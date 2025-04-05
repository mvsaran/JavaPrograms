package src.main.java.strings;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        char firstNonRepeating = ' ';
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeating = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                firstNonRepeating = str.charAt(i);
                break;
            }
        }
        System.out.println("First Non-Repeating Character: " + firstNonRepeating);
    }
}
