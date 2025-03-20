```mermaid
---
title: Fantasy RPG
---
classDiagram
    class World {
        - List locations
        - String worldName
        - String description
        + addLocation(Location l)
        + removeLocation(Location l)
        + getLocations() List
        + setWorldName(String name)
        + getWorldName() String
        + displayWorldInfo()
        + simulateWorldProgression()
        + resetWorld()
    }

    class Material {
        - isCraftingMaterial: boolean
        - craftingUsage: String
        - materialType: String
        - source: String
    }

    class Item {
        - String name
        - String description
        - int rarity
        - int value
        - int quantity   
    }

    class Statistic {
        - int strength
        - int dexterity
        - int constitution
        - int intelligence
        - int wisdom
        - int charisma
    }

    class Consumable {
        - String effect
        - int amountToRegenerate 
    }

    class Armor {
        + int defense
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
        - currentDialogue: Dialogue
        + startDialogue(dialogue: Dialogue): void
        + getCurrentText(): String
        + getOptions(): List<String>
        + selectOption(index: int): void
        + isDialogueActive(): boolean
    } 

    class DialogueTree {
        - Dialogue dialogue
        + start(): void
    }

    class Dialogue {
        - String text
        - List<String> options
        - List<Dialogue> nextDialogues
        + getText(): String
        + getOptions(): List<String>
        + getNextDialogue(index: int): Dialogue
    }

    class DialogueOption {
        - String optionText
        - Dialogue nextDialogue
        + DialogueOption(optionText: String, nextDialogue: Dialogue)
        + getOptionText(): String
        + getNextDialogue(): Dialogue
        + setNextDialogue(nextDialogue: Dialogue): void
    }

    class Equipment {
        - int levelRequirement
        + equip(): void
        + canEquip(): boolean
    }

    class Weapon {
        - int damage
        + Weapon(name: String, value: int, damage: int)
        + getDamage(): int
    }

    class Inventory {
        + List<Item> items
        + addItem(item: Item)
        + removeItem(item: Item)
        + viewItemsByType(type: String): List<Item>
    } 

    Item <|-- Consumable
    Item <|-- Armor
    Item <|-- Equipment
    Equipment <|-- Weapon
    Inventory --> Item 
    Item --|> Material
    Dialogue *-- DialogueTree 
    DialogueOption *-- Dialogue
```