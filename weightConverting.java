import java.util.Scanner;

public class weightConverting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // weight convertion program
    double weight;
    double newWeight;
    double choice;

    System.out.println("Welcome to the weight converting program");
    System.out.println("1: convert from lbs to kgs");
    System.out.println("2: convert from kgs to lbs");

    System.out.println("Enter your choice:");
    choice = scanner.nextDouble();

    if (choice == 1) {
      System.out.println("Enter the weight in lbs:");
      weight = scanner.nextDouble();
      newWeight = weight * 0.453592;
      System.out.printf("The weight in kgs is: %.2f\n", newWeight);
    } else if (choice == 2) {
      System.out.println("Enter the weight in kgs:");
      weight = scanner.nextDouble();
      newWeight = weight * 2.20462;
      System.out.printf("The weight in lbs is: %.2f\n", newWeight);
    } else {
      System.out.println("Invaild choice, please enter 1 or 2");
    }

    scanner.close();

  }

}
