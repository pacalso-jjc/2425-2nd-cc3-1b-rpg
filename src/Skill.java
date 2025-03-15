public class Skill {
    private String name;
    private String description;
    private String skillType;
    private int coolDown;
    private int manaCost;

    public Skill(String name, String description, String skillType, int coolDown, int manaCost) {
        this.name = name;
        this.description = description;
        this.skillType = skillType;
        this.coolDown = coolDown;
        this.manaCost = manaCost;
    }

    public void use() {
        System.out.println(name + " skill used!");
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSkillType() {
        return skillType;
    }
}
