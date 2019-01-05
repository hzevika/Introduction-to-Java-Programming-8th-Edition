package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number in pounds : ");
        double pounds = input.nextDouble();
        
        double kilogram = pounds * 0.454; 
        System.out.println(pounds+" Pounds is "+kilogram+" Kilograms");
    }
}
