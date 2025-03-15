# Main Quest


# Sub Quest
1. "Grandfather's Hammer"
Quest Type: Find/Collect  
Description: Baelin the Fisherman speaks of his grandfather, who was once a blacksmith. He lost his grandfather's hammer around his tool shed and asks you to find it for him.  
Rewards:  
- Väinämöinen’s Fishing Rod  
- +2 Pike Fish (Raw)  

```mermaid
    flowchart TD
      0[Quest Dialogue Tree >>]
      A[Start: Speak to Baelin the Fisherman] --> B["Baelin: Mornin nice day for fishin ain't it HUH HA! Adventurer I've lost my grandfather's hammer around here, you see he used it to slay the Dragon of Shmargenrok, I've no clue where I put it. Help me retrace my steps to find my grandfather's hammer and I shall reward you."]
      B --> C["Answer 1: 'Accept'"]
      B --> D["Answer 2: 'Skip'"] --> Z
      
      C --> E["Baelin: 'I know I passed by this pond a while ago, let's take a look around Adventurer.'"]
      E --> F["Answer 1: Look Around for the hammer"]
      E --> G["Answer 2: Stop Looking"]

      F --> H["You pace around the pond and there's nothing here"] --> E

      G --> I["Baelin: Ok adventurer I know I stood over these bushes for a good 5 minutes a while ago, maybe it's here!"]
      I --> J["Answer 1: Look Around for the hammer'"]
      I --> K["Answer 2: Stop Looking"]

      J --> L["You stand over these seemingly symmetrical bushes looking for a hammer. You don't find a hammer but you find a small sphere with a red top, white bottom, and a black horizontal band with a central white button, your not sure what it is but you take it anyway. (+1 MonBall?)"] --> I

      K --> M["Baelin: 'This is the last place I remember being with that hammer. This is the village well, let's look for that hammer!'"]
      M --> N["Answer 1: Look Around for the hammer"]
      M --> O["Answer 2: Stop Looking"]

      N --> P["You look inside the well, you see there's an object on the bottom of the well that might be a hammer. You take a look around to see what can help you reach the object down the well. On a table nearby you find 50 ft of rope, a ladder, a hammer, nails, and a hook."]

      P --> Q["Interaction: Take the rope and hook"]
      P --> R["Interaction: Take the hammer"]

      Q --> T["You take the rope and hook to fish the object out of the well. As you finally lift the object, you realize its an old fishing rod with very intriquite designs. Baelin: 'I'm impressed Adventurer, you found the legendary fishing rod of Väinämöinen, which was said to have been the rod he used to catch ole MobyCock the whale from the depths of the Abyss. Keep it Adventurder you deserve it, now let's keep looking for the hammer' +1 Väinämöinen’s Fishing Rod"]

      T --> U["Interaction: Take the hammer"] --> W
      T --> S["Interaction: Talk to Baelin"]

      R --> V["Interaction: Take the rope and hook"] --> Q
      R --> W["Interaction: Talk to Baelin"]

      S --> X["Baelin: 'Adventurer this is the last place where I remember having my hammer, we have to keep looking for it.'"] --> T

      W --> Y["Baelin: 'OH ADVENTURER! You found it, my grandfather's hammer. At long last I have once again been reunited with family. I will keep a closer eye now on this hammer. Thank you adventurer. Mornin, it's a nice day for fishin ain't it HUH HA!' (+2 Raw Pike)"]
      O --> Z1["Baelin: 'Well guess it will remain lost forever Adventurer'"] --> Z
      Y --> Z[QUEST COMPLETE]
```

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

