package com.xworkz.interfacea.nandishA.exceptionH;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = { 1, 2, 3 };
            System.out.println("Trying to access an element outside the bounds of the array...");
            int value = numbers[5]; // Trying to access an element beyond the array size
            System.out.println("This line won't be printed due to the exception.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }

        // Rest of the code continues executing after handling the exception
        System.out.println("Program continues...");
    }
}