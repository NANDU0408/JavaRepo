package com.xworkz.interfacea.nandishA.boot;
import java.util.*;
public class B4 {
    public static void pattern(int n){
        int num=1;
        int i,j;
        //outer loop to handle upper part
        for (i=1;i<=n;i++){
            //inner loop to print stars
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            //to print spaces
            int spaces=2*(n-i);
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop to handle lower part
        for (i=n;i>=1;i--){
            //inner loop to print stars
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            //for spaces
            int spaces=2*(n-i);
            for(j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=6;
        pattern(n);
    }
}
