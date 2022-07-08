import java.util.Random;

public class LoopsApp {
    public static void main(String[] args) {

        Random rnd = new Random();

        for (int i = 0; i < 10; i++ ){
//           System.out.print("i\n");
           // System.out.println(rnd.nextInt(10));
           // for (int j = 0; j < 10; j++);
 //           System.out.print("j");

            for (i = 0; i < 10; i++ ){
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }

        }







        }


}
