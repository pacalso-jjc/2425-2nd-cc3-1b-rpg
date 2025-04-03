public enum CombatState {
    ONGOING,
    WON,
    LOST
}

public class CombatService {
    public CombatState currentState;

 public void startCombat() {
        this.currentState = CombatState.ONGOING;

}
    
    public void endCombat() {
  this.currentState = null;

    }

public boolean checkCombatEnd() {
        return this.currentState == CombatState.WON || 
               this.currentState == CombatState.LOST;
    }
}