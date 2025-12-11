class BankAccount {
    private String accountNumber;
    protected double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String deposit(double amount) {
        balance += amount;
        return String.format("Deposited $%.2f. New balance: $%.2f", amount, balance);
    }

    public String withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return String.format("Withdrew $%.2f. New balance: $%.2f", amount, balance);
        }
        return "Insufficient funds";
    }

    public String getInfo() {
        return String.format("Account %s: Balance $%.2f", accountNumber, balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public String addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        return String.format("Added $%.2f interest. New balance: $%.2f", interest, balance);
    }

    @Override
    public String getInfo() {
        return String.format("Savings Account: Balance $%.2f, Interest Rate: %.1f%%",
                balance, interestRate * 100);
    }
}

public class ex04 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 4: Bank Account Types ===");

        BankAccount account = new BankAccount("ACC001", 1000);
        SavingsAccount savings = new SavingsAccount("SAV001", 5000, 0.05);

        System.out.println(account.getInfo());
        System.out.println(savings.getInfo());
        System.out.println(savings.addInterest());
        System.out.println(savings.deposit(500));
    }
}
