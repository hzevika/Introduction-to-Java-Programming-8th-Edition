package Chapter2;
import javax.swing.JOptionPane;
/**
 *
 * @author Havis
 */
public class Exercises10 {
    public static void main(String[] args) {
        
        String amountString = JOptionPane.showInputDialog("Enter an amount in double: ");
        
        double amount = Double.parseDouble(amountString);
        
        int remainingAmount = (int)(amount * 100);
        
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount %= 100;
        
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount %= 25;
        
        int numberOfDimes = remainingAmount / 10;
        remainingAmount %= 10;
        
        int numberOfNickles = remainingAmount / 5;
        remainingAmount %= 5;
        
        int numberOfPennies = remainingAmount;
        
        String output = "Your amount "+amount+" consist of \n"
                + "\t"+numberOfOneDollars+" dollars\n"
                + "\t"+numberOfQuarters+" quarters\n"
                + "\t"+numberOfDimes+" dimes\n"
                + "\t"+numberOfNickles+" nickles\n"
                + "\t"+numberOfPennies+" pennies";
        
        JOptionPane.showMessageDialog(null, output);
    }
}
