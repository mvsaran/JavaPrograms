package src.main.java.strings;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "programming";
        String withoutDuplicates = "";
        for (int i = 0; i < str.length(); i++) {
            if (withoutDuplicates.indexOf(str.charAt(i)) == -1) {
                withoutDuplicates += str.charAt(i);
            }
        }
        System.out.println("String Without Duplicates: " + withoutDuplicates);
    }
}
