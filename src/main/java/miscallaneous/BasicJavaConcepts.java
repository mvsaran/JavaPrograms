package src.main.java.miscallaneous;
// Removed unnecessary import

public class BasicJavaConcepts {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");

        // OOP Concepts
        Person person = new Person("John", 30);
        System.out.println(person.getDetails());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getDetails() {
        return "Name: " + name + ", Age: " + age;
    }
}
