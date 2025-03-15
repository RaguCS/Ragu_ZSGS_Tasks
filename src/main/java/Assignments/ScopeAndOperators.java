package Assignments;

import java.util.Scanner;

public class ScopeAndOperators {
    public void CelsiusToFahrenheit(){
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsiusTemperature = scanner.nextDouble(); // Use double for precision

        // Convert Celsius to Fahrenheit using the formula: F = (C × 9/5) + 32
        double fahrenheitTemperature = (celsiusTemperature * 9.0 / 5.0) + 32.0;

        // Display the result with 2 decimal places
        System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheitTemperature);

        // Close the scanner
        scanner.close();
    }
    public void quadraticEquation(){
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (b^2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        System.out.println("\nSolving the equation: " + a + "x² + " + b + "x + " + c + " = 0");

        // Check discriminant to determine the nature of roots
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.printf("Roots are real and distinct: x1 = %.2f, x2 = %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            // One real and repeated root
            double root = -b / (2 * a);
            System.out.printf("Roots are real and equal: x = %.2f\n", root);
        } else {
            // Complex (imaginary) roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.printf("Roots are complex: x1 = %.2f + %.2fi, x2 = %.2f - %.2fi\n",
                    realPart, imaginaryPart, realPart, imaginaryPart);
        }

        scanner.close();
    }

    public void bitwiseOperator(){
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Performing bitwise operations
        int andResult = num1 & num2;  // Bitwise AND
        int orResult = num1 | num2;   // Bitwise OR
        int xorResult = num1 ^ num2;  // Bitwise XOR
        int leftShiftNum1 = num1 << 1;  // Left shift num1 by 1
        int rightShiftNum1 = num1 >> 1; // Right shift num1 by 1
        int leftShiftNum2 = num2 << 1;  // Left shift num2 by 1
        int rightShiftNum2 = num2 >> 1; // Right shift num2 by 1

        // Displaying the results
        System.out.println("\nBitwise Operations Results:");
        System.out.println(num1 + " & " + num2 + " = " + andResult);
        System.out.println(num1 + " | " + num2 + " = " + orResult);
        System.out.println(num1 + " ^ " + num2 + " = " + xorResult);
        System.out.println(num1 + " << 1 = " + leftShiftNum1);
        System.out.println(num1 + " >> 1 = " + rightShiftNum1);
        System.out.println(num2 + " << 1 = " + leftShiftNum2);
        System.out.println(num2 + " >> 1 = " + rightShiftNum2);

        scanner.close();
    }
    public void variableScope(){
        int outsideIfVariable = 10; // Variable declared outside the if block (accessible everywhere in method)

        if (outsideIfVariable > 5) {
            int insideIfVariable = 20; // Variable declared inside the if block (accessible only within this block)
            System.out.println("Inside if block:");
            System.out.println("outsideIfVariable = " + outsideIfVariable); // Accessible
            System.out.println("insideIfVariable = " + insideIfVariable);   // Accessible
        }

        System.out.println("\nOutside if block:");
        System.out.println("outsideIfVariable = " + outsideIfVariable); // Accessible

        // The following line will cause a compilation error because insideIfVariable is not accessible outside the if block.
        // System.out.println("insideIfVariable = " + insideIfVariable); // ERROR: Cannot find symbol

    }

}
