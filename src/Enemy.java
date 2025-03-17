public class Enemy extends Character {
    private String type;

    public Enemy(String name, int level, String type) {
        super(name, level); 
        this.type = type;
    }
}
