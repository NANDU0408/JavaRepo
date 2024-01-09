package com.xworkz.interfacea.nandishA.boot;
import  java.util.*;
public class B2 {
    public static void pattern(int n) {
        int num = 1;
        int i, j;
        //Outer loop to handle upper part
        for (i = 1; i <= n; i++) {
            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //Inner loop to print spaces
            int spaces = 2 * (n - i);
            for (j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //Outer loop to handle lower part
        for (i = n; i >= 1; i--) {
            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //Inner loop to print spaces
            int spaces1 = 2 * (n - i);
            for (j = 1; j <= spaces1; j++) {
                System.out.print(" ");
            }

            //Inner loop to print stars
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=7;
        pattern(n);
    }
}



