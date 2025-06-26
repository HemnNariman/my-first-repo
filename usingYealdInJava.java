public class usingYealdInJava {
  public static void main(String[] args) {
    String month = "APRIL";
    System.out.println(month + " is in the " + getQuarter(month) + " quarter");
  }

  public static String getQuarter(String month) {
    return switch (month) {
      case "JANUARY", "FEBRUARY", "MARCH" -> {
        yield "1st";
      }
      case "APRIL", "MAY", "JUNE" -> {
        yield "2st";
      }
      case "JULY", "AUGUST", "SEPTEMBER" -> {
        yield "3st";
      }
      case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
        yield "4st";
      }
      default -> {
        String badResponse = month + " is bad";
        yield badResponse;
      }
    };
  }
}
// This code demonstrates the use of the 'yeild' statement in a switch
// expression in Java.
// the 'yield' statement allows you to return a value from a block of code
// within a switch expression.
// the example checks the month and returns the corresponding quarter as a
// string.
