import java.util.List;

public abstract class Entity {
    private int exp;
    private int maxHp; 
    private int maxMana;
    private int maxStamina;
    private int currentHp;
    private int currentMana;
    private int currentStamina;
    private Statistic stas;
    private List<Skill> skills;
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


