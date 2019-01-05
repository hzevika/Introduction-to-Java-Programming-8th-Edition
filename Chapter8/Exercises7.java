package Chapter8;

import java.text.SimpleDateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Havis
 */
class Account{
    NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public Account(int id, double balance, double annualInterestRate, String dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        try {
            this.dateCreated = sdf.parse(dateCreated);
        } catch (ParseException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return sdf.format(dateCreated);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setDateCreated(String dateCreated) {
        try {
            this.dateCreated = sdf.parse(dateCreated);
        } catch (ParseException ex) {
            Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public double getMonthlyInterestRate(){
        return (double) this.annualInterestRate/12;
    }
    
    public void withdraw(double wd){
        this.balance -= wd;
    }
    
    public void deposit(double depo){
        this.balance += depo;
    }

    @Override
    public String toString() {
        return  "Id : "+getId()+
                "\nBalance : "+currency.format(getBalance())+
                "\nAnnual Interest Rate : "+getAnnualInterestRate()+"%"+
                "\nMonthly Interest Rate : "+getMonthlyInterestRate()+"%"+
                "\nDate Created : "+getDateCreated();
    }
    
   
}
public class Exercises7 {
    public static void main(String[] args) {
        
        Account act = new Account(1122, 20000, 4.5, "01-02-2018");
        act.withdraw(2500);
        act.deposit(3000);
        
        System.out.println(act.toString());
    }
}
