public class Consumable extends Item {
    private int amountToRegenerate;
    private String type;

    public Consumable(String name, String description, int rarity, int value, int quantity, int amountToRegenerate, String type) {
        super(name, description, rarity, value, quantity);
        this.amountToRegenerate = amountToRegenerate;
        this.type = type;
    }

    public int getAmountToRegenerate() {
        return amountToRegenerate;
    }

    public void setAmountToRegenerate(int amountToRegenerate) {
        this.amountToRegenerate = amountToRegenerate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
