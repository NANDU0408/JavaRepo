package com.xworkz.interfacea.nandishA.exceptionH;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int result = divide(10, 2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}


/*import java.io.*;

public class TryFinallyExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error occurred while closing the reader: " + e.getMessage());
            }
        }
    }
}*/

