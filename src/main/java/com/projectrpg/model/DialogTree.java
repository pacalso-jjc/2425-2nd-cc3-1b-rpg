class DialogueTree {
    private Dialogue dialogue;
    
    public DialogueTree(Dialogue dialogue) {
        this.dialogue = dialogue;
    }
    
    public void start() {
        System.out.println(dialogue.getText());
    }
}