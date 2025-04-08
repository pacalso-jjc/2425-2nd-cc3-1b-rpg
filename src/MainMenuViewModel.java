public class MainMenuViewModel {
    public void displayMenu() {
        System.out.println("1. Start");
        System.out.println("2. Settings");
        System.out.println("3. Quit");
    }

    public void executeCurrentOption(int choice) {
        switch (choice) {
            case 1:
                handleStart();
                break;
            case 2:
                handleSettings();
                break;
            case 3:
                handleQuit();
                break;
            default:
                System.out.println("Invalid option. Please choose 1-3");
                break;
        }
    }

    private void handleStart() {
        System.out.println("Starting the game...");
    }

    private void handleSettings() {
        System.out.println("Opening settings...");
    }

    private void handleQuit() {
        System.out.println("Quitting game...");
        System.exit(0);
    }
}