package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v and a : ");
        double v = input.nextDouble();
        double a = input.nextDouble();
        
        double lenght = Math.pow(v, 2) / (2*a);
        
        System.out.println("The minimum runaway lenght for this airplane is "+lenght);
    }
}
