public class DialogueOption {
    private String optionText;
    private Dialogue nextDialogue;

    
    public DialogueOption(String optionText, Dialogue nextDialogue) {
        this.optionText = optionText;
        this.nextDialogue = nextDialogue;
    }

    
    public String getOptionText() {
        return optionText;
    }

    
    public Dialogue getNextDialogue() {
        return nextDialogue;
    }

    
    public void setNextDialogue(Dialogue nextDialogue) {
        this.nextDialogue = nextDialogue;
    }
}