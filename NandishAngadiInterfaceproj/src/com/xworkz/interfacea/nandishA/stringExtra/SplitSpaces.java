package com.xworkz.interfacea.nandishA.stringExtra;

import static com.xworkz.interfacea.nandishA.stringExtra.SplitBySpace.splitBySpace;

public class SplitSpaces {
    public static void main(String[] args) {
        String str = " This is my string to split by spaces";
        String [] parts = splitBySpace(str);

        System.out.println("Original string: "+str);
        System.out.println("String after split: ");

        for (int i=0; i< parts.length; i++){
            System.out.println(parts[i]);
        }
    }

    public static String[] splitBySpace(String str){
        String [] parts = str.split("\\s+");
        return  parts;
    }
}
