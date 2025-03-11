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

    class Skill {
        <<Abstract>>
        +String skillName
        +String description
        +int requiredLevel
        +List~Skill~ prerequisites
        +void unlock()
    }

    class SkillTree {
        +String className
        +List~Skill~ availableSkills
        +List~Skill~ unlockedSkills
        +int skillPoints
        +void unlockSkill(Skill skill)
        +void spendSkillPoint()
    }

    class PassiveSkill {
        +double statBoost
    }
    
    class ActiveSkill {
        +void cast()
        +double manaCost
    }

    Skill <|-- PassiveSkill
    Skill <|-- ActiveSkill

    SkillTree *-- Skill : contains

    class AlchemistTree {
        +void unlockSkill(Skill skill)
    }
    class AssassinTree {
        +void unlockSkill(Skill skill)
    }
    class HealerTree {
        +void unlockSkill(Skill skill)
    }
    class KnightTree {
        +void unlockSkill(Skill skill)
    }
    class MageTree {
        +void unlockSkill(Skill skill)
    }
    class RangerTree {
        +void unlockSkill(Skill skill)
    }
    class WizardTree {
        +void unlockSkill(Skill skill)
    }

    SkillTree <|-- AlchemistTree
    SkillTree <|-- AssassinTree
    SkillTree <|-- HealerTree
    SkillTree <|-- KnightTree
    SkillTree <|-- MageTree
    SkillTree <|-- RangerTree
    SkillTree <|-- WizardTree
```