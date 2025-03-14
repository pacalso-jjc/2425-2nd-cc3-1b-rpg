class Armor extends Equipment {
    private int defense;

    public Armor(String name, int defense){
        super(name, value);
        this.defense = defense;
    }

    public int getDefense(){
        return defense;
    }
}
