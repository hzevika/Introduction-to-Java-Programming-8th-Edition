package Chapter2;
import javax.swing.JOptionPane;
/**
 *
 * @author Havis
 */
public class Exercises11a {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Employee's name : ");
        String hoursWorkedString = JOptionPane.showInputDialog("Enter number of hours worked in a week : ");
        String payRateString = JOptionPane.showInputDialog("Enter hourly pay rate : ");
        String federalTaxString = JOptionPane.showInputDialog("Enter federal tax withholding rate : ");
        String stateTaxString = JOptionPane.showInputDialog("Enter state tax withholding rate : ");
        
        double hoursWorked = Double.parseDouble(hoursWorkedString);
        double payRate = Double.parseDouble(payRateString);
        double federalTaxRate = Double.parseDouble(federalTaxString);
        double stateTaxRate = Double.parseDouble(stateTaxString);
        
        double grossPay = hoursWorked * payRate;        
        double federalTax = federalTaxRate * grossPay;
        double stateTax = stateTaxRate * grossPay;
        double deduction = federalTax+stateTax;
        double netPay = grossPay - deduction;
        
        String output ="Employee name : "+name+
                "\nHours Worked : "+hoursWorked+
                "\nPay Rate : $"+payRate+
                "\nGross Pay : $"+grossPay+
                "\nDeduction :"
                +"\n     Federal Withholding \u0028"+federalTaxRate*100+"%\u0029: $"+federalTax+
                "\n     State Withholding \u0028"+stateTaxRate*100+"%\u0029: $"+stateTax+
                "\n     Total Deduction : $"+deduction+
                "\nNet Pay: $"+netPay;
        JOptionPane.showMessageDialog(null, output);
    }
}
