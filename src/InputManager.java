import java.util.Scanner;

public class InputHandler {
    private Scanner sc;

    // Constructor initializes the Scanner
    public InputHandler() {
        this.sc = new Scanner(System.in);
    }

    // Method to get user input as a String
    public static String getInput() {
        return sc.nextLine();  // Reads and returns the user's input
    }
}
