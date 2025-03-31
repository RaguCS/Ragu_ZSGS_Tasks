package Assignments.methodOverriding;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new HourlyEmployee("Alice", 101, 20.5);
        Employee emp2 = new SalariedEmployee("Bob", 102, 50000);
        emp1.getEmployeeDetails();
        emp2.getEmployeeDetails();
    }
}
class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void getEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class HourlyEmployee extends Employee {
    double hourlyRate;

    HourlyEmployee(String name, int id, double hourlyRate) {
        super(name, id);
        this.hourlyRate = hourlyRate;
    }

    @Override
    void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Hourly Rate: " + hourlyRate);
    }
}

class SalariedEmployee extends Employee {
    double salary;

    SalariedEmployee(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    void getEmployeeDetails() {
        super.getEmployeeDetails();
        System.out.println("Salary: " + salary);
    }
}
