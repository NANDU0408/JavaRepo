package com.xworkz.interfacea.nandishA.exceptionH;

public class TryFinally {
    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}