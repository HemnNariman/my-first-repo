import java.util.Scanner;

public class TempConverterBeginner {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double temp;
    double newTemp;
    char unit;

    System.out.print("Enter temperature: ");
    temp = scanner.nextDouble();

    System.out.print("Convert Celsius or Fahrenheit (C° or F°): ");
    unit = scanner.next().toUpperCase().charAt(0);
    newTemp = (unit == 'C') ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;

    System.out.printf("%.1f°%c", newTemp, unit);

    scanner.close();
    
  }
}