package src.main.java.DesignPattern;

public class Singleton {
    // Static instance of the Singleton class
    private static Singleton instance;

    // Private constructor to prevent instantiation
    private Singleton() {
        // ...existing code...
    }

    // Public method to provide access to the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
