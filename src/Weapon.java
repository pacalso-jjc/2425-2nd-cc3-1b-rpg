class Weapon extends Equipment {
    private int damage;

    // Constructor for Weapon
    public Weapon(String name, int value, int damage) {
        super(name, value); // Call the superclass (Equipment) constructor
        this.damage = damage;
    }

    // Getter for damage
    public int getDamage() {
        return damage;
    }
}