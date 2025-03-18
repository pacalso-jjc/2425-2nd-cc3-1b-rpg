class Weapon extends Equipment {
    private int damage;

     
    public Weapon(String name, int value, int damage) {
        super(name, value);  
        this.damage = damage;
    }

    // Getter for damage
    public int getDamage() {
        return damage;
    }
}