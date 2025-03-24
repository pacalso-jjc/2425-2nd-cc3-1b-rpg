import java.util.List;

public abstract class Entity {
    private String name;
    private String stat;
    private String skills;
    private int exp;
    private int hp;
    private int mana;
    private int stamina;
    private int constitution;
    private int strength;
    private int defense;
    private Inventory inventory;
    private List<Item> equipments;

    public void attack(Entity e){

    }

    public void takeDamage(int amountOfDamage){

    }

    public Boolean isAlive(){
    
    }

    public void makeSound(){

    }

}


