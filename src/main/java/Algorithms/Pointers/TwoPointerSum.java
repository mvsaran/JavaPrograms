package src.main.java.Algorithms.Pointers;

import java.util.Arrays;

public class TwoPointerSum {
    public static boolean hasPairWithSum(int[] arr, int target) {
        Arrays.sort(arr); // Ensure the array is sorted
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;

        boolean result = hasPairWithSum(arr, target);
        if (result) {
            System.out.println("Array has a pair with the sum " + target);
        } else {
            System.out.println("No pair with the sum " + target + " found in the array");
        }
    }
}
