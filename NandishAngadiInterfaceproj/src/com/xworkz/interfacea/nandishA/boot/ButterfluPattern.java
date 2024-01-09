package com.xworkz.interfacea.nandishA.boot;
import java.util.*;
public class ButterfluPattern {
public static void pattern(int n){
    int num = 1;
    //int i,j;
    //outer layer to handle pattern
    /*for(i=1;i<=n;i++){
        for (j=1;j<=i;j++){
            System.out.print("*");
        }
        //printing spaces
        int spaces=2*(n-i);
        for(j=1;j<=spaces;j++){
            System.out.print(" ");
        }

        for (j=1;j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }
    for (i=n;i>=1;i--){
        for (j=1;j<=i;j++){
            System.out.print("*");
        }
        int spaces=2*(n-i);
        for (j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for (j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }*/
}

    public static void main(String[] args) {
        int n=6;
        pattern(n);
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print(" * ");
                }
                else {
                   System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}



