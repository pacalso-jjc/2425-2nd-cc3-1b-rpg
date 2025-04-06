import java.util.ArrayList;
import java.util.List;

class CombatViewModel {
    private Character player;
    private Character enemy;
    private List<Action> actions;

    public CombatViewModel(Character player, Character enemy) {
        this.player = player;
        this.enemy = enemy;
        this.actions = new ArrayList<>();
        this.actions.add(new AttackAction("Attack", "Deal damage to the enemy.", 10));
        this.actions.add(new DefendAction("Defend", "Reduce damage from the next attack."));
    }

    public void displayCombatInfo() {
        System.out.println(player.getName() + " (Health: " + player.getHealth() + ") vs " +
                           enemy.getName() + " (Health: " + enemy.getHealth() + ")");
    }

    public void selectAction(Action action) {
        System.out.println("Selected action: " + action.name);
    }

    public void executeAction(Action action) {
        action.perform(enemy);
    }

    public boolean isCombatOver() {
        return !player.isAlive() || !enemy.isAlive();
    }
}