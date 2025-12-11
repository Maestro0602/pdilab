abstract class Payment {
    public abstract String processPayment(double amount);

    public String getPaymentInfo() {
        return "Payment processed with " + this.getClass().getSimpleName();
    }
}

class CreditCardPayment extends Payment {
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardHolder = cardHolder;
    }

    @Override
    public String processPayment(double amount) {
        return String.format("Processing credit card payment of $%.2f for %s",
                amount, cardHolder);
    }
}

class PayPalPayment extends Payment {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public String processPayment(double amount) {
        return String.format("Processing PayPal payment of $%.2f from %s",
                amount, email);
    }
}

class BankTransferPayment extends Payment {
    private String bankName;

    public BankTransferPayment(String accountNumber, String bankName) {
        this.bankName = bankName;
    }

    @Override
    public String processPayment(double amount) {
        return String.format("Processing bank transfer of $%.2f from %s account",
                amount, bankName);
    }
}

public class ex07 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 7: Abstract Classes ===");

        Payment[] payments = {
                new CreditCardPayment("1234-5678-9012-3456", "Alice Johnson"),
                new PayPalPayment("alice@example.com"),
                new BankTransferPayment("ACC123456", "Big Bank")
        };

        double amount = 100.50;
        for (Payment payment : payments) {
            System.out.println(payment.processPayment(amount));
            System.out.println(payment.getPaymentInfo());
            System.out.println();
        }
    }
}