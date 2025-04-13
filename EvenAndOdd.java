public class EvenAndOdd {
    public static void main(String[] args) {
      for (int i = 0; i <= 20; i++) {

        if (i % 2 == 0 && i != 0) {

          System.out.println("This is Even number: " + i);

        }
        if (i % 2 != 0) {
          System.out.println("This is Odd number: " + i);
        }
      }
    }
  }
// This program prints even and odd numbers from 0 to 20
