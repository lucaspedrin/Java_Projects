import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME //

        // Initializing the Scanner object to read user input.
        Scanner scanner = new Scanner(System.in);

        // Initializing the Random object to generate random numbers.
        Random random = new Random();

        // Declaring variables.
        int randNum, guess, attempts = 0;

        // Generating a random number.
        randNum = random.nextInt(1, 101);

        // Introducing the program.
        System.out.println("Number Guessing Game!");
        System.out.println("Guess a number between 1-100");

        do {
            // Asking for a guess.
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();

            // Providing hints based on the accuracy of the guess.
            if (guess < randNum) {
                System.out.println("TOO LOW! Try again!");
            } else if (guess > randNum) {
                System.out.println("TOO HIGH! Try again!");
            }

            attempts++; // Registering one more attempt each time loop runs.
        } while (guess != randNum); // Repeating the loop until the user guesses correctly.

        // Congratulating the user and displaying the number of attempts.
        System.out.printf("\nCongratulations!\nThe number is %d!\n", randNum);
        System.out.println("\nNumber of attempts: " + attempts);

        // Closing the Scanner object to avoid resource leaks.
        scanner.close();
    }
}
