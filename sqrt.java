import java.util.Scanner;
public class sqrt {

        public static void main(String [] args){

            Scanner scanner = new Scanner(System.in);
            double a;
            System.out.println("Enter the length of side A");
            a = scanner.nextDouble();

            System.out.println(a);

            double b;
            System.out.println("Enter the length of side B");

            b=scanner.nextDouble();

            double c;

            c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));

            System.out.println("The hypotenuse (side c) is: "+c+"cm");


            scanner.close();







        }



}