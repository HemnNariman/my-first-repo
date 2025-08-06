import java.util.Scanner;

public class avgSum {
  public static void main(String[] args) {
    inputThenPrintSumAndAverage();
  }

  public static void inputThenPrintSumAndAverage() {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    long avg = 0;
    while (true) {
      System.out.println("Enter an integer (or any non-integer to finish):");
      boolean hasNextInt = scanner.hasNextInt();
      if (!hasNextInt) {
        break;
      }
      sum += scanner.nextInt();
      count++;
      scanner.nextLine();
    }
    if (count > 0) {
      avg = Math.round((double) sum / count);
      System.out.println("Sum = " + sum + ", Average = " + avg);
    }

    scanner.close();
  }
}