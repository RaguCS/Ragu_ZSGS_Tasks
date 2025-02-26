package Assignments;

import java.util.Scanner;
class A{

}
class B{

}
class C{

}
public class DataTypes {
    public void conversions(){
        // 1. float to int (explicit narrowing conversion)
        float floatVal = 10.75f;
        int intVal = (int) floatVal; // Explicit cast needed
        System.out.println("Float to Int: " + floatVal + " -> " + intVal);

        // 2. double to float (explicit narrowing conversion)
        double doubleVal = 25.987654;
        float floatFromDouble = (float) doubleVal; // Explicit cast needed
        System.out.println("Double to Float: " + doubleVal + " -> " + floatFromDouble);

        // 3. int to short (explicit narrowing conversion)
        int largeInt = 150;
        short shortVal = (short) largeInt; // Explicit cast needed
        System.out.println("Int to Short: " + largeInt + " -> " + shortVal);

        // 4. int to double (implicit widening conversion)
        int smallInt = 42;
        double doubleFromInt = smallInt; // No explicit cast needed
        System.out.println("Int to Double: " + smallInt + " -> " + doubleFromInt);

        // 5. char to int (implicit widening conversion)
        char charVal = 'A'; // ASCII value of 'A' is 65
        int intFromChar = charVal; // No explicit cast needed
        System.out.println("Char to Int: " + charVal + " -> " + intFromChar);
    }
    public void Swaping(){
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);

        scanner.close();

        int a = 10, b = 20;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap without temp variable using addition and subtraction
        a = a + b; // a = 10 + 20 = 30
        b = a - b; // b = 30 - 20 = 10
        a = a - b; // a = 30 - 10 = 20

        System.out.println("After swapping: a = " + a + ", b = " + b);

        int x = 5, y = 8;

        System.out.println("Before swapping: x = " + x + ", y = " + y);

        // Swap using XOR
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println("After swapping: x = " + x + ", y = " + y);

    }
    public void displayDay(){
        enum Weekday {
            SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
        }
                Scanner scanner = new Scanner(System.in);

                // Prompt user for input
                System.out.print("Enter a number (1-7) to get the weekday: ");
                int dayNumber = scanner.nextInt();

                // Validate input
                if (dayNumber < 1 || dayNumber > 7) {
                    System.out.println("Invalid input! Please enter a number between 1 and 7.");
                } else {
                    // Convert the input number to an enum value
                    Weekday day = Weekday.values()[dayNumber - 1];
                    System.out.println("The day is: " + day);
                }

                scanner.close();
    }
    public void averageWeight(){
        final int NUMBER_OF_PEOPLE = 10; // Constant for number of people
        double totalWeight = 0.0; // Variable to store the sum of all weights
        double averageWeight; // Variable to store the calculated average weight

        Scanner scanner = new Scanner(System.in);

        // Loop to get weights from the user
        for (int personIndex = 1; personIndex <= NUMBER_OF_PEOPLE; personIndex++) {
            System.out.print("Enter weight for person " + personIndex + " (in kg): ");
            double personWeight = scanner.nextDouble(); // Read weight input
            totalWeight += personWeight; // Add weight to total
        }

        // Calculate average weight
        averageWeight = totalWeight / NUMBER_OF_PEOPLE;

        // Display the result
        System.out.printf("The average weight of %d people is: %.2f kg\n", NUMBER_OF_PEOPLE, averageWeight);

        scanner.close();
    }


}



