package day1;// Importing the necessary Java package for standard input-output
import java.util.Scanner;

public class ExerciseScanner {
    public void displayText() {
        // Prompt the user to enter a message
        System.out.println("Enter your message:");
        // Use a Scanner to read the user's input
        Scanner scannerInput = new Scanner(System.in);
        String message = scannerInput.nextLine();

        // Print the message using println (with a newline)
        System.out.println("Using println:");
        System.out.println(message);

        // Print the message using print (without a newline)
        System.out.print("Using print:");
        System.out.print(message);
        System.out.println("\n");
        // Print a new line with escape sequences
        System.out.println("Text with escape sequences:");
        System.out.println("Hello, \"Java Masterclass\" students!\nWelcome to Day 1.\nLet's get started!");
    }
}
