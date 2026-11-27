import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Bank.BankFunctions bf = bank.new BankFunctions();

        bf.createAccount("001", "John", "Savings");
        bf.createAccount("002", "John", "Current");
        bf.createAccount("003", "Mary", "Savings");
        System.out.println(bf.accounts);


        bf.deposit("John", "001", 1000);
        bf.deposit("John", "002", 500);
        bf.withdraw("John", "001", 200);
        bf.checkBalance("John");

        bf.getLoan("5");
        System.out.println(bf.loans);

    }
}

class Account
{
    String id;
    String accountType;
    double balance;

    Account(String id, String accountType) {
        this.id = id;
        this.accountType = accountType;
        this.balance = 0.0;
    }

    //overloading java default toString call for objects
    @Override
    public String toString() {
        return "(" + id + ", " + accountType + ", Balance=" + balance + ")";
    }
}

class Triple
{
    String loan;
    String interestRate;
    String tenure;

    Triple(String loan, String interestRate, String tenure) 
    {
        this.loan = loan;
        this.interestRate = interestRate;
        this.tenure = tenure;
    }

    //overloading java default toString call for objects
    @Override
    public String toString() {
        return "(" + loan + ", " + interestRate + "," + tenure +")";
    }
}

class Bank
{
    //function to login
    class Branch
    {
    }
    class Country
    {

    }
    class BankFunctions
    {
        //function to create account
        //account details stored in a valid collection framework (name, account_id, account type) - users can have multiple accounts

        HashMap<String, ArrayList<Account>> accounts = new HashMap<>();
        HashMap<String, ArrayList<Triple>> loans = new HashMap<>();

        //create account works - 27/11/26
        void createAccount( String id, String name, String accountType)
        {
            
            
            if (accounts.containsKey(name))
            {
                Account account = new Account(id,accountType);
                accounts.get(name).add(account);

            }
            else
            {
                //array will contain id and acount type and account_id will be key
                ArrayList<Account> details = new ArrayList<>();
                details.add(new Account(id,accountType));
                accounts.put(name,details);

            }
            
        }

        void deposit(String name, String accountId, double amount)
        {

        }

        void withdraw(String name, String accountId, double amount)
        {

        }

        void checkBalance(String name)
        {

        }


        //function to get loan - only if the user has an account with the bank - if user is valid to get loan then loan details stored in a valid collection framework (loan amount, interest rate, tenure)
        //function working 27-11-26
        void getLoan(String interestRate)
        {
            System.out.println("Enter your name: ");
            Scanner scanner = new Scanner(System.in);
            String n = scanner.nextLine();
            System.out.println("Enter loan amount: ");
            String loan = scanner.nextLine();
            System.out.println("Enter tenure: ");
            String tenure = scanner.nextLine();

            if (accounts.containsKey(n) && !loans.containsKey(n)) 
            {
                
                ArrayList<Triple> loanDetails = new ArrayList<>();
                loanDetails.add(new Triple(loan,interestRate,tenure));
                loans.put(n,loanDetails);

            }

            else if (accounts.containsKey(n) && loans.containsKey(n)) 
            {
                Triple triple = new Triple(loan,interestRate,tenure);
                loans.get(n).add(triple);

            }

            else
            {
                System.out.println("Please create an account first");

            }

        }
    }

}





