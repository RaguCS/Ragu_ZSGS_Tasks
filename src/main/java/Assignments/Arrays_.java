package Assignments;

import java.util.Scanner;

public class Arrays_ {
//    Create a program that rotates the elements of an array to the right by a specified number of positions. Get the array and the rotation count from the user
    public void arrayRotation(){
        Scanner scanner = new Scanner(System.in);
        // Get array size from the user
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Get rotation count
        System.out.print("Enter the number of positions to rotate: ");
        int k = scanner.nextInt();

        // Perform rotation
        rotateArray(arr, k);

        // Print rotated array
        System.out.println("Rotated array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

//    Write a program to find transpose of a matrix
    public void trasposeMatrix(){
        Scanner scanner = new Scanner(System.in);

        // Get matrix dimensions from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] transpose = new int[cols][rows];

        // Input matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Compute the transpose
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

//    Write a program to implement matrix multiplication
    public void matrixMultiplication(){
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of the first matrix
        System.out.print("Enter the number of rows in first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns in first matrix: ");
        int cols1 = scanner.nextInt();

        // Get dimensions of the second matrix
        System.out.print("Enter the number of rows in second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns in second matrix: ");
        int cols2 = scanner.nextInt();

        // Check if multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Columns of first matrix must match rows of second matrix.");
            return;
        }

        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] result = new int[rows1][cols2];

        // Input first matrix
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result matrix
        System.out.println("Product of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

//    Write a program to generate the matrix with integers in spiral order. Get size N from the user and generate an NxN spiral matrix.
    public void generateSpiralMatrix(){
        Scanner scanner = new Scanner(System.in);

        // Get matrix size from the user
        System.out.print("Enter the size of the matrix (N): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        generateSpiralMatrix(matrix, n);

        // Print the spiral matrix
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static void generateSpiralMatrix(int[][] matrix, int n) {
        int num = 1, top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (num <= n * n) {
            // Move right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // Move down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Move left
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // Move up
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }
    }

    public void jaggedArray(){
        Scanner scanner = new Scanner(System.in);

        // Get number of persons
        System.out.print("Enter the number of persons (N): ");
        int n = scanner.nextInt();

        // Initialize a jagged array
        int[][] weights = new int[n][];

        // Get weights for each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number of weights for person " + (i + 1) + ": ");
            int numWeights = scanner.nextInt();
            weights[i] = new int[numWeights];

            System.out.println("Enter " + numWeights + " weights:");
            for (int j = 0; j < numWeights; j++) {
                weights[i][j] = scanner.nextInt();
            }
        }

        // Functionality to add a weight for any user at any time
        System.out.print("Enter the person index (0-based) to add a weight: ");
        int personIndex = scanner.nextInt();

        if (personIndex >= 0 && personIndex < n) {
            System.out.print("Enter the new weight: ");
            int newWeight = scanner.nextInt();
            weights[personIndex] = addWeight(weights[personIndex], newWeight);
        }

        // Functionality to get minimum weight of a person
        System.out.print("Enter the person index (0-based) to find minimum weight: ");
        int minPersonIndex = scanner.nextInt();

        if (minPersonIndex >= 0 && minPersonIndex < n) {
            System.out.println("Minimum weight of person " + (minPersonIndex + 1) + ": " + findMinWeight(weights[minPersonIndex]));
        }

        scanner.close();
    }

    public static int[] addWeight(int[] weights, int newWeight) {
        int[] newWeights = new int[weights.length + 1];
        System.arraycopy(weights, 0, newWeights, 0, weights.length);
        newWeights[weights.length] = newWeight;
        return newWeights;
    }

    public static int findMinWeight(int[] weights) {
        if (weights.length == 0) {
            return Integer.MAX_VALUE; // No weights available
        }
        int min = weights[0];
        for (int weight : weights) {
            if (weight < min) {
                min = weight;
            }
        }
        return min;
    }


}

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        ++birdsPerDay[birdsPerDay.length-1];
    }

    public boolean hasDayWithoutBirds() {
        for(int day:birdsPerDay){
            if(day==0)return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count=0;
        for(int i=0;i<numberOfDays&&i<birdsPerDay.length;i++){
            count+=birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count=0;
        for(int day:birdsPerDay){
            if(day>=5)
                count++;
        }
        return count;
    }
}
