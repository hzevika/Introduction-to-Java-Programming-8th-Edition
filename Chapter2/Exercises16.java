package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kilograms : ");
        float m = input.nextFloat();
        System.out.print("Enter the initial temperature : ");
        float initialTemperatur = input.nextFloat();
        System.out.print("Enter the final temperature : ");
        float finalTemperatur = input.nextFloat();
        
        double q = m * (finalTemperatur - initialTemperatur) * 4184;
        
        System.out.println("The energy needed is : "+q);
    }
}
