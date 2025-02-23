import java.util.Scanner;

public class compoundInterestCalculator {

  public static void main(String[] args) {

    // Compound interest calculator
    Scanner scanner = new Scanner(System.in);

    double principle;
    double rate;
    int timesCompound;
    int years;
    double amount;

    System.out.print("Enter the amount of principle : ");
    principle = scanner.nextDouble();

    System.out.print("Enter the rate (in %): ");
    rate = scanner.nextDouble() / 100;

    System.out.print("Enter the times compounding: ");
    timesCompound = scanner.nextInt();

    System.out.print("Enter the years: ");
    years = scanner.nextInt();

    amount = principle * Math.pow(1 + rate / timesCompound, years * timesCompound);

    System.out.printf("the amount after %d years is $%.2f", years, amount);
  }

}