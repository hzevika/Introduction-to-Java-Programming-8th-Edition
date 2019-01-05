package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Fahreinheit (between -58F and 41F): ");
        float ta = input.nextFloat();
        System.out.print("Enter the wind speed miles per hour (greater than or equal to 2): ");
        float v = input.nextFloat();
        
        double twc = 35.74 + 0.6215*ta - 35.75*Math.pow(v, 0.16) + 0.4275*ta*Math.pow(v,0.16);
        
        System.out.println("The wind chill index is "+twc);
    }
}
