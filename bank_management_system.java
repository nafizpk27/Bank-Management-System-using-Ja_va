import java.util.Scanner;
class Account{
    private String accountHolderName;
    private String accountNumber;
    private double balance;



    //Constructor
    public Account(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }


    //Deposit Method
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Successfully Deposit $" + amount);

        }
        else{
            System.out.println("Invalid Deposit Amouint");
        }
    }

    //Withdraw method
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;

        }
        else if (amount > balance ){
            System.out.println("Insufficient Balance");
        }

        else {
            System.out.println("Invalid Amount");
        }
    }

    //Display balance
    public void displYBalance() {
        System.out.println("Account Holder Name:" + accountHolderName);
        System.out.println("Account Number:" + accountNumber);
        System.out.println("Curent Balance:" + balance);

    }
}


public class bank_management_system {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Bank Management System");


        //create account
        System.out.println("Eneter Account Holder Name:");
        String name = sc.nextLine();
        System.out.println("Enter Account Number");
        String accountNumber = sc.nextLine();
        Account account = new Account (name, accountNumber);

        boolean exit= false;


        while (!exit) {
            //Menu Options
            System.out.println("\n1.Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3.Display Balance");
            System.out.println("4.Exit");
            System.out.println("Choose an Option :");

            int choice = sc.nextInt();

            switch (choice) {
                case  1:System.out.println("Enter Deposit amoint:");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

                case 2:
                    System.out.println("Enter The Withdrwa Amount:");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                        account.displYBalance();
                        break;

                case 4:
                        System.out.println("Thank You for using Bank Management System!");
                        exit = true;
                        break;    
            
                default:
                    System.out.println("Invaloid option. Please try again.");
                
                    break;
            }

            
        }
        sc.close();
    }
    


    
}