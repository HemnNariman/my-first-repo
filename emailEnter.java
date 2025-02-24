import java.util.Scanner;

public class emailEnter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String username;
    String domain;
    String email;
    System.out.print("Enter your email :");
    email = scanner.nextLine();

    if (email.contains("@")) {

      System.out.println("Your email is: " + email);
      System.out.println("your username is: " + email.substring(0, email.indexOf("@")));
      System.out.println("your domain is: " + email.substring(email.indexOf("@") + 1));

    } else {
      System.out.println("Invalid email. Please enter a valid email with exactly one '@' and a valid domain.");
    }

    scanner.close();
  }
}