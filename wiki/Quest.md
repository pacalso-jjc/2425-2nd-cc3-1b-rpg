# Main Quest


# Sub Quest
1. "Grandfather's Hammer"
Quest Type: Find/Collect  
Description: Baelin the Fisherman speaks of his grandfather, who was once a blacksmith. He lost his grandfather's hammer around his tool shed and asks you to find it for him.  
Rewards:  
- Väinämöinen’s Fishing Rod  
- +2 Pike Fish (Raw)  

---

2. "The Lost Epic"
Quest Type: Listen  
Description: The great poet Homer has forgotten the ending of one of his epics. He asks you to recite any tale of heroism to help him remember.  
Rewards:  
- 2 Pieces of Parchment  
- A fragment of an ancient poem:  
  > "Upon the wine-dark sea he sailed, alone,  
  > Where silver mist entwined the oar’s lament.  
  > Beyond the isles where dawn’s first embers shone,  
  > To lands where gods and mortals never went."  
```mermaid
flowchart TD
    0[Quest Dialogue Tree >>]
    A[Quest Start]
    A --> B["Homer: 'Ah, traveler! I am Homer, and I've... misplaced the ending of one of my epics. The verses slip through my mind like water. Could you recite a tale of heroism? Perhaps it will stir my memory.'"]
    B --> C["Player: 'Of course! I'll help.'"]
    B --> D["Player: 'What's in it for me?'"]
    C --> E["Homer: 'The gods bless you! Any tale of bravery or daring--let the muses guide your words.'"]
    D --> F["Homer (sighs): 'Very well. For your aid, I'll part with two blank parchments from my satchel... and perhaps a fragment of verse, if inspiration strikes. Now, the tale!'"]
    E --> G[Recite the Tale]
    F --> G
    G --> H["Homer: 'Speak, then. Let your words paint heroes!'"]
    H --> I["Option A: 'A warrior's triumph in battle: clashing shields, a fallen tyrant, and a city saved.'"]
    H --> J["Option B: 'A cunning thief's deception: outwitting a god to steal fire for mortals.'"]
    H --> K["Option C: 'A perilous voyage across the sea: a lone hero battling storms and sirens.'"]
    K -- Correct Choice --> L["Homer (eyes widen): 'YES! The wine-dark sea... the mist... the oars... The memory returns! Here, take these as thanks.' Rewards: 2 Parchments + Poem Fragment. Quest Complete."]
    I -- Incorrect --> M["Homer (frowns): 'A fine tale, but not the one. Wait... I think it involved the sea. Something about a lone journey...'"]
    J -- Incorrect --> X["Homer (raises an eyebrow): 'A clever tale of thievery indeed, but where is the salt and storm? Your words lack the brine of the sea.'"]
    M --> N["Homer: 'Let's try again. Which tale speaks of the sea?'"]
    X --> N
    N --> O["Option A: 'A warrior's triumph in battle...'"]
    N --> P["Option B: 'A cunning thief's deception...'"]
    N --> Q["Option C: 'A perilous voyage across the wine-dark sea...'"]
    Q -- Correct Choice --> R["Homer (nods vigorously): 'Yes! The wine-dark sea... silver mist... the isles where dawn's embers shone! The verses flood back! Take these, friend.' Rewards: 2 Parchments + Poem Fragment. Quest Complete."]
    O -- Incorrect --> S["Homer (groans): 'No, no--it's the sea! Let me... Ah! The ending comes to me now. Here, your reward.' Rewards: 2 Parchments + Poem Fragment. Quest Complete."]
    P -- Incorrect --> S
    L --> Z
    R --> Z
    S --> Z
    Z[Quest Complete]

```

---

