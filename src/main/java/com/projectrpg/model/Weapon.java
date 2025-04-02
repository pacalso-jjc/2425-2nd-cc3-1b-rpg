class Weapon extends Equipment {
    private int bonusDamage;

     
    public Weapon(String name, int value, int bonusDamage) {
        super(name, value);  
        this.bonusDamage = bonusDamage;
    }

    // Getter for damage
    public int getDamage() {
        return bonusDamage;
    }
}
