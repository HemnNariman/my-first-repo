import java.util.Scanner;

public class MinMaxInputTracker {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double min = 0;
    double max = 0;
    int loopCounter = 0;

    while (true) {
      System.out.println("Enter a number, or any character to exit:");
      String nextEntry = scanner.nextLine();
      try {
        double validNum = Double.parseDouble(nextEntry);
        if (loopCounter == 0 || validNum < min) {
          min = validNum;
        }
        if (loopCounter == 0 || validNum > max) {
          max = validNum;
        }
        loopCounter++;

      } catch (NumberFormatException e) {
        break;
      }
    }
    if (loopCounter > 0) {
      System.out.println("Minimum value entered: " + min);
      System.out.println("Maximum value entered: " + max);
    } else {
      System.out.println("No valid numbers were entered.");
    }
  }

}
