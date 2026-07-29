package OOP;

public class BankAccount {
    int balance;

    public BankAccount(int balance){
        this.balance = balance;
    }

    public int deposit(int deposit){
    System.out.println("Deposit was successful");
    balance += deposit;
    return balance;
    }

    public void getBalance(){
        System.out.println("Your balance is " + balance);
    }

}
