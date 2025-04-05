// Removed package declaration to match the default package

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Handling unchecked exception (ArithmeticException)
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        // Handling checked exception (IOException)
        try {
            readFile("nonexistentfile.txt");
        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read.");
        }

        System.out.println("Program continues after exception handling.");
    }

    // Method to demonstrate unchecked exception
    public static int divide(int a, int b) {
        return a / b; // May throw ArithmeticException
    }

    // Method to demonstrate checked exception
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}