import java.util.Scanner;

public class Calc {

  public static void main(String[] args) {

    Scanner Calc = new Scanner(System.in);

    System.out.println("Enter first number: ");

    double num1 = Calc.nextDouble();

    System.out.println("Enter one of these operators (+,-,/,*,%)");

    char op = Calc.next().charAt(0);

    System.out.println("Enter your second number: ");

    double num2 = Calc.nextDouble();

    switch (op) {
      case '+':
        System.out.println("the result is: " + (num1 + num2));
        break;
      case '-':
        System.out.println("the result is: " + (num1 - num2));
        break;
      case '*':
        System.out.println("the result is: " + (num1 * num2));
        break;
      case '/':
        if (num2 == 0) {
          System.out.println("Error: Division by zero is not allowed.");
        } else {
          System.out.println("the result is: " + (num1 / num2));
        }
        break;
      case '%':
        if (num2 == 0) {
          System.out.println("Error: Modulus by zero is not allowed.");
        } else {
          System.out.println("the result is: " + (num1 % num2));
        }
        break;

      default:
        System.out.println("Enter only these operators (+,-,/,*,%)");

    }

    Calc.close();

  }

}
