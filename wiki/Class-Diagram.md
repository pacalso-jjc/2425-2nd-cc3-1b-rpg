```mermaid
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

    Dialogue *-- DialogueTree 
    class DialogueTree{
        -dialogue: Dialogue
        +start(): void
    }

    DialogueOption *-- Dialogue
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
