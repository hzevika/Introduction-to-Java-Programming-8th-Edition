package Chapter2;
import javax.swing.JOptionPane;
/**
 *
 * @author Havis
 */
public class Exercises12a {
    public static void main(String[] args) {
        String balanceString = JOptionPane.showInputDialog("Enter Balance :");
        String interestRateString = JOptionPane.showInputDialog("Enter interest rate (e.g., 3 for 3%): ");
        
        double balance = Double.parseDouble(balanceString);
        double interestRate = Double.parseDouble(interestRateString);
        
        double interest = balance * (interestRate / 1200);
        
        String output ="The interest is "+interest;
        
        JOptionPane.showMessageDialog(null, output);
    }
}
