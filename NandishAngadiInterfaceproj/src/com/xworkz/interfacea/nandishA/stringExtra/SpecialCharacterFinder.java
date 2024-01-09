package com.xworkz.interfacea.nandishA.stringExtra;

public class SpecialCharacterFinder {
    public static void main(String[] args) {
        String inputString = "This string contains @ and $ special characters!";

        // Find special characters using a for loop
        System.out.println("Special characters in the string:");
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.println(ch);
            }
        }
    }
}
