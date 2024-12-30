#!/bin/bash

# Create bin directory if it doesn't exist
mkdir -p bin

# Function for colored output
function print_info() {
    echo -e "\e[32m$1\e[0m"  # Green color for informational messages
}

function print_error() {
    echo -e "\e[31m$1\e[0m"  # Red color for error messages
}

# Compile the Java files
print_info "================================================================================================================="
print_info "Compiling Java files..."
javac -d bin -sourcepath src src/model/GameModel.java src/view/GameView.java src/controller/GameController.java src/GuessGame.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    print_info "Compilation successful!"
    print_info "Running the game..."
    print_info "================================================================================================================="
    # Run the program
    java -cp bin GuessGame
else
    print_error "Compilation failed!"
    exit 1
fi
