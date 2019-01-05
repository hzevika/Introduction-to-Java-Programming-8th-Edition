package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a degree in Celcius : ");
        double celcius = input.nextDouble();
        
        double fahrenheit = (9.0/5)*celcius + 32;
        System.out.println(celcius+" Celcius is "+fahrenheit+" Fahrenheit");
    }
}
