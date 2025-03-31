package Assignments.methodOverloading;

public class MathOperations {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }

    int subtract(int a, int b) { return a - b; }
    double subtract(double a, double b) { return a - b; }

    int multiply(int a, int b) { return a * b; }
    double multiply(double a, double b) { return a * b; }

    int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Division by zero is not allowed");
        return a / b;
    }
    double divide(double a, double b) {
        if (b == 0.0) throw new ArithmeticException("Division by zero is not allowed");
        return a / b;
    }

    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println("Addition (int): " + math.add(5, 3));
        System.out.println("Addition (double): " + math.add(5.5, 3.2));
        System.out.println("Subtraction (int): " + math.subtract(10, 4));
        System.out.println("Multiplication (double): " + math.multiply(2.5, 4.0));
        System.out.println("Division (int): " + math.divide(10, 2));
    }
}
