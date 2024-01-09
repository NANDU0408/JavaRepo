package com.xworkz.interfacea.nandishA.stringExtra;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String str = "Jambhavanth";
        findDuplicateChars(str);
    }

    public static void findDuplicateChars(String str) {
        char[] characters = str.toCharArray();//Converts the input string str into an array of characters named characters.

        System.out.println("Duplicate characters in the string '" + str + "':");

        // Iterate through each character in the string
        for (int i = 0; i < characters.length; i++) {
            char currentChar = characters[i];

            // Skip counting if the character is already checked
            if (currentChar == '\0') {
                continue;
            }

            int count = 1;

            // Compare current character with rest of the characters
            for (int j = i + 1; j < characters.length; j++) {
                if (currentChar == characters[j]) {
                    count++;
                    // Replace duplicate characters with null character '\0'
                    characters[j] = '\0';
                }
            }

            // Display the duplicate character and its count
            if (count > 1) {
                System.out.println("'" + currentChar + "' - " + count + " times");
            }
        }
    }
}
