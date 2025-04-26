import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter number of rows: ");
    int rows = scanner.nextInt();

    System.out.println("Enter number of columns: ");
    int columns = scanner.nextInt();

    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= columns; j++) {
        // Print '*' for first/last row OR first/last column
        if (i == 1 || i == rows || j == 1 || j == columns) {
          System.out.print("* ");
        } else {
          System.out.print("  "); // Two spaces inside
        }
      }
      System.out.println();
    }

    scanner.close();
  }
}
