abstract class Payment {
    abstract void process_payment(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void process_payment(double amount) {
        System.out.println("Credit Card processed payment of $" + amount);
    }
}

class PayPalPayment extends Payment {
    @Override
    void process_payment(double amount) {
        System.out.println("PayPal processed payment of $" + amount);
    }
}

class BankTransferPayment extends Payment {
    @Override
    void process_payment(double amount) {
        System.out.println("Bank Transfer processed payment of $" + amount);
    }
}

public class ex7 {
    public static void main(String[] args) {
        Payment[] p = {
            new CreditCardPayment(),
            new PayPalPayment(),
            new BankTransferPayment()
        };

        for (Payment pay : p) {
            pay.process_payment(100);
        }
    }
}
