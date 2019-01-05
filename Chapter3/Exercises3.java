package Chapter3;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c, d, e, f, x, y, z;
        
        System.out.print("Enter a, b, c, d, e, f : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();
        
        z = a*d - b*c;
        x = (e*d - b*f)/(z);
        y = (a*f - e*c)/(z);
        
        if(z==0){
            System.out.println("The equation has no solution");
        }else{
            System.out.println("x is "+x+" and y is "+y);
        }
    }
}
