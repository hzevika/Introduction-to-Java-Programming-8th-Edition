package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
              
        System.out.print("Enter a value for feet : ");
        double feet = input.nextDouble();
        
        double meter = 0.305 * feet;
        System.out.println(feet+" Feet is "+meter+" Meters");
    }
}
