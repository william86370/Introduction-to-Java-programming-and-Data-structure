//Created By Emma Seehousz on 4/16
import java.util.Date;
public class Question9_7Class {

    private int id;

    private double balance;
    private double annualInterestRate;

    private Date dateCreated;

    public Question9_7Class() {
        
    }
    
    public Question9_7Class(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date(System.currentTimeMillis());
    }
    
    public void deposit(double amount) {
        this.balance += amount >= 0 ? amount : 0;
    }
    
    public void withdraw(double amount) {
        this.balance -= amount >= 0 ? amount : 0;
    }
    
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    
    public double getMontlyInterest() {
        return getMonthlyInterestRate() * balance / 100;
    }
    
    public int getID() {
        return this.id;
    }
    
    public double getBalance() {
        return this.balance;
    }
    
    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }
    
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
    
    public void setID(int id) {
        this.id = (id >= 0) ? id : 0;
    }
    
    public void setBalance(double balance) {
        this.balance = (balance >= 0) ? balance : 0;
    }
    
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
