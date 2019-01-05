package Chapter11;

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
class SavingsAccount extends Account{
    public SavingsAccount() {
        super.setId(0);
        super.setBalance(0);
        super.setAnnualInterestRate(0);
    }
    public SavingsAccount(int id, double balance, double annualInterestRate, String dateCreated){
        super.setId(id);
        super.setBalance(balance);
        super.setAnnualInterestRate(annualInterestRate);
        super.setDateCreated(dateCreated);
    }
    
    @Override
    public void withdraw(double wd) {
        if (wd > getBalance()) {
            System.out.println("Transaction cannot be made because overdrawn...");
        }else{
            super.withdraw(wd); 
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}

class CheckingAccount extends Account{
    public CheckingAccount() {
        super.setId(0);
        super.setBalance(0);
        super.setAnnualInterestRate(0);
    }
    
    public CheckingAccount(int id, double balance, double annualInterestRate, String dateCreated){
        super.setId(id);
        super.setBalance(balance);
        super.setAnnualInterestRate(annualInterestRate);
        super.setDateCreated(dateCreated);
    }
    @Override
    public void withdraw(double wd) {
        if (wd > getBalance()) {
            System.out.println("Warning! Overdraft! Your balance gonna be under zero!");
            super.withdraw(wd);
            System.out.println("Now you have debt...");
        }else{
            super.withdraw(wd);
        }
    }

    @Override
    public String toString() {
        String msg = "";
        if (getBalance() < 0) {
            msg = "You have debt";
        }
        return super.toString()+"\n"+msg;
    }
    
}
public class Exercises3 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1122, 27000, 4.5, "01-02-2018");
        CheckingAccount ca = new CheckingAccount(1123, 26000, 4.5, "02-03-2018");
        sa.withdraw(5000);
        sa.withdraw(27500);
        System.out.println(sa.toString()+"\n");
        ca.withdraw(27000);
        System.out.println(ca.toString());
    }
}
