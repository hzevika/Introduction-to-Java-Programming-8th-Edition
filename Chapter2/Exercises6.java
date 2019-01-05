package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises6 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.print("Enter a number between 0 and 1000 :");
        int digit = input.nextInt();
        int x = 0,sum = 0;
        if (digit < 10) {
            x = 2;
        }else if(digit > 10 && digit <100 ){
            x = 1;
        }else if(digit > 100){
            x = 0;
        }
        
        for(int i = x;i<3;i++){
            sum += digit%10;
            digit /= 10;
        }
        System.out.println("The sum of digits is "+sum);
    }
}
