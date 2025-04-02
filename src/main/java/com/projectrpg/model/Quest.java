import java.util.List;

public class Quest {
    private String questName;
    private String questDescription;
    private String questType;
    private List<Item> itemRewards;
    private int goldReward;
    private boolean isCompleted;

    public Quest(String questName, String questDescription, String questType, List<Item> itemRewards, int goldReward) {
        this.questName = questName;
        this.questDescription = questDescription;
        this.type = type;
        this.itemRewards = itemRewards;
        this.goldReward = goldReward;
        this.isCompleted = false;
    }

    public boolean isQuestCompleted() {
        return isCompleted;
    }

    public String getDescription() {
        return questDescription;
    }

    public List<Item> getItemRewards() {
        return itemRewards;
    }

    public int getGoldReward() {
        return goldReward;
    }

    public void completeQuest() {
        this.isCompleted = true;
    }
}
