package com.xworkz.interfacea.nandishA.stringExtra;

import static com.xworkz.interfacea.nandishA.stringExtra.CharacterFrequency.findCharFrequency;

public class CharFreq {
    public static void main(String[] args) {
        String str = "Vikramadithyan";
        char targetChar = 'a';


      int frequency = findCharFrequency(str, targetChar);
        System.out.println("The frequency of '"+targetChar+ "' in the string '" +str+ "' is "+frequency);
    }

    public static int findCharFrequency(String str, char targetChar){
        int frequency = 0;

        char [] characters = str.toCharArray();
        for (int i= 0; i< characters.length; i++){
            if (characters[i]==targetChar){
                frequency++;
            }
        }
        return frequency;
    }
}
