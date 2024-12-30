# Java Number Guessing Game

A simple console-based number guessing game implemented in Java using the MVC (Model-View-Controller) design pattern.

## Description

The game generates a random number between 0 and 100. Players must guess the number, receiving feedback after each attempt indicating whether their guess was too high or too low.

## Game Features

- Random number generation
- Feedback on each guess
- Attempt counter
- Option to exit game
- Play again feature

## Project Structure

```
GuessGame/
├── bin/
├── src/
│   ├── model/
│   │   └── GameModel.java
│   ├── view/
│   │   └── GameView.java
│   ├── controller/
│   │   └── GameController.java
│   └── GuessGame.java
├── compile-run.sh
└── README.md

```

## How to Run

1. Clone the repository
2. Make the compile script executable:
   ```bash
   chmod +x compile-run.sh
   ```
3. Run the game:
   ```bash
   ./compile-run.sh
   ```

## Game Controls

- Enter numbers between 0-100 to make a guess
- Type 'exit' to quit the game
- Answer 'yes' or 'no' when asked to play again
