package src.main.java.Arrays;

public class RemoveDuplicates {
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (arr[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = arr[i];
            }
        }
        int[] result = new int[j];
        System.arraycopy(temp, 0, result, 0, j);
        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(inputArray);
        System.out.print("Array after removing duplicates: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}