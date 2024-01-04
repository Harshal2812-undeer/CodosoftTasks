import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain;

        do {
            int attempts = 0;
            int number = random.nextInt(100) + 1;
            int guess;
            boolean correct = false;

            System.out.println("Guess a number between 1 and 100:");

            while (attempts < 10 && !correct) {
                guess = scanner.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Congratulations! You guessed the number.");
                    correct = true;
                    score += 10 - attempts;
                } else if (guess < number) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (!correct) {
                System.out.println("Sorry, you didn't guess the number. The number was " + number);
            }

            System.out.println("Your score is: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            playAgain = scanner.next();

        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
    }
}
