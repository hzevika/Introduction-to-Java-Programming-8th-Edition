package Chapter3;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises5 {
    public static void main(String[] args) {
        
        int number1 = (int)(System.currentTimeMillis() % 100);
        int number2 = (int)(System.currentTimeMillis() * 7 % 100);
        int number3 = (int)(System.currentTimeMillis() * 13 % 100);
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is "+number1+" + "+number2+" + "+number3+" ? ");
        
        int answer = input.nextInt();
        
        System.out.println(number1+" + "+number2+" + "+number3+" = "+answer+" is "+(number1+number2+number3==answer));
    }
}
