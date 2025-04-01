import java.util.List;

public class Dialogue {
    private String text;
    private List<String> options;
    private List<Dialogue> nextDialogues;

    public Dialogue(String text, List<String> options, List<Dialogue> nextDialogues) {
        this.text = text;
        this.options = options;
        this.nextDialogues = nextDialogues;
    }

    public String getText() {
        return text;
    }

    public List<String> getOptions() {
        return options;
    }

    public Dialogue getNextDialogue(int index) {
        if (index >= 0 && index < nextDialogues.size()) {
            return nextDialogues.get(index);
        } else {
            return null; 
        }
    }
}
