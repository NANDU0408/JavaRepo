package com.xworkz.interfacea.nandishA.boot;
import java.util.*;
public class B8 {
    public static void pattern(int n){
        int num= 1;
        int i,j;
        for (i=1;i<=n;i++){
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
        }
        for (i=n;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            int spaces= 2*(n-i);
            for (j=1;j<=spaces;j++){
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
