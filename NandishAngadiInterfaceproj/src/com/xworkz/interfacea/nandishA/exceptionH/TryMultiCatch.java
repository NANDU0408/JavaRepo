package com.xworkz.interfacea.nandishA.exceptionH;

public class TryMultiCatch {
    public static void main(String[] args) {
        try {
            // Simulating an operation that might throw different exceptions
            int[] numbers = { 1, 2, 3 };
            System.out.println("Trying to perform an operation that might throw exceptions...");
            int result = divideByZero(numbers); // Method that might throw exceptions
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            // Handling multiple exceptions in a single catch block
            System.out.println("An exception occurred: " + e.getMessage());
        }

        // Rest of the code continues executing after handling the exception
        System.out.println("Program continues...");
    }

    public static int divideByZero(int[] numbers) {
        // Division by zero or accessing an array element outside the bounds might occur here
        return numbers[5] / 0;
    }
}
