package view;

public class GameView {

    public void gameDisplay(int guess, int attempts, String state) {
        switch (state) {
            case "higher":
                System.out.printf("Attempt %d: %d - Your guess is too low! Try higher.%n", attempts, guess);
                break;
            case "lower":
                System.out.printf("Attempt %d: %d - Your guess is too high! Try lower.%n", attempts, guess);
                break;
            case "win":
                System.out.printf("Congratulations! Attempt %d: %d - You guessed it right!%n", attempts, guess);
                break;
        }
    }
}
