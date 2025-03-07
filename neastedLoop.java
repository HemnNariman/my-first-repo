import java.util.Scanner;

public class neastedLoop {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rows;
    int column;
    char symbol;

    System.out.print("Enter # of rows: ");
    rows = scanner.nextInt();

    System.out.print("Enter # of column: ");
    column = scanner.nextInt();

    System.out.print("Enter the symbol to use: ");
    symbol = scanner.next().charAt(0);

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < column; j++) {
        System.out.print(symbol);
      }
      System.out.println();
    }

    scanner.close();
  }
}