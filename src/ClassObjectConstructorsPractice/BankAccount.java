package ClassObjectConstructorsPractice;

public class BankAccount {
    private double amount;
    public String yourName;

//  Create class constructor
    public BankAccount(double accountBalance, String customerName){
        this.amount = accountBalance;
        this.yourName = customerName;
    }

    public double deposit(double moneyToAdd){
        this.amount = this.amount + moneyToAdd;
        return this.amount;
    }

    public double withdraw(double moneyToRemove){
        this.amount = this.amount - moneyToRemove;
        return this.amount;
    }

    public String accountDetails(){
        String accountAlert = this.yourName+ "'s Account balance: " + this.amount;
        System.out.println(accountAlert);
        return accountAlert;
    }
}
