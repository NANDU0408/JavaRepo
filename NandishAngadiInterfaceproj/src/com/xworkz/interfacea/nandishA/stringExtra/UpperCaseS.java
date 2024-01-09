package com.xworkz.interfacea.nandishA.stringExtra;

import static com.xworkz.interfacea.nandishA.stringExtra.UpperCaseConversion.convertToUpperCase;

public class UpperCaseS {
    public static void main(String[] args) {
        String str = " This is my string with sentenceCase";

        String  upperCaseString = convertToUpperCase(str);

        System.out.println("Original String: "+str);
        System.out.println("The string after conversion to upperCase: " +upperCaseString);
    }

    public static String convertToUpperCase(String str){
        String upperCaseString = str.toUpperCase();
        return upperCaseString;
    }
}
