package com.xworkz.interfacea.nandishA.stringExtra;

public class NumberChecker {
    public static void main(String[] args) {
        String inputString = "This string contains 123 and some text.";

        // Check if the string contains a number using regular expression
        boolean containsNumber = containsNumber(inputString);

        if (containsNumber) {
            System.out.println("The string contains a number.");
        } else {
            System.out.println("The string does not contain a number.");
        }
    }

    // Function to check if the string contains a number using regular expression
    private static boolean containsNumber(String input) {
        return input.matches(".*\\d+.*");
    }
}
