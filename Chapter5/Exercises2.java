package Chapter5;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises2 {
    public static int sumDigits(long n){
        int total=0;
        do{
            total += n%10;
            n /= 10;
        }while(n!=0);
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an intger number : ");
        int number = input.nextInt();
        System.out.println("Sum of all digits is : "+sumDigits(number));
    }
}
