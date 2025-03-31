import java.util.List;

public abstract class Entity {
    private String name;
    private List<Skill> skills;
    private int exp;
    private int hp;
    private int mana;
    private int stamina;
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


