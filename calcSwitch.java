import java.util.Scanner;

public class calcSwitch {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double number1;
    double number2;
    char operator;
    double result = 0;
    boolean validOperation = true;
    System.out.print("Enter the first number: ");
    number1 = scanner.nextDouble();

    System.out.print("Enter one of these operators (+,-,*,/,^,%): ");
    operator = scanner.next().charAt(0);

    System.out.print("Enter the second number: ");
    number2 = scanner.nextDouble();

    switch (operator) {
      case '+' -> result = number1 + number2;
      case '-' -> result = number1 - number2;
      case '*' -> result = number1 * number2;
      case '/' -> {
        if (number2 == 0) {
          System.out.println("Cannot divide by zero!");
          validOperation = false;
        } else {
          result = number1 / number2;
        }
      }
      case '^' -> result = Math.pow(number1, number2);
      case '%' -> result = number1 % number2;
      default -> {
        System.out.println("Invalid operator!");
        validOperation = false;
      }
    }

    if (validOperation) {
      System.out.println("The result is: " + result);
    }

    scanner.close();
  }
}