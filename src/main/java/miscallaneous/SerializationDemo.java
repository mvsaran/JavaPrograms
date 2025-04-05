package src.main.java.miscallaneous;

import java.io.*;

// A simple class implementing Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        String filePath = "person.ser";

        // Create a Person object
        Person person = new Person("John Doe", 30);

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(person);
            System.out.println("Serialization successful: " + person);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Deserialization successful: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
