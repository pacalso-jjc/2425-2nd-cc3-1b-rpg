import java.util.List;

public class DialogueService {

    private Dialogue currentDialogue;

     
    public void startDialogue(Dialogue dialogue) {
        this.currentDialogue = dialogue;
    }

     
    public String getCurrentText() {
        return currentDialogue != null ? currentDialogue.getText() : "";
    }

     
    public List<String> getOptions() {
        return currentDialogue != null ? currentDialogue.getOptions() : List.of();
    }

     
    public void selectOption(int index) {
        if (currentDialogue != null && index >= 0 && index < getOptions().size()) {
            currentDialogue.selectOption(index);
        }
    }

     
    public boolean isDialogueActive() {
        return currentDialogue != null;
    }
}