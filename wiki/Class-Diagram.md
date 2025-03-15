```mermaid
---
    title: Fantasy RPG
---
classDiagram

    NPC <|-- Charater
    class NPC{
        - quest:List<Quest>
        + giveQuest(character)
    }

```
