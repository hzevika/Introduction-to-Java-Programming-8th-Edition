package Chapter8;

import java.util.Random;

/**
 *
 * @author Havis
 */
public class Exercises4 {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        for (int i = 0; i < 50; i++) {
            System.out.print(rand.nextInt(100)+"\t");
            if (((i+1)%10)==0) {
                System.out.println("");
            }
        }
    }
}
