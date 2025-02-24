import java.util.Scanner;

    public class NameChecker {

        public static void main(String [] args){
            Scanner scanner = new Scanner(System.in);

            String creator = "Hemn";

            System.out.println("Enter your name: ");
            String name= scanner.nextLine().trim();


            if(name.equalsIgnoreCase(creator)){

                System.out.println("Hello creator!");

            }else {
                System.out.println("Your name is: " + name);
            }

            scanner.close();
        }

    }