```mermaid
---
title: Fantasy RPG
---
classDiagram
    Item --|> Material
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


    }
    
    class MergeConflictTest{

    }

    class Alchemist {
        +String className = "Alchemist"
        +String skillBranch = "Truth Seeker"
        +double increaseInt(double amount)
        +double increaseLuck(double amount)
    }
    class Assassin {
        +String className = "Assassin"
        +String skillBranch = "Quiet and Discreet"
        +double increaseDex(double amount)
        +double increaseAgi(double amount)
    }
    class Healer {
        +String className = "Healer"
        +String skillBranch = "World's Grace"
        +double increaseVit(double amount)
        +double increaseHP(double amount)
    }
    class Knight {
        +String className = "Knight"
        +String skillBranch = "Sacred Oath"
        +double increaseAtk(double amount)
        +double increaseConst(double amount)
    }
    class Mage {
        +String className = "Mage"
        +String skillBranch = "Mana's Blessing"
        +double increaseMana(double amount)
        +double increaseAtk(double amount)
    }
    class Ranger {
        +String className = "Ranger"
        +String skillBranch = "Bird's Eye"
        +double increaseAcc(double amount)
        +double increaseStamina(double amount)
    }
    class Wizard {
        +String className = "Wizard"
        +String skillBranch = "Arcane's Blessing"
        +double increaseMana(double amount)
        +double increaseCrt(double amount)
    }

    Class --|> Alchemist
    Class --|> Assassin
    Class --|> Healer
    Class --|> Knight
    Class --|> Mage
    Class --|> Ranger
    Class --|> Wizard


    class Class {
        <<Abstract>>
        -String className
        -String skillBranch
        +void baseStats()
        +void apply
	    +(Name)
    }

    class DialogueManager {
        -currentDialogue: Dialogue
        +startDialogue(dialogue: Dialogue): void
        +getCurrentText(): String
        +getOptions(): List~String~
        +selectOption(index: int): void
        +isDialogueActive(): boolean
    }
```