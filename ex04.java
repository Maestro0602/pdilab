public class ex04 {

    static class BankAccount {
        String accountNumber;
        double balance;

        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
            System.out.println("Base BankAccount initialized: " + accountNumber);
        }
    }

    static class SavingsAccount extends BankAccount {
        double interestRate;

        public SavingsAccount(String accountNumber, double balance, double interestRate) {
            super(accountNumber, balance); 
            this.interestRate = interestRate;
            System.out.println("SavingsAccount extension complete.");
        }

        public void displayAccountInfo() {
            System.out.println("\n--- Savings Account Info ---");
            System.out.println("Account Number: " + accountNumber); 
            System.out.println("Balance: $" + balance);
            System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 4: Calling Parent Constructor (Bank Account Types) ---");
        
        SavingsAccount mySavings = new SavingsAccount("123456789", 1500.50, 0.035);
        mySavings.displayAccountInfo();
    }
}