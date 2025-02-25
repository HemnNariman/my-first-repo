import java.util.Scanner;

public class militaryHours {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter hours: (military hours, 0-23): ");
    int hours = scanner.nextInt();

    String hoursIs = (hours < 12) ? "A.M" : "P.M";
    System.out.print("it is: " + hours + " " + hoursIs);

    scanner.close();

  }
}