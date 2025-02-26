package Assignments;

import java.util.Scanner;

public class ConditionalAndUnconditional {
//    Conditional
    public void greatestNumber(){
        Scanner scanner = new Scanner(System.in);

        // Taking three numbers as input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        // Finding the greatest number using if-else statements
        int greatest;
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }

        // Displaying the result
        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }
    public void gradeCalculate(){
        Scanner scanner = new Scanner(System.in);

        // Taking student score as input
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        // Validate score input range
        if (score < 0 || score > 100) {
            System.out.println("Invalid score! Please enter a value between 0 and 100.");
        } else {
            // Determine the grade using if-else statements
            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }

            // Display the grade
            System.out.println("The student's grade is: " + grade);
        }

        scanner.close();
    }
    public void multiplicationOfNumber(){
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number + ":\n");

        // Printing the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %3d\n", number, i, (number * i));
        }

        scanner.close();
    }
//    UnConditional
    public void secondOccurrenceOfNumber(){
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Taking array elements input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Taking the target number input
        System.out.print("Enter the number to find its second occurrence: ");
        int target = scanner.nextInt();

        // Finding the second occurrence
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {
                count++;
                if (count == 2) {
                    System.out.println("Second occurrence found at index: " + i);
                    scanner.close();
                    return;
                }
            }
        }

        // If second occurrence is not found
        System.out.println("Second occurrence not found.");
        scanner.close();
    }
    public void printPrime1to30(){
        System.out.println("Prime numbers between 1 to 30:");

        for (int num = 2; num <= 30; num++) {
            boolean isPrime = true;

            // Check divisibility
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print prime numbers
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
    public void sumOfEvenNumbers(){
        Scanner scanner = new Scanner(System.in);

        // Taking array size input
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        // Taking array elements input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculating sum of even numbers
        int sum = 0;
        for (int num : array) {
            if (num % 2 != 0) {
                continue; // Skip odd numbers
            }
            sum += num;
        }

        // Display result
        System.out.println("Sum of even numbers: " + sum);
        scanner.close();
    }

}
