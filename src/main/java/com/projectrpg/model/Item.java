public class Item {
    private String name;
    private String description;
    private int rarity;
    private int value;
    private int quantity;

    public Item(String name, String description, int rarity, int value, int quantity) {
        this.name = name;
        this.description = description;
        this.rarity = rarity;
        this.value = value;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getRarity() {
        return rarity;
    }

    public int getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}