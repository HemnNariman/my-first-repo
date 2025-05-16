import java.util.Scanner;

public class Grades {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] subjects = {
        " Math ", " Logic ", " Java ", " Academic debates ", " Matlab ", " Physical education "
    };

    int sum = 0;
    int passCount = 0;
    int failCount = 0;

    for (int i = 0; i < subjects.length; i++) {
      System.out.println("Enter grades of this subject: " + subjects[i] + " : ");
      int grades = scanner.nextInt();
      sum += grades;

      if (grades >= 50) {
        System.out.println(subjects[i] + " Passed\n");
        passCount++;
      } else {
        System.out.println(subjects[i] + " Failed\n");
        failCount++;
      }
    }
    System.out.println("Total grades: " + sum);
    System.out.println("The subjects you passed: " + passCount);
    System.out.println("The subjects you failed: " + failCount);

    scanner.close();
  }
}