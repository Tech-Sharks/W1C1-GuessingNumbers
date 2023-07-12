import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        int secretNumber;
        int guess;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // TODO: Generate a random number between 1 and 100 and assign it to the secretNumber variable

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess the number?\n");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            // TODO: Provide feedback to the user based on their guess
            // - If the guess is correct, print a winning message and the number of attempts
            // - If the guess is too low, print a message indicating it's too low
            // - If the guess is too high, print a message indicating it's too high

        } while (guess != <secretNumber>);

        // TODO: Print a message displaying the number of attempts it took to guess correctly

        scanner.close();
    }
}

