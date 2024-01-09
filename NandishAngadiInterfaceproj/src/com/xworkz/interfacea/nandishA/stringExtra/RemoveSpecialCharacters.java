package com.xworkz.interfacea.nandishA.stringExtra;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "This -String @has $special characters &symbols!";

        // Remove special characters (excluding spaces)
        String cleanedString = removeSpecialChars(str);

        // Display the cleaned string
        System.out.println("Original string: " + str);
        System.out.println("String after removing special characters: " + cleanedString);
    }

    public static String removeSpecialChars(String str) {
        // Use regex to remove special characters except spaces
        String cleanedString = str.replaceAll("[^a-zA-Z0-9\\s]", "");
        return cleanedString;
    }
}
