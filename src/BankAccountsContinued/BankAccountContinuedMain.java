package BankAccountsContinued;
import java.util.Scanner;
import java.util.ArrayList;

public class BankAccountContinuedMain {
        public static void main(String[] args) {
//          Create scanner to look for user inputs
            Scanner scanner = new Scanner(System.in);

//          Create array to store users
            ArrayList<BankAccountContinued> accounts = new ArrayList<>();

//          Add old information to the array
            accounts.add(new BankAccountContinued(500, "Christina", 1));
            accounts.add(new BankAccountContinued(5000, "Larry", 2));
            accounts.add(new BankAccountContinued(300, "Mary", 3));

//          Add welcome Statement
            System.out.println("Hello! Welcome to CTAC Bank!");
            System.out.println("Are you an existing customer? (Enter -1 to exit)");
            System.out.println("Enter 1 for yes.");
            System.out.println("Enter 2 for no.");

//          Store user input into variable
            int existingCustomer = Integer.valueOf(scanner.nextLine());
            if (existingCustomer == 1){

//          Ask user for their account information and save
                System.out.println("What is your name?");
                String userName = scanner.nextLine();

                System.out.println("What is your account number");
                int userAccountNum = Integer.valueOf(scanner.nextLine());


                mainMenu(userName, userAccountNum, accounts);

            } else if (existingCustomer == 2){
                System.out.println("Let's make a new account!");

//              Asks for user's name and stores response in variable
                System.out.println("What is your name?");
                String newUserName = scanner.nextLine();

//              Asks for how much user is depositing to start the account
                System.out.println("What is the beginning balance for the account?");
                double newAccountAmount = Double.valueOf(scanner.nextLine());

                int newAccountNum = accounts.size() + 1;

//              Add user to array
                accounts.add(new BankAccountContinued(newAccountAmount, newUserName, newAccountNum));

                mainMenu(newUserName, newAccountNum, accounts);

            } else if(existingCustomer == -1){
                System.out.println("Exiting the system. Goodbye!");
            } else{
                System.out.println("Please enter a valid value.");
            }
        }

    private static void mainMenu(String userName, int userAccountNum, ArrayList<BankAccountContinued> accounts) {

        Scanner scanner = new Scanner(System.in);
//      FIND USER ACCOUNT
        while (true) {
            System.out.println("Hello " + userName + "!");
            System.out.println("Welcome to the Main menu, what would you like to do today?");
            System.out.println("Enter 1 to check account balance.");
            System.out.println("Enter 2 to make a withdrawal.");
            System.out.println("Enter 3 to make a deposit.");
            System.out.println("Enter 4 to make a transfer to another account.");
            System.out.println("Enter 0 to exit.");

            int optionSelected = Integer.valueOf(scanner.nextLine());

            if (optionSelected == 1) {
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getAccountNum() == userAccountNum) {
                        accounts.get(i).accountDetails();
                    }
                }

            } else if (optionSelected == 2) {
                System.out.println("How much would you like to withdraw?");
                double withdrawAmount = Double.valueOf(scanner.nextLine());

                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getAccountNum() == userAccountNum) {
                        accounts.get(i).withdraw(withdrawAmount);
                        accounts.get(i).accountDetails();
                    }
                }

            } else if (optionSelected == 3) {
                System.out.println("How much would you like to deposit?");
                double depositAmount = Double.valueOf(scanner.nextLine());
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getAccountNum() == userAccountNum) {
                        accounts.get(i).deposit(depositAmount);
                        accounts.get(i).accountDetails();
                    }
                }

            } else if (optionSelected == 4) {
                System.out.println("Please enter the account number to transfer to");
                int transferTo = Integer.valueOf(scanner.nextLine());

                if (transferTo > accounts.size()){
                    System.out.println("Account does not exist");
                    mainMenu(userName, userAccountNum, accounts);
                }

                System.out.println("Please enter the amount to transfer");
                double transferAmount = Double.valueOf(scanner.nextLine());

                transfer(userAccountNum, transferTo, transferAmount, accounts);

            } else if (optionSelected == 0) {
                System.out.println("Exiting the account. Goodbye.");
                break;
            } else {
                System.out.println("Please enter a valid option.");
            }
        }
    }

        private static void transfer(int userAccountNum, int transferTo, double transferAmount, ArrayList<BankAccountContinued> accounts){
//            int i = 0;
//            while(i < accounts.size()){
            for (int i = 0; i < accounts.size(); i++) {
                        if (accounts.get(i).getAccountNum() == userAccountNum ){
                            System.out.println("The name on this account is: " + accounts.get(i).getYourName() +
                                    " and they have a starting balance of " + accounts.get(i).getAmount());
                            accounts.get(i).withdraw(transferAmount);
                            System.out.println("The name on this account is: " + accounts.get(i).getYourName() +
                                    " and they have a remaining balance of " + accounts.get(i).getAmount());
                        }
                        if (accounts.get(i).getAccountNum() == transferTo){
                            System.out.println("The name on this account is: " + accounts.get(i).getYourName() +
                                    " and they have a starting balance of " + accounts.get(i).getAmount());
                            accounts.get(i).deposit(transferAmount);
                            System.out.println("The name on this account is: " + accounts.get(i).getYourName() +
                                    " and they have a remaining balance of " + accounts.get(i).getAmount());
                        }


            }

        }
    }
