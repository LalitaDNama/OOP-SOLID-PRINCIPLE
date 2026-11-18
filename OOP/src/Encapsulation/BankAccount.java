package Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber){
        this.accountNumber=accountNumber;
        this.balance=0;
    }
    public void diposit(Double amount){
        this.balance+=amount;
    }
    public Boolean withDraw(Double amount){
        if(balance>0 && balance<amount){
            balance-=amount;
            return true;
        }
        else
            return false;
    }
    public double getBalance(String accountNumber) throws Exception {
        if(this.accountNumber==accountNumber)
            return balance;
        else
            throw new Exception("Invalid Acoount Number");
    }
}
