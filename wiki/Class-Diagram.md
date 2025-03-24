
    class QuestManager {
        - activeQuests: List
        - completedQuests: List
        - availableQuests: List
        + addQuest(quest: Quest): void
        + completeQuest(quest: Quest): void
        + getActiveQuests(): List
        + getCompletedQuests(): List
        + getAvailableQuests(): List
        + findQuestById(id: int): Quest
    }

    class Entity {
        - name: String
        - exp: int
        - hp: int
        - mana: int
        - stamina: int
        - stats: Statistic
        - skills: List
        - inventory: Inventory
        - equipments: List
        + attack(e: Entity): void
        + takeDamage(amount: int): void
        + isAlive(): boolean
        + makeSound(): void
    }

    Item --|> Material
    Inventory --> Item 

    class Material {
        - isCraftingMaterial: boolean
        - craftingUsage: String
        - materialType: String
        - source: String
    }

    class Item {
        - name: String
        - description: String
        - rarity: int
        - value: int
        - quantity: int  
    }
    
    Entity o-- Statistic
    class Statistic {
        - strength: int
        - dexterity: int
        - constitution: int
        - intelligence: int
        - wisdom: int
        - charisma: int
        + getStrength(): int
        + setStrength(strength: int): void
        + getDexterity(): int
        + setDexterity(dexterity: int): void
        + getConstitution(): int
        + setConstitution(constitution: int): void
        + getIntelligence(): int
        + setIntelligence(intelligence: int): void
        + getWisdom(): int
        + setWisdom(wisdom: int): void
        + getCharisma(): int
        + setCharisma(charisma: int): void
    }

    Item --|> Consumable
    class Consumable {
        - effect: String
        - amountToRegenerate: int
        + setEffect(effect: String): void
        + setAmountToRegenerate(amount: int): void
        + getEffect(): String
        + getAmountToRegenerate(): int
    }

    Equipment --|> Armor
    class Armor {
        - defense: int
    }

    class Game {
        - menu: Menu
        - isRunning: boolean
        - inputHandler: InputHandler
        - player: Player
        + newGame()
        + start(): void
        + loadGame(): void
        + exitGame(): void
        + main(args: String[]): void
    }

    class InputHandler {
        - sc: Scanner
        + getInput(): String
    }

    class DialogueManager {
        - currentDialogue: Dialogue
        + startDialogue(dialogue: Dialogue): void
        + getCurrentText(): String
        + getOptions(): List
        + selectOption(index: int): void
        + isDialogueActive(): boolean
    } 

    Dialogue *-- DialogueTree 
    class DialogueTree {
        - dialogue: Dialogue
        + start(): void
    }

    DialogueOption *-- Dialogue
    class Dialogue {
        - text: String
        - options: List
        - nextDialogues: List
        + getText(): String
        + getOptions(): List
        + getNextDialogue(index: int): Dialogue
    }

    class Character {
        - sex: String
        - race: String
        - exp: int
        - charisma: int
        + addToInventory(item: Item): void
        + removeFromInventory(item: Item): void
        + sellItems(item: Item): void
        + move(direction: Direction): void
        + equipItems(item: Item): void
        + regenerate(amount: int): void
    }

    class DialogueOption {
        - optionText: String
        - nextDialogue: Dialogue
        + newDialogueOption(optionText: String, nextDialogue: Dialogue)
        + getOptionText(): String
        + getNextDialogue(): Dialogue
        + setNextDialogue(nextDialogue: Dialogue): void
    }

    Equipment --|> Weapon
    class Weapon {
        - damage: int
        + newWeapon(name: String, value: int, damage: int)
        + getDamage(): int
    }
    
    Item --|> Equipment
    class Equipment {
        - levelRequirement: int
        + equip(): void
        + canEquip(): boolean
    }

    class Inventory {
        - items: List
        + addItem(item: Item): void
        + removeItem(item: Item): void
        + viewItemsByType(type: String): List
    }

    NPC <|-- Merchant
    class Merchant {
        - stock: List
        + buyItem(buyer: Character, item: Item, quantity: int): boolean
        + sellItem(seller: Character, item: Item, quantity: int): boolean
        # setPrices(item: Item, newPrice: float): void
        # restockItems(): void
    }
    
    class GameObject {
        - name: String
        - desc: String
        + getName(): String
        + getDesc(): String
    }
    
    Character <|-- NPC
    class NPC {
        - quests: List
        + giveQuest(character: Character): void
    }
