package com.xworkz.interfacea.nandishA.stringExtra;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "This is my string with spaces";
        String stringWithoutSpaces = removeSpaces(str);

        System.out.println("Original string: " + str);
        System.out.println("String without spaces: " + stringWithoutSpaces);
    }

    public static String removeSpaces(String str) {
        // Use replaceAll() method to replace all spaces with an empty string
        String stringWithoutSpaces = str.replaceAll("\\s", "");
        return stringWithoutSpaces;
    }
}
