package com.xworkz.interfacea.nandishA.stringExtra;

public class CharFreq1 {
    public static void main(String[] args) {
        String str = "Vikramadithyan";
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);

    }
}
