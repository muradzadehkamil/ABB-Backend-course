import java.util.Random;
import java.util.Scanner;

public class HomeWork1 {


    public static void main(String[] args) {
        Random rnd = new Random();
        boolean result = true;
        int nxt = rnd.nextInt(100);
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Let the game begin!");
        while (result) {
            System.out.println("Enter the value: ");

        int number = scanner.nextInt();
        if (number > nxt) {
            System.out.println("Your number is too big. Please, try again");

        }
        else if (number < nxt) {
            System.out.println("Your number is too small. Please, try again");

        }
        else {
            System.out.printf("Congratulations , %s ! " , name );
            result = false;
        }
        }

    }
}
