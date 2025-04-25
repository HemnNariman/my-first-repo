import java.util.Scanner;

public class RectanglePrinter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask user for rows and columns
    System.out.print("Enter number of rows: ");
    int rows = input.nextInt();

    System.out.print("Enter number of columns: ");
    int columns = input.nextInt();

    // Print the rectangle
    for (int i = 1; i <= rows; i++) {
      for (int j = 1; j <= columns; j++) {
        System.out.print("* ");
      }
      System.out.println(); // Move to next line after each row
    }

    input.close();
  }
}
