package Chapter5;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises4 {
    public static int reverse(int n){
        int reverse = 0, total=0;
        do{
            total += n%10;
            reverse = (reverse*10)+n%10;
            n /= 10;
        }while(n!=0);
        return reverse;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer number : ");
        int number = input.nextInt();
        System.out.println("The reverse of "+number+" is "+reverse(number));
    }
}
