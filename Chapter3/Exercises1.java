package Chapter3;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,r1,r2;
        System.out.print("Enter a , b, c : ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        
        d = Math.pow(b, 2) - (4*a*c);
        r1 = ((0-b)+Math.pow(d, 0.5))/(2*a);
        r2 = ((0-b)-Math.pow(d, 0.5))/(2*a);
        
        if (d==0) {
            System.out.println("The root is "+r1);
        }else if(d>0){
            System.out.println("The roots are "+r1+" and "+r2);
        }else if(d<0){
            System.out.println("The equation has no real roots");
        }else{
            System.out.println("Error...!");
        }
    }
}
