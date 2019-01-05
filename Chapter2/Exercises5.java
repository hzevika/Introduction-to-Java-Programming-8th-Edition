package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and a gratiuty rate : ");
        double subtotal = input.nextDouble();
        double gratiuty = input.nextDouble();
        
        gratiuty = (gratiuty/100) * subtotal;
        double total = subtotal + gratiuty;
        
        System.out.println("The gratiuty is "+gratiuty+" and total is "+total);
    }
}
