package ClassObjectConstructorsPractice;

public class BankAccountMain {
    public static void main(String[] args) {

//      Code for Bank account
        BankAccount createBankAccount1 = new BankAccount(500, "Christina");

        createBankAccount1.deposit(100);
        createBankAccount1.accountDetails();

//      Code for Bank Transfer
        BankAccount createBankAccount2 = new BankAccount(5000, "Larry");
        BankAccount createBankAccount3 = new BankAccount(300, "Mary");

        createBankAccount2.withdraw(100);
        createBankAccount3.deposit(100);
        createBankAccount2.accountDetails();
        createBankAccount3.accountDetails();
    }

}
