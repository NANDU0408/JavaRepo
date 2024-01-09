package com.xworkz.interfacea.nandishA.stringExtra;

public class AlternateCaseConverter {
    public static void main(String[] args) {
        String inputString = "Convert This To AlTeRnAtE CaSe";

        // Convert alternate letters to lowercase
        String alternateLowerCase = convertAlternateCase(inputString);

        // Output the string with alternate letters in lowercase
        System.out.println("Original String: " + inputString);
        System.out.println("Alternate Letters in Lowercase: " + alternateLowerCase);
    }

    // Function to convert alternate letters to lowercase
    private static String convertAlternateCase(String input) {
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 1) { // Check if index is odd (alternate letters)
                chars[i] = Character.toLowerCase(chars[i]);
            }
        }

        return new String(chars);
    }
}
