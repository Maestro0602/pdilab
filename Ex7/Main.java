package Ex7;

public class Main {
    public static void main(String[] args){
        Payment p1 = new CreditCardPayment();
        Payment p2 = new PayPalPayment();
        Payment p3 = new BankTransferPayment();

        p1.process_payment(22.5);
        p2.process_payment(50.99);
        p3.process_payment(1000.5);


    }
    
}

