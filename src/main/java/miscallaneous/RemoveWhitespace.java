package src.main.java.miscallaneous;
public class RemoveWhitespace {
    public static void main(String[] args) {
        String input = "Java Programming";
        String result = input.replaceAll("\\s", "");
        System.out.println("String without whitespace: " + result);
    }
}
