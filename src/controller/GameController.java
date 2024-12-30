package controller;

import model.GameModel;
import view.GameView;
import java.util.Scanner;

public class GameController {

    private GameModel model;
    private GameView view;
    private Scanner scanner;

    public GameController(GameModel model, GameView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Welcome to the Game!");
            model.setGoal((int) (Math.random() * 101));
            model.setAttempts(0);

            while (!model.isGuessCorrect()) {
                System.out.print("Enter your guess (0-100) or type 'exit' to quit: ");
                String input = scanner.nextLine().trim().toLowerCase();

                if ("exit".equals(input)) {
                    System.out.println("Thank you for playing!");
                    return;
                }

                try {
                    int guess = Integer.parseInt(input);
                    if (guess < 0 || guess > 100) {
                        System.out.println("Please enter a number between 0 and 100.");
                        continue;
                    }
                    model.setGuess(guess);
                    model.incrementAttempts();

                    String feedback = model.provideFeedback();
                    view.gameDisplay(model.getGuess(), model.getAttempts(), feedback);

                    if ("win".equals(feedback)) {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a valid number or 'exit' to quit.");
                }
            }

            System.out.println("Would you like to play again? (yes/no)");
            String response = scanner.nextLine().trim().toLowerCase();

            if ("no".equals(response)) {
                break;
            }
        }
    }
}