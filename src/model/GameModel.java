package model;

public class GameModel {

    private int guess;
    private int goal;
    private int attempts;

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean isGuessCorrect() {
        return guess == goal;
    }

    public void incrementAttempts() {
        this.attempts++;
    }

    public String provideFeedback() {
        if (guess < goal) {
            return "higher";
        } else if (guess > goal) {
            return "lower";
        } else {
            return "win";
        }
    }
}
