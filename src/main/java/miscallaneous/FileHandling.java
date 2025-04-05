package src.main.java.miscallaneous;
import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String filePath = "example.txt";
        writeToFile(filePath, "Hello, File Handling!");
        readFromFile(filePath);
    }

    public static void writeToFile(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFromFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
