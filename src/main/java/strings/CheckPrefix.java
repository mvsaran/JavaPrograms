package src.main.java.strings;

public class CheckPrefix {
    public static void main(String[] args) {
        String str = "JavaProgramming";
        String prefix = "Java";
        boolean startsWithPrefix = true;
        if (prefix.length() > str.length()) {
            startsWithPrefix = false;
        } else {
            for (int i = 0; i < prefix.length(); i++) {
                if (str.charAt(i) != prefix.charAt(i)) {
                    startsWithPrefix = false;
                    break;
                }
            }
        }
        System.out.println("Starts With Prefix: " + startsWithPrefix);
    }
}
