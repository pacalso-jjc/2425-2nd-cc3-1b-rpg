import java.util.ArrayList;
import java.util.List;

// Quest class representing a single quest
class Quest {
    private int id;
    private String name;

    public Quest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

// QuestManager class that manages different quests
class QuestManager {
    private List<Quest> activeQuests = new ArrayList<>();
    private List<Quest> completedQuests = new ArrayList<>();
    private List<Quest> availableQuests = new ArrayList<>();

    public void addQuest(Quest quest) {
        availableQuests.add(quest);
    }

    public void completeQuest(Quest quest) {
        if (activeQuests.remove(quest)) {
            completedQuests.add(quest);
        }
    }

    public List<Quest> getActiveQuests() {
        return activeQuests;
    }

    public List<Quest> getCompletedQuests() {
        return completedQuests;
    }

    public List<Quest> getAvailableQuests() {
        return availableQuests;
    }

    public Quest findQuestById(int id) {
        for (Quest quest : availableQuests) {
            if (quest.getId() == id) {
                return quest;
            }
        }
        for (Quest quest : activeQuests) {
            if (quest.getId() == id) {
                return quest;
            }
        }
        for (Quest quest : completedQuests) {
            if (quest.getId() == id) {
                return quest;
            }
        }
        return null;
    }
}

// Main class to test the QuestManager
public class Main {
    public static void main(String[] args) {
        QuestManager questManager = new QuestManager();

        Quest quest1 = new Quest(1, "Find the lost sword");
        Quest quest2 = new Quest(2, "Rescue the villagers");

        questManager.addQuest(quest1);
        questManager.addQuest(quest2);

        System.out.println("Available Quests:");
        for (Quest q : questManager.getAvailableQuests()) {
            System.out.println(q.getName());
        }
    }
}