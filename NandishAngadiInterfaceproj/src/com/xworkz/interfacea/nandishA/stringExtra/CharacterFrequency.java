package com.xworkz.interfacea.nandishA.stringExtra;

public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "Vikramadithyan";
        char targetChar = 'a';

        int frequency = findCharFrequency(str, targetChar);

        System.out.println("The frequency of '" + targetChar + "' in the string '" + str + "' is: " + frequency);
    }

    public static int findCharFrequency(String str, char targetChar) {
        int frequency = 0;

        // Convert the string to a character array
        char[] characters = str.toCharArray();

        // Iterate through the character array using a traditional for loop
        for (int i = 0; i < characters.length; i++) {
            // Check if the current character matches the target character
            if (characters[i] == targetChar) {
                frequency++; // Increment frequency if the characters match
            }
        }

        return frequency;
    }
}
