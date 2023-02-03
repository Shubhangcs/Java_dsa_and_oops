package Bank;
import java.util.*;
public class Account {
    private String acnumber;
    private double balance;
    private String cuname;
    private String email;
    private long number;
    public Account(){
        this.acnumber = "67218671";

    }
    public Account(String acnumber , String cuname, String email , double balance , long number){
        this.acnumber = acnumber;
        this.cuname = cuname;
        this.email = email;
        this.balance = balance;
        this.number = number;
    }

    public void deposit(double deposit_amount){
        this.balance += deposit_amount;
        System.out.println("Deposit of "+deposit_amount+" is successful");
    }
    public void withdral(double withdrawal){
        if(balance - withdrawal <0){
            System.out.println("Remaining balance is "+ this.balance +" Withdrawal not possible");
        }
        else{
            this.balance -= withdrawal;
            System.out.println("Withdrawal of amount "+withdrawal+"\nNew balance is "+this.balance);
        }
    }
    public void setAcnumber(String acnumber) {
        this.acnumber = acnumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCuname(String cuname) {
        this.cuname = cuname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getAcnumber() {
        return acnumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCuname() {
        return cuname;
    }

    public String getEmail() {
        return email;
    }

    public long getNumber() {
        return number;
    }
}
