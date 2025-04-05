package src.main.java.strings;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String str = "banana";
        boolean[] visited = new boolean[256]; // ASCII character set size

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (!visited[currentChar]) {
                visited[currentChar] = true;
                int count = 0;

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == currentChar) {
                        count++;
                    }
                }

                System.out.println(currentChar + ": " + count);
            }
        }
    }
}
