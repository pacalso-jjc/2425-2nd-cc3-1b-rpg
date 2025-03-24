```mermaid
---
title: Fantasy RPG
---
classDiagram
GameObject --|> Entity
   class Entity{
      - exp: int
      - hp: int
      - mana: int
      - stamina: int
      - stats: Statistic
      - skills: List~Skill~
      - inventory: Inventory
      - equipments: List~Item~
      + attack(Entity e): void
      + takeDamage(int amountOfDamage): void
      + isAlive (): boolean
      + makeSound(): void
    }

    Item --|> Material
    class Material {
        - isCraftingMaterial: boolean
        - craftingUsage: String
        - materialType: String
        - source: String
    }
    GameObject --|> Item
    class Item {
        -int rarity
        -int value
        -int quantity   
    }
    
    class Statistic{
 	-int strength
	-int dexterity
	-int constitution
	-int intelligence
	-int wisdom
	-int charisma
    }

    Item <|-- Consumable
    class Consumable {
        -String effect
        -int amountToRegenerate 
        +setEffect() void
        +setAmountToRegenerate() void
        +getEffect() String
        +getAmountToRegenerate() int
    }

    Equipment --|> Armor
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

    Equipment --|> Weapon
    class Weapon {
        -damage: int
        +Weapon(name: String, value: int, damage: int)
        +getDamage(): int
    }
    
    Item --|> Equipment
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

    NPC <|-- Merchant
    class Merchant {
        - stock: List<Item>
        + buyItem(buyer: Character, item: Item, quantity: int): boolean
        + sellItem(seller: Character, item: Item, quantity: int): boolean
        # setPrices(item: Item, newPrice: float): void
        # restockItems(): void
    }
 
    class GameObject{
        -name: String
        -desc: String
        +getName(): String
        +getDesc(): String
    }
    
    Character <|-- NPC
    class NPC{
        - quest:List<Quest>
        + giveQuest(character: Character) : void
    }


```
