package Assignments.ClassObjectsConstructors;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    // Instance variables
    private String employeeId;
    private String name;
    private String department;
    private double salary;
    private String socialSecurityNumber;

    // Static variable to track total employees
    private static int totalEmployees = 0;

    // Constructor
    public Employee(String employeeId, String name, String department, double salary, String socialSecurityNumber) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
        totalEmployees++;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Masked SSN for privacy
    public String getMaskedSSN() {
        return "XXX-XX-" + socialSecurityNumber.substring(socialSecurityNumber.length() - 4);
    }

    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Display details
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", maskedSSN='" + getMaskedSSN() + '\'' +
                '}';
    }

    // Function to add employees and display
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees using constructor
        employees.add(new Employee("E001", "John Doe", "Engineering", 75000, "123-45-6789"));
        employees.add(new Employee("E002", "Jane Smith", "Marketing", 68000, "987-65-4321"));

        // Display all employees
        System.out.println("All Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Display total employees
        System.out.println("Total Employees: " + Employee.getTotalEmployees());
    }
}

