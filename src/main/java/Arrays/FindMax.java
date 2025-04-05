package src.main.java.Arrays;

public class FindMax {
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] sampleArray = {3, 5, 7, 2, 8};
        int max = findMax(sampleArray);
        System.out.println("The maximum value in the array is: " + max);
    }
}