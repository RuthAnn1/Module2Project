/**
 * @author Ruth Ann
 *
 */
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    private int randomNumber;
    private Scanner scanner;

    public RandomNumber() {
        Random random = new Random();
        randomNumber = random.nextInt(10) + 1;
        scanner = new Scanner(System.in);
    }

    public String checkGuess(int userGuess) {
        if (userGuess == randomNumber) {
            return "Yay you won!!!!";
        } else if (userGuess < randomNumber) {
            return "Oh no!!! Your guess is too low. Guess a higher number";
        } else {
            return "Uh oh! Your number is too high. Guess a lower number";
        }
    }

    public int getCorrectNumber() {
        return randomNumber;
    }

    public void closeScanner() {
        scanner.close();
    }

    public void playGame() {
        System.out.println("Welcome to the number guessing game!");
        System.out.println("I have selected a random number between 1 and 10");

        while (true) {
            System.out.println("Enter your guess:");
            int playerGuess = scanner.nextInt();
            if (playerGuess == randomNumber) {
                System.out.println("Yay you won!!!!");
                break;
            } else if (playerGuess < randomNumber) {
                System.out.println("Oh no!!! Your guess is too low. Guess a higher number");
            } else {
                System.out.println("Uh oh! Your number is too high. Guess a lower number");
            }
        }

        closeScanner();
    }

    public static void main(String[] args) {
        RandomNumber game = new RandomNumber();
        game.playGame();
    }
}

