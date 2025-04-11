import java.util.Scanner;

public class QuestViewModel {
    private QuestViewModel questViewModel;
    private Scanner scanner;

    public QuestViewModel(QuestViewModel questViewModel) {
        this.questViewModel = questViewModel;
        this.scanner = new Scanner(System.in);
    }

    public void displayQuestList() {
        System.out.println("Displaying quest list...");
    }

    public void displayCurrentQuest() {
        System.out.println("Displaying current quest...");
    }

    public void promptUserForAction() {
        System.out.println("Please choose an action:");
        String input = scanner.nextLine();
        handleUserInput(input);
    }

    public void handleUserInput(String input) {
        System.out.println("Handling input: " + input);
    }
}
