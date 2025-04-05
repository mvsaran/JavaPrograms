package src.main.java.Arrays;

public class CountFrequency {
    public static void countFrequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                        count++;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        int[] sampleArray = {1, 2, 2, 3, 1, 4, 1};
        countFrequency(sampleArray);
    }
}