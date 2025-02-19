

import java.util.Scanner;

public class Days {

  public static void main(String[] args) {

    Scanner day = new Scanner(System.in);

    System.out.println("Enter a day of the week based one numbers 1 to 7");

    int Week = day.nextInt();

    switch (Week) {

      case 1:

        System.out.println("Saturday");

        break;
      case 2:

        System.out.println("Sunday");
        break;
      case 3:
        System.out.println("Monday");
        break;

      case 4:

        System.out.println("Tuesday");
        break;

      case 5:
        System.out.println("Wednesday");
        break;

      case 6:
        System.out.println("Thursday");
        break;
      case 7:
        System.out.println("Friday");
        break;
      default:
        System.out.println("not a day in the week");
        break;

    }

    day.close();
  }

}
