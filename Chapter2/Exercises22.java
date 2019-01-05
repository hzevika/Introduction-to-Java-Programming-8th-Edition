package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double s = input.nextDouble();
        
        double area = 3*Math.sqrt(3)/2*Math.pow(s, 2);
        
        System.out.println("The area of the hexagon is "+area);
    }
}
