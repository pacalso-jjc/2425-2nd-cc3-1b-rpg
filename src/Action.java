public class Action {
private String actionName;
private String actionType;
private int requiredLevel;
private int manaCost;

public void execute() {
}


public String getActionName() {
return actionName;
}

public void setActionName(String name) {
this.actionName = name;
}

public String getActionType() {
return actionType;
}

public void setActionType(String type) {
this.actionType = type;
}

public int getRequiredLevel() {
return requiredLevel;
}

public void setRequiredLevel(int level) {
this.requiredLevel = level;
}

public int getManaCost() {
return manaCost;
}

public void setManaCost(int cost) {
this.manaCost = cost;
}
}
