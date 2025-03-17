```mermaid
---
title: Mercenary Diagram
---

classDiagram
direction TB
    class Character {
        -String name
        -int level
        -int health
        -int attackPower
        -int defense
        -String status
        +attack()
        +defend()
    }
    
    class Mercenary {
        -int goldCost
    }

    Mercenary --|> Character