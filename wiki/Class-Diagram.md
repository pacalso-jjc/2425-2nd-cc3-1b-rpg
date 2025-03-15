
```mermaid
title: Combat Manager
---
classCombatManager
    Combat Manager <|-- Player
    Combat Manager <|-- Enemy
    Combat Manager <|-- Ability
    Combat Manager <|-- CombatState
    Combat Manager : +Player player
    Combat Manager : +Enemy[] enemies
    Combat Manager: +CombatState currentState
    Combat Manager: +startCombat() void
    Combat Manager: +endCombat() void
    Combat Manager: +processTurn(Ability ability) void
    Combat Manager: +checkCombatEnd() bool
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

=======
title: Fantasy RPG
---
classDiagram
    Item --|> Material
    Inventory --> Item 
    class Material {
        - isCraftingMaterial: boolean
        - craftingUsage: String
        - materialType: String
        - source: String
    }

    class Item{
        -String name
        -String description
        -int rarity
        -int value
        -int quantity
    }

    class Game{
        - Menu menu
        - boolean isRunning
        - InputHandler inputHandler
        - Player player
        + Game()
        + start()
        + loadGame()
        + exitGame()
        + main(String[] args)
    }

    class InputHandler{
        - Scanner sc
        + String getInput()
    }

    class DialogueManager {
        -currentDialogue: Dialogue
        +startDialogue(dialogue: Dialogue): void
        +getCurrentText(): String
        +getOptions(): List~String~
        +selectOption(index: int): void
        +isDialogueActive(): boolean
    } 

    class Dialogue {
        -text: String
        -options: List~String~
        -nextDialogues: List~Dialogue~
        +getText(): String
        +getOptions(): List~String~
        +getNextDialogue(index: int): Dialogue
    }

    Equipment <|-- Weapon
    class Weapon {
        -damage: int
        +Weapon(name: String, value: int, damage: int)
        +getDamage(): int
    }
    
    Item <|-- Equipment
    class Equipment {
        - levelRequirement: int
        + equip(): void
        + canEquip(): boolean
    }

    class Inventory {
        +items: List<Item>
        +addItem(item: Item)
        +removeItem(item: Item)
        +viewItemsByType(type: String) List
    }

```

