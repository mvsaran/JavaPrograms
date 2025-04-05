package src.main.java.Arrays;

public class SearchElement {
    public static boolean searchElement(int[] arr, int key) {
        for (int num : arr) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;
        boolean found = searchElement(arr, key);
        System.out.println("Element " + key + (found ? " is found." : " is not found."));
    }
}