import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
  public static void main(String[] args) {
    // NUMBER GUESSING GAME

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min, max + 1);

    System.out.println("Number Guessing Game");
    System.out.printf("Guess a number between %d-%d:\n", min, max);

    do {
      System.out.print("Enter a guess: ");
      guess = scanner.nextInt();
      attempts++;

      if (guess < randomNumber) {
        System.out.println("TOO LOW! try again");
      } else if (guess > randomNumber) {
        System.out.println("TOO HIGH! try again");
      } else {
        System.out.println("CORRECT! the number was " + randomNumber);
        System.out.println("# of attempts: " + attempts);
      }

    } while (guess != randomNumber);

    scanner.close();
  }
}