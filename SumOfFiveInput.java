import java.util.Scanner;

public class SumOfFiveInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int counter = 1;
    double sum = 0;

    do {

      System.out.println("Enter number #" + counter + ":");
      String nextNumber = scanner.nextLine();
      double number = Double.parseDouble(nextNumber);
      sum += number;
      counter++;

    } while (counter <= 5);
    System.out.println("The sum of the five numbers is: " + sum);
    scanner.close();
  }
}
// This code takes five numbers as input from the user and calculates their sum.