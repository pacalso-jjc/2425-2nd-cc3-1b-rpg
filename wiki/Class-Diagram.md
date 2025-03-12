```mermaid
---
title: Combat Manager
---
classDiagram
    class CombatManager {
        +Player player
        +Enemy[] enemies
        +CombatState currentState
        +startCombat() void
        +endCombat() void
        +processTurn(Ability ability) void
        +checkCombatEnd() bool
    }

    class Player {
        +String name
        +int health
        +int attackPower
        +Ability[] abilities
        +useAbility(Ability ability) void
        +takeDamage(int damage) void
    }

    class Enemy {
        +String name
        +int health
        +int attackPower
        +Ability[] abilities
        +useAbility(Ability ability) void
        +takeDamage(int damage) void
    }

    class Ability {
        +String name
        +int damage
        +int cost
        +applyEffect() void
    }

    class CombatState {
        <<enumeration>>
        ONGOING
        WON
        LOST
    }

    CombatManager "1" --> "1" Player : manages >
    CombatManager "1" --> "0..*" Enemy : manages >
    CombatManager "1" --> "1" CombatState : tracks >
    Player "1" --> "0..*" Ability : has >
    Enemy "1" --> "0..*" Ability : has >
    }
```