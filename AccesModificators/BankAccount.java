package AccesModificators;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double deposit(double amount){
        if (amount>=0){
            this.balance += amount;
            System.out.println("Success, the new balance is " + this.balance);
        }

        return balance;
    }

    public double withdraw(double amount){
        this.balance -= amount;
        System.out.println("Success, the new balance is " + this.balance);
        return balance;
    }
    
}
