package com.xworkz.nandish.lambdaComparator.dtoRunner;

import java.io.*;
import java.util.Scanner;

public class FileDataWriter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();
        
        while (true) {
            System.out.print("Enter the data to write (type 'stop' to exit): ");
            String dataToWrite = scanner.nextLine();

            if ("stop".equalsIgnoreCase(dataToWrite)) {
                System.out.println("Stopping input. Writing and reading from the file.");
                break;
            }

            writeToFile(fileName, dataToWrite);
        }

        scanner.close();
        readFromFile(fileName);
    }

    public static void writeToFile(String fileName, String data) {
        try (PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)))) {
            // Append data to the file
            writer.println(data);
            System.out.println("Data written successfully to " + fileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            System.out.println("Reading data from " + fileName + ":");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
}