3. "A Lover’s Regret"
Quest Type: Collect  
Description: Paris, tormented by guilt, seeks a single red rose from [location TBD] to place on Helen’s grave.  
Rewards:  
- "The Heelpiercer" – Paris' bow, which he used to kill Achilles  
- Fire Resistant Condom  
```mermaid
  flowchart TD
    0[Quest Dialogue Tree >>]
    
    A[Start: Speak to Paris] --> B["Paris: 'Helen… My love… My greatest joy, and my deepest regret.'"]
    B --> C["Paris: 'I failed her. And now, I must make amends.'"]
    C --> D["Paris: 'Will you help me?'"]
    
    D --> E["Accept Quest"]
    D --> F["Decline Quest"]
    
    E --> G["Paris: 'A single red rose… from [location TBD].'"]
    G --> H["Paris: 'When our hearts became one, we were surrounded by them.'"]
    H --> I["Paris: 'Now, only ashes remain. I will place one on her grave, so that she is not alone.'"]
    
    I --> J["Speak to Paris again (without the rose)"]
    I --> K["Speak to Paris again (with the rose in hand)"]
    
    J --> L["Paris: 'You have not found the rose yet?'"]
    L --> M["Paris: 'It must be perfect. A single red rose, untainted.'"]
    M --> N["Paris: 'You will find it in [location TBD]. Only there do the roses still bloom…'"]
    N --> I["Paris: 'Please… return when you have it.'"]
    
    K --> O["Paris: 'You have done what I could not.'"]
    O --> P["Paris: 'For that, you deserve a gift.'"]
    P --> Q["Paris: 'It is all I have left of her.'"]
    
    Q --> R["Paris: 'This is the bow I used to slay Achilles.'"]
    R --> S["Paris: 'The weapon I wielded to strike down warriors… to protect her.'"]
    S --> T["Paris: 'But in the end… no blade, no arrow, no cold enemy took her last breath.'"]
    T --> U["Paris: 'It was the fire of my own hands.'"]
    
    U --> V["[ +The Heelpiercer (Bow) ]"]
    
    V --> W["Inquire: 'How did your wife perish?'"]
    V --> X["Leave"]
    
    W --> Y["Paris: (Sighs) 'The gods are cruel.'"]
    Y --> Z["Paris: 'They let me taste paradise, only to snatch it away in the flames of my own doing.'"]
    
    Z --> AA["Paris: 'It was not war. It was not fate.'"]
    AA --> AB["Paris: 'It was me.'"]
    
    AB --> AC["Paris: 'We were together, as lovers are…'"]
    AC --> AD["Paris: 'She whispered my name, and I held her close.'"]
    AD --> AE["Paris: 'And then… flames.'"]
    
    AE --> AF["Paris: 'She screamed. I thought it was passion.'"]
    AF --> AG["Paris: 'But no, it was pain.'"]
    AG --> AH["Paris: 'The heat—I didn't realize—my love, my curse…'"]
    
    AH --> AI["Paris: 'I had it all along… this damned thing.'"]
    AI --> AJ["Paris: 'If only I had worn it that night…'"]
    
    AJ --> AK["(He shoves a small red packet into your hands.)"]
    
    AK --> AL["[ +Fire Resistant Condom ]"]
    
    AL --> AM[QUEST COMPLETE]
    X --> AM[QUEST COMPLETE]
    
    F --> AN["Paris: 'I understand… Some wounds cannot be mended.'"]
    AN --> AO["Paris: 'But… the guilt is still burning inside me. I must try.'"]
    
    AO --> AP[Quest remains available]

```
---

