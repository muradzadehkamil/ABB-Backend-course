import java.util.Scanner;

public class CompareLogic {

    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        System.out.println("How old are you?");
        int age = in.nextInt();
        System.out.println("How many brother you have?");
        int numberOfBrothers = in.nextInt();

        if (age >= 18 && numberOfBrothers > 0) System.out.printf("Age: %d You have %d brothers", age, numberOfBrothers);
        else System.out.println("Hi");

        if(age >= 18 || numberOfBrothers > 0 || true) System.out.printf("Age: %d You have %d brothers", age, numberOfBrothers);
        else System.out.println("Hi");

    }
}
