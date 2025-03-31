package Assignments.methodOverloading;

public class PersonMain {
    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob", 25);
        Person person3 = new Person("Charlie", 30, "New York");

        person1.display();
        person2.display();
        person3.display();
    }
}
class Person {
    String name;
    int age;
    String address;


    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    void display() {
        System.out.println("Name: " + name);
        if (age != 0) System.out.println("Age: " + age);
        if (address != null) System.out.println("Address: " + address);
        System.out.println();
    }
}
