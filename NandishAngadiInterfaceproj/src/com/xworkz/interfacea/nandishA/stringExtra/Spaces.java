package com.xworkz.interfacea.nandishA.stringExtra;

import static com.xworkz.interfacea.nandishA.stringExtra.RemoveSpaces.removeSpaces;

public class Spaces {
    public static void main(String[] args) {
        String str = "This is my string with spaces";

        String stringWithoutSpaces = removeSpaces(str);

        System.out.println("Original String: "+str);
        System.out.println("String without spaces: "+stringWithoutSpaces);
    }

    public static String removeSpaces(String str){
        String stringWithoutSpace=  str.replaceAll("\\s","");
        return  stringWithoutSpace;
    }
}
