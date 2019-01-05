package Chapter2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Havis
 */
public class Exercises12b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        
        double balance = input.nextDouble();
        double interestRate = input.nextDouble();
        
        double interest = balance * (interestRate / 1200);
        
        System.out.println("The interest is "+interest);
    }
}
