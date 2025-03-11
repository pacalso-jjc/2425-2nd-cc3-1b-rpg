```mermaid
---
title: Fantasy RPG
---
classDiagram
    Item --|> Material
    class Item{
        - String name
        - String description
        - int rarity
        - int value
        - int quantity
    }

    class Material {
        - isCraftingMaterial: boolean
        - craftingUsage: String
        - materialType: String
        - source: String
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
```