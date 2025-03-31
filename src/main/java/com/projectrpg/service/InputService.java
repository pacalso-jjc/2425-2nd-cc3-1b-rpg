
import java.util.Scanner;

public class InputService {

    private Scanner sc;

    // Constructor initializes the Scanner
    public InputService() {
        this.sc = new Scanner(System.in);
    }

    // Method to get user input as a String
    public String getInput() {
        return sc.nextLine();  // Reads and returns the user's input
    }
}
