import java.util.Scanner;

public class BankAccount
{


    //can only be accessed inside the class it is declared in
    private double balance;

    //static because we need access to it in main method
    static class BankDetails
    {
        String bankName;
        String branch;
        String country;

        //constructor
        BankDetails(String bankName, String branch, String country)
        {
            this.bankName = bankName;
            this.branch = branch;
            this.country = country;
        }
    }

    static class AccountDetails
    {
        String name;
        int id;
        String currency;
        String accountType;

        //constructor
        AccountDetails(String name, int id, String currency, String accountType)
        {
            this.name = name;
            this.id = id;
            this.currency = currency;
            this.accountType = accountType;
        }
    }

    //function to create account
    public void createAccount(String name, int id, String currency, String accountType)
    {
        AccountDetails details = new AccountDetails(name, id, currency, accountType);
        System.out.println("Account created for " + details.name + " with ID: " + details.id);
    }

    //function to deposit money
    public void deposit(double amount)
    {
        //check if the amount is positive
        if (amount <= 0)
        {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        //add balance to the account
        balance += amount;
        System.out.printf("Deposited: %.2f%n", amount);
    }

    //function to withdraw money
    public void withdraw(double amount)
    {
        //check if the amount is positive 
        if (amount <= 0)
        {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        // check if amount is less than or equal to the balance
        if (amount > balance)
        {
            System.out.println("Insufficient balance.");
            return;
        }
        //deduct the amount from the balance
        balance -= amount;
        System.out.printf("Withdrawn: %.2f%n", amount);
    }

    public void checkBalance()
    {
        System.out.printf("Current balance: %.2f%n", balance);
    }

    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        BankDetails bank = new BankDetails("Java Bank", "Main Branch", "India");

        AccountDetails details = new AccountDetails("Customer", 1001, "INR", "Savings");

        System.out.println("Bank: " + bank.bankName);
        System.out.println("Branch: " + bank.branch);
        System.out.println("Country: " + bank.country);
        System.out.println("Account holder: " + details.name);
        System.out.println("Account ID: " + details.id);
        System.out.println("Currency: " + details.currency);
        System.out.println("Account type: " + details.accountType);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to " + bank.bankName + "!");
       
        while (true)
        {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check balance");
            System.out.println("4. Create Account");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1 ->
                {
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                }
                case 2 ->
                {
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                }
                case 3 -> account.checkBalance();
                case 4 ->
                {

                    System.out.print("Enter account holder name: ");
                    String name = scanner.next();
                    //automatically generate account ID for simplicity
                    int id = (int) (Math.random() * 1000) + 1000;
                    System.out.print("Enter currency: ");
                    String currency = scanner.next();
                    System.out.print("Enter account type: ");
                    String accountType = scanner.next();

                    account.createAccount(name, id, currency, accountType);

                    
                }
                case 5 ->
                {
                    
                    System.out.println("Thank you for banking with us!");
                    return;
                }
                default -> System.out.println("Invalid option. Please choose 1 to 4.");
            }
        }
        
    }
}

