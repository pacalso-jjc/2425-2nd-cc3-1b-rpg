```mermaid
---
title: Fantasy RPG
---
classDiagram  
    class Entity{
      - name: String
      - exp: int
      - hp: int
      - mana: int
      - stamina: int
      - constitution: int
      - strength: int
      - defense: int
      - stat: String
      - skills: String
      - inventory: List<Item>
      - equipments: List<Item>
      + attack(Entity) void
      + takeDamage(amountOfDamage) void
      + isAlive ()boolean
      + makeSound() void
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

    class MergeConflictTest{

    }
```