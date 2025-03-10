```mermaid
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
        + Game()
        + start()
        + loadGame()
        + exitGame()
        + main(String[] args)
    }
```
