package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 22.0/7;
        
        System.out.print("Enter the radius and lenght of a cylinder : ");
        double radius = input.nextDouble();
        double lenght = input.nextDouble();
        
        double area = radius * radius * PI;
        double volume = area * lenght;
        
        System.out.println("The Area is "+area);
        System.out.println("The Volume is "+volume);
    }
}
