class BankAccount {
    String account_number;
    double balance;
    BankAccount(String account_number, double balance) {
        this.account_number = account_number;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interest_rate;
    SavingsAccount(String account_number, double balance, double interest_rate) {
        super(account_number, balance);
        this.interest_rate = interest_rate;
    }
}

public class ex4 {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("AC001", 1000, 3.5);
        System.out.println(acc.account_number);
        System.out.println(acc.balance);
        System.out.println(acc.interest_rate);
    }
}

