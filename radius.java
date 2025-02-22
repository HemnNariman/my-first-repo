import java.util.Scanner;

public class radius {

  public static void main(String[] args) {
    // circumference = 2 * Math.PI * radius;
    // area = Math.PI * Math.pow(radius , 2);
    // volume = (4.0/3.0)*Math.PI * Math.pow(radius,3);

    double radius;
    double circumference;
    double area;
    double volume;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Radius: ");
    radius = scanner.nextDouble();

    circumference = 2 * Math.PI * radius;
    System.out.println("The circumference is: " + circumference + "cm");

    area = Math.PI * Math.pow(radius, 2);
    System.out.println("The area is: " + area + "cm²");

    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    System.out.println("Your volume is: " + volume + "cm³");

    scanner.close();

  }

}