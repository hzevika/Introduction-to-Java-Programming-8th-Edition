package Chapter3;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises2 {
    public static void main(String[] args) {
        String msg;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer : ");
        int number = input.nextInt();
        
        System.out.println("Is "+number+" an even number ? "+(number%2==0));
    }
}
