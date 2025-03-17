```mermaid
---
title: Mercenary Diagram
---

classDiagram
direction TB
    class Character {
        -String name
        -int level
        -int health
        -int attackPower
        -int defense
        -String status
        +attack()
        +defend()
    }
    
    class Mercenary {
        -int goldCost
    }

<<<<<<< HEAD
    Mercenary --|> Character
=======
    Mercenary --|> Character

---
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

    class Item {
        -String name
        -String description
        -int rarity
        -int value
        -int quantity   
    }

    Item <|-- Armor
    class Armor {
        +int defense
    }

    class Game {
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

    class InputHandler {
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

    class DialogueOption {
        -optionText: String
        -nextDialogue: Dialogue
        +DialogueOption(optionText: String, nextDialogue: Dialogue)
        +getOptionText(): String
        +getNextDialogue(): Dialogue
        +setNextDialogue(nextDialogue: Dialogue): void
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
>>>>>>> b0f697d7b0ff294cb92e90d712cb22733ea7d48a
