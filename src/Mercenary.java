public class Character {
    // Attributes
    protected String name;
    protected int level;
    protected int health;
    protected int attackPower;
    protected int defense;
    protected int goldCost;
    protected String status;

    // Constructor
    public Character(String name, int level, int health, int attackPower, int defense, int goldCost, String status) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.goldCost = goldCost;
        this.status = status;
    }

    // Attack method
    public void attack() {
        System.out.println(name + " attacks with power: " + attackPower);
    }

    // Defend method
    public void defend() {
        System.out.println(name + " defends with defense: " + defense);
    }

    // Hire method
    public void hire() {
        status = "Hired";
        System.out.println(name + " has been hired.");
    }

    // Fire method
    public void fire() {
        status = "Fired";
        System.out.println(name + " has been fired.");
    }

    // Level up method
    public void levelUp() {
        level++;
        attackPower += 10;
        defense += 5;
        System.out.println(name + " leveled up to level " + level);
    }
}

// Mercenary class inheriting from Character
public class Mercenary extends Character {
    // Constructor
    public Mercenary(String name, int level, int health, int attackPower, int defense, int goldCost, String status) {
        super(name, level, health, attackPower, defense, goldCost, status); // Call superclass constructor
    }
}