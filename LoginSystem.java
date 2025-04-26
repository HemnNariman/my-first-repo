import java.util.Scanner;

public class LoginSystem {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String correctUsername = "admin";
    String correctPassword = "1234";
    int attempts = 3;

    while (attempts > 0) {
      System.out.print("Enter username: ");
      String username = input.nextLine();

      System.out.print("Enter password: ");
      String password = input.nextLine();

      if (username.equals(correctUsername) && password.equals(correctPassword)) {
        System.out.println("Login successful!");
        break; // Exit the loop if login is successful
      } else {
        attempts--;
        System.out.println("Incorrect username or password. Attempts left: " + attempts);
      }
    }

    if (attempts == 0) {
      System.out.println("Access denied. No attempts left.");
    }

    input.close();
  }
}
