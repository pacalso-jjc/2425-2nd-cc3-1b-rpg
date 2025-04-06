public class Inventory {
    private List<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item); 
    }

    public List<Item> viewItemsByType(String type) {
        List<Item> filteredItems = new ArrayList<>();
        for (Item item : items) {
            
        }
        return filteredItems;
    }
}
