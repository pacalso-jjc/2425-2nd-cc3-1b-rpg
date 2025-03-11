```mermaid
---
title:  
---
classDiagram
class Settings {
        +String difficulty
        +bool autoSave
         
        +map<String, String> keyBindings
        +bool invertYAxis
        +saveSettings()
        +loadSettings()
        +applySettings()
    }
```