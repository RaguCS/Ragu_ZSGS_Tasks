package Assignments.inheritance;

public class StudentMain {
    public static void main(String[] args) {
        ZSGSStudent student = new ZSGSStudent();
        LStudent student1 = new ZSGSStudent("ragu",23,"chennai",2024,"B.E");
        LStudent student2 = new ZSGSStudent();
    }
}
class Student{
    String name;
    int age;
    String address;
    public Student(){
        System.out.println("Student Parent class Default Constructor");
    }
    public Student(String name, int age, String address) {
        System.out.println("Student Parent class parameterized constructor");
        this.name = name;
        this.age = age;
        this.address = address;
    }

}
class ZSGSStudent extends LStudent {
    int batch;
    String qualification;
    public ZSGSStudent(){
        super();
        System.out.println("ZSGSStudent Child class Default Constructor");
    }
    public ZSGSStudent(String name, int age, String address, int batch, String qualification) {
        super(name,age,address);
        System.out.println("ZSGSStudent Child class parameterized constructor");
        this.batch = batch;
        this.qualification = qualification;
    }
}
