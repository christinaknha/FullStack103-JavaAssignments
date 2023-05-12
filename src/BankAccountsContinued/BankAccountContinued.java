package BankAccountsContinued;

public class BankAccountContinued {
        private double amount;
        private String yourName;
        private int accountNum;

        //  Create class constructor that takes in account holder name, amount, and id number
        public BankAccountContinued(double accountBalance, String customerName, int customerAccountNum){
            this.amount = accountBalance;
            this.yourName = customerName;
            this.accountNum = customerAccountNum;
        }

//      Create class constructor that takes in no parameters
        public BankAccountContinued(){

        }

//      Get statements to pull information from the array
        public double getAmount() {
            return amount;
        }

        public String getYourName() {
            return yourName;
        }

        public int getAccountNum() {
            return accountNum;
        }

        public void deposit(double moneyToAdd){
            amount = amount + moneyToAdd;
        }

        public void withdraw(double moneyToRemove){
            amount = amount - moneyToRemove;
        }

        public String accountDetails(){
            String accountAlert = this.yourName+ "'s Account balance: " + this.amount;
            System.out.println(accountAlert);
            return accountAlert;
        }
    }


