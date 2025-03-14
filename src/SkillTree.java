import java.util.*;

class Skill {
    private String skillName;
    private String description;
    private int requiredLevel;

    public Skill(String skillName, String description, int requiredLevel) {
        this.skillName = skillName;
        this.description = description;
        this.requiredLevel = requiredLevel;
    }

    public String getSkillName() {
        return skillName;
    }

    public String getDescription() {
        return description;
    }

    public int getRequiredLevel() {
        return requiredLevel;
    }

    @Override
    public String toString() {
        return skillName + " (Level " + requiredLevel + "): " + description;
    }
}

class SkillTree extends Character{
    private String className;
    private List<Skill> availableSkills;
    private List<Skill> unlockedSkills;
    private int skillPoints;

    public SkillTree(String className) {
        this.className = className;
        this.availableSkills = new ArrayList<>();
        this.unlockedSkills = new ArrayList<>();
        this.skillPoints = 0;
    }

    public void addSkill(Skill skill) {
        availableSkills.add(skill);
    }

    public void unlockSkill(Skill skill) {
        if (skillPoints > 0 && availableSkills.contains(skill)) {
            unlockedSkills.add(skill);
            skill.unlock();
            skillPoints--;
        } else {
            System.out.println("Cannot unlock skill: " + skill.skillName);
        }
    }

    public void spendSkillPoint() {
        skillPoints++;
    }
}

class AlchemistTree extends SkillTree {
    public AlchemistTree() {
        super("Alchemist");
    }

    @Override
    public void unlockSkill(Skill skill) {
        System.out.println("Alchemist Skill unlocked: " + skill.skillName);
        super.unlockSkill(skill);
    }
}

class AssassinTree extends SkillTree {
    public AssassinTree() {
        super("Assassin");
    }

    @Override
    public void unlockSkill(Skill skill) {
        System.out.println("Assassin Skill unlocked: " + skill.skillName);
        super.unlockSkill(skill);
    }
}

class HealerTree extends SkillTree {
    public HealerTree() {
        super("Healer");
    }

    @Override
    public void unlockSkill(Skill skill) {
        System.out.println("Healer Skill unlocked: " + skill.skillName);
        super.unlockSkill(skill);
    }
}

class KnightTree extends SkillTree {
    public KnightTree() {
        super("Knight");
    }

    @Override
    public void unlockSkill(Skill skill) {
        System.out.println("Knight Skill unlocked: " + skill.skillName);
        super.unlockSkill(skill);
    }
}

class MageTree extends SkillTree {
    public MageTree() {
        super("Mage");
    }

    @Override
    public void unlockSkill(Skill skill) {
        System.out.println("Mage Skill unlocked: " + skill.skillName);
        super.unlockSkill(skill);
    }
}

class RangerTree extends SkillTree {
    public RangerTree() {
        super("Ranger");
    }

    @Override
    public void unlockSkill(Skill skill) {
        System.out.println("Ranger Skill unlocked: " + skill.skillName);
        super.unlockSkill(skill);
    }
}

class WizardTree extends SkillTree {
    public WizardTree() {
        super("Wizard");
    }

    @Override
    public void unlockSkill(Skill skill) {
        System.out.println("Wizard Skill unlocked: " + skill.skillName);
        super.unlockSkill(skill);
    }
}