```mermaid
  flowchart TD
      0[Quest Dialogue Tree >>]
      A[Start: Speak to Marie Antoinette] --> B["Marie: 'Oh deary... I've eaten so much cake '"]
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

6. "Blood of the Battlefield"
Quest Type: Collect  
Description: The legendary general Sun Tzu asks you to retrieve the bloodied blade of his fallen warrior to prove that wisdom can outlast war.  
Rewards:  
- A small clay figure that looks like a miniature version of a soldier from the Terracotta Army  
- A bag of Jade Tea leaves  
```mermaid
flowchart TD
0[Quest Type: Collect]
1st[Quest Start] --> 2nd["Sun Tzu:
'War claims many lives, but wisdom endures beyond the battlefield. A warrior of mine fell here long ago, his blade lost to the ages. Retrieve it, and you will understand the true cost of war.'"]
2nd --> 3rd["Accept"] --> 4th["'I will find this blade and bring it back to you.'"]
2nd --> 11th["Question"] --> 12th["'Why is this blade so important?'"]
2nd --> 16th["Decline"] --> 6th["' I am not interested in relics of war.'"] 
16th --> 17th[Ends the conversation] 

4th --> 5th["Sun tzu: 'Seek the battlefield to the east, where the earth drank the blood of the fallen. The blade is buried among the ruins of war. Return it to me, and you will understand the lesson I teach.'"]

%%{init: {"flowchart": {"htmlLabels": false}} }%%
5th -->6th_quest["`**Quest Objective:**
Travel to the ancient battlefield.
Search through remnants of fallen soldiers.
Find the **Bloodied Blade** and return it to Sun Tzu.`"]
6th_quest --> 7th([Upon returning with the blade]) --> 8th["Sun Tzu: 'You have done well. This blade is heavy, not just with steel, but with the weight of those who carried it. War ends, but wisdom lingers.'"]
8th --> 9th["'Accept Rewards'"] --> 10th["**Rewards Acquired:** _'A small clay figure that looks like a miniature version of a soldier from the Terracotta Army'_ and _'A bag of Jade Tea leaves'_"]
10th --> 20th[QUEST COMPLETED]

12th --> 13th["Sun Tzu: 'This is no ordinary blade. It belonged to one of my finest warriors, a man who believed in strategy over slaughter. His blade was stained in battle, but he wielded it with restraint, only striking when wisdom demanded it.'"]

13th --> 14th["'I see. I will find the blade for you.'"] --> 5th
13th --> 15th["'This seems like a lost cause. I'll pass.'"] --> 17th



```
---

7. "The Emperor’s Gambit"
Quest Type: Kill  
Description: Frederick II, imprisoned in [location TBD] for heresy, demands you slay a demonic inquisitor who betrayed him.  
Rewards:  
- "The Atheist’s Dagger" – A dagger that represents Frederick II's defiance of religious authority (Deals extra damage to Holy Warriors)  
```mermaid
flowchart TD
    0[Quest Dialogue Tree >>]
    A[Start: Speak to Frederick II] --> B["Frederick II: 'You there! I am Frederick II, imprisoned for heresy. A demonic inquisitor betrayed me. Slay them, and I will reward you.'"]
    B --> C["Player: 'I’ll help you. Where can I find this inquisitor?'"]
    B --> D["Player: 'I have no interest in your problems.'"]
    C --> E["Frederick II: 'They reside in the Cathedral of Shadows, east of here. Be warned—they are no mere mortal.'"]
    D --> F["Frederick II: 'Then leave, coward. Your soul is as weak as your resolve.'"]
    E --> G[Travel to Cathedral of Shadows]
    G --> H[Confront Demonic Inquisitor]
    H --> I["Demonic Inquisitor: 'Who dares challenge the will of the Church? Ah, Frederick sent you. Prepare to die!'"]
    I --> J[Combat with Demonic Inquisitor]
    J --> K{Player defeats Demonic Inquisitor}
    K -->|Return to Frederick II| L["Frederick II: 'You’ve done it! Here, take this dagger—it is a symbol of my defiance.'"]
    L --> M[Player receives The Atheist’s Dagger]
    K -->|Do not return| N[Quest remains incomplete]
```
---

8. "The Unseen Chains"
Quest Type: Listen  
Description: The philosopher Hypatia speaks of knowledge lost to time. Listen to her tale, and she will grant you insight into hidden truths.  
Rewards:  
- 5 minutes of wasted time, but you have now learned about [knowledge TBD]. Congratulations, you have new conversational topics!  
```mermaid
flowchart TD
    0[Quest Dialogue Tree >>]
    A[Start: Speak to Hypatia] --> B["Hypatia: 'Ah, traveler. Would you like to hear a tale of knowledge lost to time?'"]
    B --> C["Player: 'Tell me your tale. I’m eager to learn.'"]
    B --> D["Player: 'I don’t have time for stories.'"]
    C --> E["Hypatia: 'Very well. Sit, and listen closely. The chains of ignorance are unseen, but they bind us all.'"]
    D --> F["Hypatia: 'Then you are already bound by the unseen chains. Go, if you must, but know that wisdom waits for no one.'"]
    E --> G[Listen to Hypatia’s Tale]
    G --> H["Hypatia: 'Long ago, in the Library of Alexandria, there was a scroll that held the secrets of the cosmos...'"]
    H --> I["Player: 'What happened to the scroll?'"]
    I --> J["Hypatia: 'Some say it was stolen by those who feared its power. Others believe it was consumed by the flames...'"]
    J --> K["Hypatia: 'Thank you for listening, traveler. Though I cannot give you gold or weapons, I offer you something far greater: the spark of curiosity.'"]
    K --> L[Player gains new conversational topics about lost knowledge]
    L --> M[QUEST COMPLETE]
    F --> N[Quest remains available]
```
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

```mermaid
---
title: Betrayer’s Blade Dialogue Tree
---
flowchart TD
    A["Mordred (frozen in ice): Please... shatter the sword that struck down King Arthur. I beg you - free us from this curse."]
    
    A --> B1["Option 1: I will shatter the sword"]
    A --> B2["Option 2: I don't trust you. You deserve to die!"]
    A --> B3["Option 3: Explain yourself first. Why should I do this?"]
    
    B3 --> C["Mordred: I once wielded that sword in a misguided bid for glory. Its curse has frozen me - I'm trapped in eternal torment. Shattering it might end my misery."]
    C --> D1["Option: Very well, I will shatter the sword"]
    C --> D2["Option: Your words mean nothing. I'll kill you instead"]
    
    D1 --> E["Action: You shatter the sword. It cracks and crumbles in a burst of cursed energy"]
    E --> F["Mordred laughs bitterly - You trusted me to offer a reward, yet I give you nothing. I'm nothing but a treacherous bastard"]
    
    D2 --> G["Combat: You engage Mordred in battle"]
    G --> H["Outcome: Mordred is defeated; his final mocking laugh fades among the ice"]
    
    B1 --> I["Action: Without hesitation, you shatter the sword"]
    I --> J["Result: The blade shatters with a resounding crack. Mordred smirks - I warned you: no reward awaits you here"]
    
    B2 --> K["Combat: You attack Mordred immediately"]
    K --> L["Outcome: Mordred falls, his laughter echoing as the ice remains unbroken"]
    
    F --> M["Final Outcome: The cursed legacy is ended, leaving you with nothing but shattered remains and a bitter reminder of betrayal"]
    J --> M
    H --> M
    L --> M

```
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

