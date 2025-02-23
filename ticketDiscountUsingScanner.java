import java.util.Scanner;

public class ticketDiscountUsingScanner {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("are you student ? (true/false): ");
    boolean isStudent;
    isStudent = scanner.nextBoolean();

    System.out.print("are you senior ? (true/false): ");
    boolean isSenior;
    isSenior = scanner.nextBoolean();

    System.out.print("Enter the price of your ticket please: ");
    double price;
    price = scanner.nextDouble();

    if (isStudent) {
      if (isSenior) {
        System.out.println("you will get 10% discount because you are student");
        System.out.println("you will get 20% discount because you are senior");
        price *= 0.7;

      } else {
        System.out.println("you will get 10% discount because you are student");
        price *= 0.9;
      }

    } else {
      if (isSenior) {
        System.out.println("you will get 20% discount because you are senior");
        price *= 0.8;
      } else {
        price *= 1;
      }

    }

    System.out.printf("the ticket price are $%.2f", price);
    scanner.close();

  }

}