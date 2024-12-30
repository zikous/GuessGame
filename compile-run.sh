#!/bin/bash

# Create bin directory if it doesn't exist
mkdir -p bin

# Compile the Java files
echo "Compiling Java files..."
javac -d bin src/model/GameModel.java src/view/GameView.java src/controller/GameController.java src/GuessGame.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "Running the game..."
    # Run the program
    java -cp bin GuessGame
else
    echo "Compilation failed!"
    exit 1
fi