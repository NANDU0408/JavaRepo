package com.xworkz.interfacea.nandishA.stringExtra;

import static com.xworkz.interfacea.nandishA.stringExtra.duplicateChar.findDuplicateChar;

public class DuplicateChar1 {
    public static void main(String[] args) {
        String str = "Jambhavanth";
        findDuplicateChar(str);
    }
    public static void findDuplicateChar(String str){
        char[] characters = str.toCharArray();
        System.out.println("The duplicate chars in a string:"+str+":");

        for (int i=0;i< characters.length;i++){
            char currentChar = characters[i];
            if(currentChar=='\0'){
                continue;
            }
            int count = 1;

            for (int j=i+1;j<characters.length;j++){
                if (currentChar== characters[j]){
                    count++;

                    characters[j]='\0';
                }
            }

            if (count>1){
                System.out.println("'"+currentChar+"-"+count+"times");
            }
        }
    }
}
