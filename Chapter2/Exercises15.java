package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises15 {
    public static void main(String[] args) {
        float valuesInTheAccount = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter monthly deposits : ");
        float monthlyDeposits = input.nextFloat();
        System.out.print("Enter annual interest rate (%) : ");
        float annualInterestRate = input.nextFloat();
        System.out.print("Values in the account on month : ");
        float month = input.nextFloat();
        
        float monthlyInterestRate = annualInterestRate/100/12;
        
        for(int i = 0 ;i < month;i++){
            valuesInTheAccount = (float) ((valuesInTheAccount + monthlyDeposits)*(1 + monthlyInterestRate));
        }
        
        System.out.println("Values in the account is : "+valuesInTheAccount);
    }
}
