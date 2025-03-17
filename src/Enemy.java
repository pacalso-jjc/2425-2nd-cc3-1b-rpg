public class Enemy extends Character {
    private int level;
    private String type;

    public Enemy(String name, int level, String type) {
        this.setName(name);
        this.level = level;
        this.type = type;
    }

    public void attack(Entity target) {
        
    }

    public void takeDamage(int damage) {
        
    }

    public void dropLoot() {
        
    }
}
