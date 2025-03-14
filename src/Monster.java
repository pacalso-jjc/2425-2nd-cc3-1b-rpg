public class Monster extends Character {
    private String type;

    public Monster(String name, int hp, int level, String type) {
        super(name, hp, level); 
        this.type = type; 
    }
}
