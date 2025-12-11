import java.util.ArrayList;
import java.util.List;

public class ex07 {

    static abstract class Payment {
        public abstract void processPayment(double amount);
    }

    static class CreditCardPayment extends Payment {
        @Override
        public void processPayment(double amount) {
            System.out.println("Credit Card: Processing $" + amount + " (Applying 2.5% fee).");
        }
    }

    static class PayPalPayment extends Payment {
        @Override
        public void processPayment(double amount) {
            System.out.println("PayPal: Processing $" + amount + " (Instant transfer).");
        }
    }

    static class BankTransferPayment extends Payment {
        @Override
        public void processPayment(double amount) {
            System.out.println("Bank Transfer: Processing $" + amount + " (Requires 2-day clearance).");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 7: Abstract Classes (Payment Methods) ---");
        
        List<Payment> payments = new ArrayList<>();
        payments.add(new CreditCardPayment());
        payments.add(new PayPalPayment());
        payments.add(new BankTransferPayment());

        payments.get(0).processPayment(100.00);
        payments.get(1).processPayment(45.99);
        payments.get(2).processPayment(500.00);
    }
}