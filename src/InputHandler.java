import java.util.Scanner;

public class InputHandler {
    private Scanner sc;

    // Constructor initializes the Scanner
    public InputHandler() {
        sc = new Scanner(System.in);
    }

    // Method to get user input as a String
    public String getInput() {
        return sc.nextLine();  // Reads and returns the user's input
    }

    // Close the scanner when it's no longer needed
    public void close() {
        sc.close();
    }
}
