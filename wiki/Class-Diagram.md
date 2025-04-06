classDiagram

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

    class GameObject {
        - name: String
        - desc: String
        + getName(): String
        + getDesc(): String
    }

    GameObject --|> Entity
    class Entity {
        - exp: int
        - maxHp: int
        - maxMana: int
        - maxStamina: int
        - currentHp: int
        - currentMana: int
        - currentStamina: int
        - stats: Statistic
        - skills: List~Skill~
        - inventory: Inventory
        - equipments: List~Item~
        + attack(Entity e): void
        + takeDamage(int amountOfDamage): void
        + isAlive (): boolean
        + makeSound(): void
        + getExp() : int
        + setExp(int exp): void
        + getMaxHp(): int
        + setMaxHp(int maxHp): void
        + getMaxMana(): int
        + setMaxMana(int maxMana): void
        + getMaxStamina(): int
        + setMaxStamina(int maxStamina): void
        + getCurrentHp(): int
        + setCurrentHp(int currentHp): void
        + getCurrentMana(): int
        + setCurrentMana(int currentMana): void
        + getCurrentStamina(): int
        + setCurrentStamina(int currentStamina): void
        + getStats(): Statistic
        + setStats(Statistic stats): void
        + getSkills(): List~Skill~
        + setSkills(List~Skill~ skills): void
        + getInventory(): Inventory
        + setInventory(Inventory inventory): void
        + getEquipments(): List~Item~
        + setEquipments(List~Item~ equipments): void
    }

    class Item {
        - name: String
        - description: String
        - rarity: int
        - value: int
        - quantity: int  
    }

    class Material {
        - isCraftingMaterial: boolean
        - craftingUsage: String
        - materialType: String
        - source: String
    }

    class Consumable {
        - effect: String
        - amountToRegenerate: int
        + setEffect(effect: String): void
        + setAmountToRegenerate(amount: int): void
        + getEffect(): String
        + getAmountToRegenerate(): int
    }

    class Equipment {
        - levelRequirement: int
        + equip(): void
        + canEquip(): boolean
    }

    class Armor {
        - defense: int
    }

    class Weapon {
        - damage: int
        + newWeapon(name: String, value: int, damage: int)
        + getDamage(): int
    }

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

    class Quest {
        - questName: string
        - questDescription: string
        - type: QuestType
        - rewards: List
        - isCompleted: boolean
        - itemRewards: List~Item~
        - goldReward: int
        + isQuestCompleted(): boolean
        + getDescription(): String
        + getRewards(): List
        + getQuestType(): QuestType
    }

    class Inventory {
        - items: List
        + addItem(item: Item): void
        + removeItem(item: Item): void
        + viewItemsByType(type: String): List
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

    class DialogueTree {
        - dialogue: Dialogue
        + start(): void
    }

    class Dialogue {
        - text: String
        - options: List
        - nextDialogues: List
        + getText(): String
        + getOptions(): List
        + getNextDialogue(index: int): Dialogue
    }

    class DialogueOption {
        - optionText: String
        - nextDialogue: Dialogue
        + newDialogueOption(optionText: String, nextDialogue: Dialogue)
        + getOptionText(): String
        + getNextDialogue(): Dialogue
        + setNextDialogue(nextDialogue: Dialogue): void
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

    class NPC {
        - quests: List
        + giveQuest(character: Character): void
    }

    class Merchant {
        - stock: List
        + buyItem(buyer: Character, item: Item, quantity: int): boolean
        + sellItem(seller: Character, item: Item, quantity: int): boolean
        # setPrices(item: Item, newPrice: float): void
        # restockItems(): void
    }

    Item --|> Material
    Item --|> Consumable
    Item --|> Equipment
    Equipment --|> Armor
    Equipment --|> Weapon
    GameObject --|> Item
    Dialogue *-- DialogueTree
    DialogueOption *-- Dialogue
    Entity o-- Statistic
    NPC <|-- Character
    Character <|-- NPC
    NPC <|-- Merchant
