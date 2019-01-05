package Chapter2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Havis
 */
public class Exercises11b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Employee's name : ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week : ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate : ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate : ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate : ");
        double stateTaxRate = input.nextDouble();
        
        double grossPay = hoursWorked * payRate;        
        double federalTax = federalTaxRate * grossPay;
        double stateTax = stateTaxRate * grossPay;
        double deduction = federalTax+stateTax;
        double netPay = grossPay - deduction;
        
        String output ="Employee name : "+name+
                "\nHours Worked : "+hoursWorked+
                "\nPay Rate : $"+payRate+
                "\nGross Pay : $"+grossPay+
                "\nDeduction :"+
                "\n     Federal Withholding \u0028"+federalTaxRate*100+"%\u0029: $"+federalTax+
                "\n     State Withholding \u0028"+stateTaxRate*100+"%\u0029: $"+stateTax+
                "\n     Total Deduction : $"+deduction+
                "\nNet Pay: $"+netPay;
        System.out.println(output);
    }
}
