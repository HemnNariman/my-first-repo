import java.util.Scanner;

public class ArrayUserData {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String[] foods;
    int size;

    System.out.print("What # of food do you want?: ");

    size = scanner.nextInt();

    scanner.nextLine();

    foods = new String[size];

    for (int i = 0; i < foods.length; i++) {
      System.out.print("Enter your food: ");
      foods[i] = scanner.nextLine();
    }

    for (String food : foods) {
      System.out.println(food);
    }

    scanner.close();
  }
}