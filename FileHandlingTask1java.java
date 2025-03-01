package com.codetechproject;

import java.io.*;
import java.util.Scanner;

/**
 * CodTech File Handling Task
 * This program demonstrates reading, writing, and modifying a text file in Java.
 * Operations:
 * 1. Write new content to a file.
 * 2. Read content from a file.
 * 3. Modify (Update) the file by replacing text.
 */
public class FileHandlingTask1java{
    private static final String FILE_NAME = "codtech_task.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\n=== CodTech File Handling ===");
            System.out.println("1. Write to File");
            System.out.println("2. Read from File");
            System.out.println("3. Modify File");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    writeFile(scanner);
                    break;
                case 2:
                    readFile();
                    break;
                case 3:
                    modifyFile(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    /**
     * Writes user input to the file.
     */
    private static void writeFile(Scanner scanner) {
        try (FileWriter writer = new FileWriter(FILE_NAME)) {
            System.out.print("Enter text to write into file: ");
            String content = scanner.nextLine();
            writer.write(content + "\n");
            System.out.println("Data written successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
            e.printStackTrace();
        }
    }

    /**
     * Reads content from the file and displays it.
     */
    private static void readFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            System.out.println("\n=== File Content ===");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }
    }

    /**
     * Modifies the file by replacing text.
     */
    private static void modifyFile(Scanner scanner) {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                System.out.println("File not found! Please write to the file first.");
                return;
            }

            System.out.print("Enter text to replace: ");
            String oldText = scanner.nextLine();
            System.out.print("Enter new text: ");
            String newText = scanner.nextLine();

            // Read existing content
            StringBuilder content = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line.replace(oldText, newText)).append("\n");
                }
            }

            // Write updated content back to file
            try (FileWriter writer = new FileWriter(FILE_NAME)) {
                writer.write(content.toString());
            }

            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("Error modifying file.");
            e.printStackTrace();
        }
    }
}