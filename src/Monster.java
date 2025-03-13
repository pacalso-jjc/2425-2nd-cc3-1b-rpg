public class Monster extends Entity {
    private String type;

    public Monster(String name, int hp, int level, String type) {
        super(name, hp, level); 
        this.type = type; 
    }
}
