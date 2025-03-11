---
    title: Fantasy RPG
---
classDiagram
    NPC <|-- Entity
    class NPC{
        - quest:List<Quest>
        + giveQuest(character)
    }
