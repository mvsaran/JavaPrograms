package src.main.java.Arrays;

public class SecondLargest {
    public static int secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99};
        int secondLargest = secondLargest(arr);
        System.out.println("Second Largest Element: " + secondLargest);
    }
}