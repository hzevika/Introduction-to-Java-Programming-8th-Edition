package Chapter2;
import java.util.Scanner;
/**
 *
 * @author Havis
 */
public class Exercises13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter investment amout : ");
        float investmenAmount = input.nextFloat();
        System.out.print("Enter monthly interest rate : ");
        float monthlyInterestRate = input.nextFloat();
        System.out.print("Enter number of years : ");
        float numberOfYears = input.nextFloat();
        
        float futureInvestmentValue = (float) (investmenAmount * Math.pow((1+(monthlyInterestRate/100/12)),(numberOfYears*12)));
        
        System.out.println("Accumulate values is : "+futureInvestmentValue);
    }
}
