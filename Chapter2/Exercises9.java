package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an amount in inteter whose last two digits represent the cents : ");
        int amount = input.nextInt();
        
        int remainingAmount = (amount);
        
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        
        int numberOfCents = remainingAmount;
        
        System.out.println("Your amount "+amount+" consist of \n"
                + "\t"+numberOfOneDollars+" dollars\n"
                + "\t"+numberOfCents+" cents");
    }
}
