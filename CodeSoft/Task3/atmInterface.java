package Task3;

import java.util.Scanner;
                                             
class BankAccount 
{
    private double bal;  

    public BankAccount(double initialBalance)
    {
        this.bal = initialBalance;
    }

    public double getBalance() 
    {
        return bal;
    }

    public void deposit(double amount) 
    {
        if (amount > 0)
        {
            bal += amount;
            System.out.println("Deposit successful. New balance: $" + bal);
        } 
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0)
        {
            if (amount <= bal) 
            {
                bal -= amount;
                System.out.println("Withdrawal successful. New balance: $" + bal);
                return true;
            }
            else 
            {
                System.out.println("Insufficient funds for withdrawal. Current balance: $" + bal);
            }
        }
        else
        {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
        return false;
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() 
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Current balance: $" + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    boolean withdrawSuccess = bankAccount.withdraw(withdrawalAmount);
                    if (withdrawSuccess) {
                        System.out.println("Withdrawal successful.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

public class atmInterface
{
    public static void main(String[] args)
    {
        BankAccount userAccount = new BankAccount(1000.0); 
        ATM atm = new ATM(userAccount);
        atm.run();
    }
}