public class ticketDiscountCalculator {

  public static void main(String[] args) {

    //this is manual way to calculate the discount
    // 😁👍

    boolean isStudent = true;
    boolean isSenior = true;
    double price = 9.99;

    if (isStudent) {
      if (isSenior) {
        System.out.println("you will get 10% discount because you are student");
        System.out.println("you will get 20% discount because you are senior");
        price *= 0.7;

      } else {
        System.out.println("you will get 10% discount because you are student");
        price *= 0.9;
      }

    } else {
      if (isSenior) {
        System.out.println("you will get 20% discount because you are senior");
        price *= 0.8;
      } else {
        price *= 1;
      }

    }

    System.out.printf("the ticket price are %.2f", price);

  }

}