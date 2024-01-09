package com.xworkz.interfacea.nandishA.stringExtra;

public class StringReversal {
    public static void main(String[] args) {
        String inputString = "X-Workz";

        // Reversing the string
        String reversedString = reverseString(inputString);

        // Output the reversed string
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);
    }

    // Function to reverse the string
    private static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }
}
