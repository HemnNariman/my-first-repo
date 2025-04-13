import java.util.Scanner;

public class wallet {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double walletBalance = 1000.0; // starting money in wallet

    System.out.print("Enter amount you want to take: ");
    double amount = scanner.nextDouble();

    double fee = amount * 0.01; // 1% fee
    double totalAmount = amount + fee;

    if (totalAmount > walletBalance) {
      System.out.println("Not enough money in the wallet.");
    } else {
      walletBalance -= totalAmount;
      System.out.println("You took: " + amount);
      System.out.println("Fee taken: " + fee);
      System.out.println("Money left in wallet: " + walletBalance);
    }

    scanner.close();
  }
}
