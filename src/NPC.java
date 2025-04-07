import java.util.List;

public class NPC extends Character {
    private List<Quest> questList;

    public NPC(String name, int hp, int level, List<Quest> questList) {
        super(name, hp, level);
        this.questList = questList;
    }
}