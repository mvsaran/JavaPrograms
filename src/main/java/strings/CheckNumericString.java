package src.main.java.strings;

public class CheckNumericString {
    public static void main(String[] args) {
        String str = "12345";
        boolean isNumeric = true;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                isNumeric = false;
                break;
            }
        }
        System.out.println("Contains Only Digits: " + isNumeric);
    }
}
