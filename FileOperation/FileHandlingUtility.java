package FileOperation;

/*

FILE HANDLING UTILITY

1. Create a Java Program to Read, Write And Modify Text Files.
2. Deliverable: A Script Demonstrating File Operations With Clear Documentation.

*/

import java.io.BufferedReader;     // For reading text line by line
import java.io.BufferedWriter;     // For writing text to a file
import java.io.FileReader;         // For reading character data
import java.io.FileWriter;         // For writing character data
import java.io.IOException;        // To handle IO exceptions
import java.nio.file.Files;        // To work with files easily
import java.nio.file.Path;         // Represents a file path
import java.nio.file.Paths;        // Utility for creating Path instances
import java.util.Scanner;          // For taking input from the user

public class FileHandlingUtility {

    /**
     * Writes the given content to the specified file.
     * If the file exists, its content will be replaced.
     */
    public static void writeToFile(String filename, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content); // Writing content to file
            System.out.println("✅ File written successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads and displays the content of the specified file line by line.
     */
    public static void readFromFile(String filename) {
        System.out.println("📖 Reading file content:");
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("→ " + line);
            }
        } catch (IOException e) {
            System.out.println("❌ Error reading from file: " + e.getMessage());
        }
    }

    /**
     * Replaces all occurrences of oldContent with newContent in the file.
     */
    public static void modifyFile(String filename, String oldContent, String newContent) {
        try {
            // Create a path object only once
            Path path = Paths.get(filename);

            // Read full file content into a single string
            String content = new String(Files.readAllBytes(path));

            // Replace the desired text
            content = content.replace(oldContent, newContent);

            // Write the modified content back to the file
            Files.write(path, content.getBytes());

            System.out.println("✏️ File modified successfully.");
        } catch (IOException e) {
            System.out.println("❌ Error modifying file: " + e.getMessage());
        }
    }

    /**
     * Main method - displays a menu for file operations and loops until the user exits.
     */
    public static void main(String[] args) {
        String filename = "example.txt";  // Default file name
        Scanner scanner = new Scanner(System.in);  // For user input
        boolean continueProgram = true;  // Controls the menu loop

        while (continueProgram) {
            // Display options to the user
            System.out.println("\n📂 File Operations Menu:");
            System.out.println("1. Write to file");
            System.out.println("2. Read from file");
            System.out.println("3. Modify file content");
            System.out.print("Choose an option (1-3): ");

            int choice = scanner.nextInt(); // Get user’s numeric choice
            scanner.nextLine(); // Clear newline after number input

            switch (choice) {
                case 1:
                    // Write content to file
                    System.out.println("📝 Enter text to write into the file:");
                    String userInput = scanner.nextLine();
                    writeToFile(filename, userInput);
                    break;

                case 2:
                    // Read file content
                    readFromFile(filename);
                    break;

                case 3:
                    // Modify file content
                    System.out.print("🔄 Enter word to replace: ");
                    String oldText = scanner.nextLine();
                    System.out.print("➡️ Enter new word: ");
                    String newText = scanner.nextLine();
                    modifyFile(filename, oldText, newText);
                    break;

                default:
                    // Invalid choice handling
                    System.out.println("⚠️ Invalid choice. Please select 1, 2, or 3.");
            }

            // Ask user if they want to continue
            System.out.print("\n🔁 Do you want to continue? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("no")) {
                continueProgram = false;
                System.out.println("👋 Exiting program. Goodbye!");
            }
        }

        scanner.close(); // Close the scanner after loop ends
    }
}

