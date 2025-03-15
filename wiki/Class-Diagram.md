```mermaid
---
    title: Fantasy RPG
---
classDiagram

    NPC <|-- Character
    class NPC{
        - quest:List<Quest>
        + giveQuest(character)
    }
    

```