4. "The Pope’s Sin"
Quest Type: Riddle  
Description: A sinful, forgotten pope, Benedict IX, who sold the Papacy for gold, is cursed to speak only in riddles. Solve his puzzle about Heaven and Hell to uncover a hidden path.  
Rewards:  
- Access to a secret passage  
- One bottle of wine  
- A basket of fish and bread  
```mermaid
  flowchart TD
      0[Quest Dialogue Tree >>]
      A[Start: Speak to Benedict IX] --> B["Pope: 'Hell’s chains break where angels tread, Yet none can hold what saints have bled. What shines in dark but needs no thread?'"]
      B --> C["Answer 1: 'Grace'"]
      B --> D["Answer 2: 'Gold'"]
      B --> E["Answer 3: 'Stars'"]
      
      C --> F["Pope: 'Ah, you speak with wisdom. Grace is the light that banishes all shadows.' (The tomb rumbles, revealing a hidden passage. For a moment, Benedict IX lingers.)"]
      
      F --> I["Inquire: 'What led to your downfall?'"]
      I --> K["Pope: 'My greed cost me my crown and soul, swallowed by glittering gold.' (His voice is heavy with regret.)"] --> J
      
      F --> J["Inquire: 'Explain the feast and the wine.'"]
      J --> L["Pope: 'Take this humble feast. But beware, traveler: the secret passage beyond is treacherous, and its darkness tests all who enter.' [ +Wine, Basket of fish & bread ]"]
      
      L --> M[Secret Passage Unlocked]
      M --> N[QUEST COMPLETE]
      
      D --> O["Pope: 'Gold? Foolish traveler! May your avarice be your undoing.' (Benedict IX flicks you on the forehead. You lose 1 HP.)"] --> B
      E --> P["Pope: 'Stars? Mere flickers in the void! Seek the truth that burns within, not the distant glimmers above.' (The ground shakes in disapproval. Try again.)"] --> B

```
---

5. "A Feast for the Damned"
Quest Type: Collect  
Description: Marie Antoinette, wallowing in filth and regret, asks you to bring her a single piece of real bread to prove that excess is no longer her fate.  
Rewards:  
- "Humble Crumb" – An item that restores HP when used, but only once per day.

---

6. "Blood of the Battlefield"
Quest Type: Collect  
Description: The legendary general Sun Tzu asks you to retrieve the bloodied blade of his fallen warrior to prove that wisdom can outlast war.  
Rewards:  
- A small clay figure that looks like a miniature version of a soldier from the Terracotta Army  
- A bag of Jade Tea leaves  

---

7. "The Emperor’s Gambit"
Quest Type: Kill  
Description: Frederick II, imprisoned in [location TBD] for heresy, demands you slay a demonic inquisitor who betrayed him.  
Rewards:  
- "The Atheist’s Dagger" – A dagger that represents Frederick II's defiance of religious authority (Deals extra damage to Holy Warriors)  

---

8. "The Unseen Chains"
Quest Type: Listen  
Description: The philosopher Hypatia speaks of knowledge lost to time. Listen to her tale, and she will grant you insight into hidden truths.  
Rewards:  
- 5 minutes of wasted time, but you have now learned about [knowledge TBD]. Congratulations, you have new conversational topics!  

---

9. "A Flatterer’s Curse"
Quest Type: Collect  
Description: Thais, condemned for flattery, needs you to bring her a mirror so she can see the filth she’s covered in.  
Rewards:  
- "Magic Mirror" – You don't know how it's magical, but on the back, it's engraved with "Made by Re-Logic."  

---

10. "Betrayer’s Blade"
Quest Type: Kill  
Description: Mordred, frozen in ice, begs you to shatter the sword that once struck down King Arthur.  
Rewards:  
- Nothing. He laughs at you, saying that he's a treacherous bastard and asks why you trusted him to give you a reward. He’s also still frozen in ice…
=======
## Sample quest

### **Quest: The Missing Heirloom**

**Objective:**
A villager has lost a valuable family heirloom in the nearby forest. The player is asked to retrieve it.

**Quest Start:**
- **NPC**: “I’ve lost a precious heirloom in the forest. It’s a locket that belonged to my grandmother. Can you help me find it?”

**Steps:**
1. **Explore the Forest**: The player must navigate through the forest to find the locket.
2. **Solve a Puzzle**: The locket is hidden under a tree stump, which has a riddle inscribed on it.
   - **Riddle**: “I can be cracked, made, told, and played. What am I?” (Answer: A joke)
3. **Find the Locket**: After solving the riddle, the player finds the locket.

**Completion:**
- **NPC**: “Thank you so much! You’ve returned the heirloom. Here’s a reward of 50 gold coins and my deepest gratitude.”

**Outcome:**
- Player receives 50 gold coins and a boost in reputation with the village.


# Sub Quest

