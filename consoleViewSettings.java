import java.util.Scanner;
import java.util.List;

public class ConsoleViewInventory {
    private Scanner inputScanner = new Scanner(System.in);

    public void displayInventory(Inventory inventory) {
        System.out.println("Inventory:");
        List<Item> items = inventory.getItems();
        if (items.isEmpty()) {
            displayNoItemsMessage();
            return;
        }
        int index = 1;
        for (Item item : items) {
            System.out.println(index++ + ". " + item.getName());
        }
    }

    public void displayItemDetails(Item item) {
        System.out.println("\nItem Details:");
        System.out.println("Name: " + item.getName());
        System.out.println("Description: " + item.getDescription());
        System.out.println("Type: " + item.getType());
    }

    public Item promptItemSelection(Inventory inventory) {
        List<Item> items = inventory.getItems();
        if (items.isEmpty()) {
            displayNoItemsMessage();
            return null;
        }

        displayInventory(inventory);
        System.out.print("Select item number: ");
        int choice = inputScanner.nextInt();
        inputScanner.nextLine(); // clear newline
        if (choice < 1 || choice > items.size()) {
            System.out.println("Invalid choice.");
            return null;
        }
        return items.get(choice - 1);
    }

    public void displayEquipSuccess(Item item) {
        System.out.println("Equipped: " + item.getName());
    }

    public void displayUseItemResult(Item item, String result) {
        System.out.println("Used " + item.getName() + ": " + result);
    }

    public String promptEquipOrUse() {
        System.out.print("Would you like to 'equip' or 'use' the item? ");
        return inputScanner.nextLine().trim().toLowerCase();
    }

    public void displayNoItemsMessage() {
        System.out.println("Your inventory is empty.");
    }
}

