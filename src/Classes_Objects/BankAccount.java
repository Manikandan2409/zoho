package Classes_Objects;
/*
 * 
 *  Create a class called "BankAccount" with properties such as "balance",
 *  "accountNumber", and "accountType". Implement the necessary getter and setter methods for each property.
 */
/**
 * Bank
 */
class Bank {
    int accountNumber;
    int balance;
    String accountType;
    Bank(int accountNumber, int balance, String accountType){
        setAccountNumber(accountNumber);
        setBalance(balance);
        setAccountType(accountType);
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    public int getBalance() {
        return balance;
    }
    public String getAccountType() {
        return accountType;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
       
}
public class BankAccount {
    
}
