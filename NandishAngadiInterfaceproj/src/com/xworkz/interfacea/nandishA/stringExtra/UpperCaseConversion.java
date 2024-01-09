package com.xworkz.interfacea.nandishA.stringExtra;

public class UpperCaseConversion {
    public static void main(String[] args) {
        String str = "This is my string to convert to upper case";

        // Convert the string to upper case
        String upperCaseString = convertToUpperCase(str);

        // Display the converted string
        System.out.println("Original string: " + str);
        System.out.println("String in upper case: " + upperCaseString);
    }

    public static String convertToUpperCase(String str) {
        // Use the toUpperCase() method to convert the string to upper case
        String upperCaseString = str.toUpperCase();
        return upperCaseString;
    }
}
