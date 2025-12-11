abstract class Payment {
    abstract void process_payment(double amount);
}

class CreditCardPayment extends Payment {
    void process_payment(double amount) {
        System.out.println("Credit card paid " + amount);
    }
}

class PayPalPayment extends Payment {
    void process_payment(double amount) {
        System.out.println("PayPal paid " + amount);
    }
}

class BankTransferPayment extends Payment {
    void process_payment(double amount) {
        System.out.println("Bank transfer paid " + amount);
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
