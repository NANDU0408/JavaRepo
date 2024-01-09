package com.xworkz.interfacea.nandishA.stringExtra;

public class CapitalLettersFinder {
    public static void main(String[] args) {
        String inputString = "This String contains SOME Capital LETTERS.";

        // Find and print all capital letters in the string
        System.out.println("Capital letters in the string:");
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println(ch);
            }
        }
    }
}
