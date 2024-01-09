package com.xworkz.interfacea.nandishA.stringExtra;

public class CamelCaseConverter {
    public static void main(String[] args) {
        String inputString = "convert this string to camel case";

        // Convert the string to camel case
        String camelCaseString = toCamelCase(inputString);

        // Output the camel case string
        System.out.println("Original String: " + inputString);
        System.out.println("Camel Case String: " + camelCaseString);
    }

    // Function to convert string to camel case
    private static String toCamelCase(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                result.append(word.toLowerCase());
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase());
            }
        }
        return result.toString();
    }
}
