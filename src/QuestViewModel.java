import java.util.ArrayList;
import java.util.List;

class QuestViewModel extends Quest {
    private List<Quest> quests;
    private Quest currentQuest; 

    public QuestViewModel() {
        super("Quest Manager", "Manages a list of quests."); 
        this.quests = new ArrayList<>();
        this.currentQuest = null; 
    }


    public void addQuest(Quest quest) {
        quests.add(quest);
    }
   
    public void removeQuest(Quest quest) {
        quests.remove(quest);
    }
    
    public void startQuest(Quest quest) {
        if (quests.contains(quest)) {
            currentQuest = quest; 
            System.out.println("Started quest: " + quest.getName());
        } else {
            System.out.println("Quest not found: " + quest.getName());
        }
    }

    public void completeQuest(Quest quest) {
        if (quests.contains(quest) && currentQuest == quest) {
            quest.complete(); 
            currentQuest = null; 
            System.out.println("Completed quest: " + quest.getName());
        } else {
            System.out.println("Cannot complete quest: " + quest.getName());
        }
    }

    public Quest getCurrentQuest() {
        return currentQuest;
    }

    public List<Quest> getAllQuests() {
        return quests;
    }
}