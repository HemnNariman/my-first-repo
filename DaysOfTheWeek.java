import java.util.Scanner;

public class DaysOfTheWeek {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the day of the week: ");
    String day = scanner.nextLine();

    switch (day) {

      case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
        System.out.print("It is a weekday 😭");

      case "Saturday", "Sunday" ->
        System.out.print("It is a weekend 😎");

      default ->
        System.out.print(day + " is not a day 🥸☝️");



      // longer version:
      /*
       * case "Monday"-> System.out.println("It is a weekday 😫");
       * case "Tuesday"-> System.out.println("It is a weekday 😫");
       * case "Wednesday"-> System.out.println("It is a weekday 😫");
       * case "Thursday"-> System.out.println("It is a weekday 😫");
       * case "Friday"-> System.out.println("It is a weekday 😫");
       * case "Saturday"-> System.out.println("It is a weekend 😁");
       * case "Sunday"-> System.out.println("It is a weekend 😁");
       * default -> System.out.println(day + " is not a day 🥸☝️");
       */

      
    }
    scanner.close();
  }

}
