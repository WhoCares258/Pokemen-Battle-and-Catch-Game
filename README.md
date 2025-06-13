# Pokemon Battle and Catch Game

## 🎮 Overview

Welcome to the Pokemon Battle and Catch Game! This is a text-based adventure where you, as a Pokemon trainer, embark on a journey through various regions. Your goal is to battle wild Pokemon, catch new companions, and become the top trainer by achieving the highest score.

## ✨ Features

*   **Explore Multiple Regions**: Journey through 5 distinct regions: Kanto, Johto, Hoenn, Sinnoh, and Unova. Each region has unique Pokemon to encounter.
*   **Choose Your Starters**: Strategically select your initial team of Pokemon to begin your adventure.
*   **Dynamic 2v2 Battles**: Engage in exciting 2v2 Pokemon battles.
*   **Turn-Based Combat**: Plan your moves carefully in a turn-based battle system where speed and strategy matter.
*   **Catch 'Em All (Almost!)**: Defeat wild Pokemon and get a chance to catch them using different types of Pokeballs (Pokeball, Greatball, Ultraball, Masterball).
*   **Team Management**: Manage your team of up to 3 Pokemon. Decide which Pokemon to send into battle and which ones to replace when you catch a new one.
*   **Scoring System**: Earn points for dealing damage and defeating Pokemon. Aim for the high score!
*   **Progressive Challenge**: Battle through 5 rounds in each region. If you conquer a region, you can choose to move to the next or end your journey.

## 🚀 How to Play

1.  **Compile and Run**:
    *   Ensure you have a Java Development Kit (JDK) installed.
    *   Compile the `Main.java` file along with any other necessary class files (e.g., `Pokemon.java`, `Player.java`, `Region.java`, `Attack.java`, `Catch.java`, `ScoreManager.java`, `WildPokemon.java`).
        ```shell
        javac game/Main.java game/Pokemon.java game/Player.java game/Region.java game/Attack.java game/Catch.java game/ScoreManager.java game/WildPokemon.java
        ```
    *   Run the game from the directory containing the `game` package:
        ```shell
        java game.Main
        ```

2.  **Game Start**:
    *   The game will welcome you and ask for your name.
    *   Enter your name to begin.

3.  **Region Selection**:
    *   You'll be prompted to choose one of the 5 available regions. Type the name of the region you wish to explore.

4.  **Starter Pokemon**:
    *   You will be presented with sets of Pokemon. Choose one Pokemon from each set to build your initial team of three.

5.  **Battling**:
    *   You will face 2 wild Pokemon in each battle round.
    *   Select two of your Pokemon to send into battle.
    *   Follow the prompts to choose which enemy Pokemon your active Pokemon will attack.
    *   Pokemon with higher speed stats attack first.
    *   Reduce the opponent's HP to zero to defeat them.
    *   If all your Pokemon faint, it's game over.

6.  **Catching Pokemon**:
    *   After winning a battle, if you have Pokeballs, you'll have the option to catch one of the defeated wild Pokemon.
    *   Choose the Pokemon you want to catch and the Pokeball you want to use.
    *   If your team is full (3 Pokemon), you'll be asked to replace one of your current Pokemon.

7.  **Scoring and Progression**:
    *   Earn points for your performance in battles.
    *   After 5 battle rounds in a region, your score will be tallied. You can then choose to continue to another region or end the game.
    *   The game keeps track of top scores.

## 🗺️ Regions Available

*   Kanto
*   Johto
*   Hoenn
*   Sinnoh
*   Unova

## ⌨️ Controls

*   All interactions are done by typing commands into the console and pressing Enter, as prompted by the game.

Good luck, Trainer!
