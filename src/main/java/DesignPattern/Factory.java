package src.main.java.DesignPattern;

// Product interface
interface Product {
    void display();
}

// Concrete Product A
class ProductA implements Product {
    @Override
    public void display() {
        System.out.println("Product A created.");
    }
}

// Concrete Product B
class ProductB implements Product {
    @Override
    public void display() {
        System.out.println("Product B created.");
    }
}

// Factory class
public class Factory {
    public static Product createProduct(String type) {
        if (type.equalsIgnoreCase("A")) {
            return new ProductA();
        } else if (type.equalsIgnoreCase("B")) {
            return new ProductB();
        }
        throw new IllegalArgumentException("Unknown product type: " + type);
    }
}
