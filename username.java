import java.util.Scanner;

public class username {
  public static void main(String[] args) {
    // username must be between 4-12 characters
    // username must not contain spaces or underscores

    Scanner scanner = new Scanner(System.in);
    String username;

    System.out.print("Enter your new username: ");
    username = scanner.nextLine();

    if (username.length() < 4 || username.length() > 12) {
      System.out.println("Username must be between 4-12 characters");
    } else if (username.contains(" ") || username.contains("_")) {
      System.out.println("Username must not contain spaces and underscore");
    } else {
      System.out.println("Welcome " + username);
    }
    scanner.close();
  }
}