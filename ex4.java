class BankAccount {
    String account_number;
    double balance;

    BankAccount(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }

    void display() {
        System.out.println("===== Bank Account Info =====");
        System.out.println("Account Number : " + account_number);
        System.out.println("Balance        : $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interest_rate;

    SavingsAccount(String account_number, double balance, double interest_rate) {
        super(account_number, balance);
        this.interest_rate = interest_rate;
    }

    @Override
    void display() {
        System.out.println("===== Savings Account Info =====");
        System.out.println("Account Number : " + account_number);
        System.out.println("Balance        : $" + balance);
        System.out.println("Interest Rate  : " + interest_rate + "%");
    }
}

public class ex4 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("AC001", 1000, 3.5);
        acc.display();
    }
}
