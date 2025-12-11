package Ex7;

public class PayPalPayment extends Payment {

    @Override
    void process_payment(double amount){
        System.out.println("Paypal: " + amount);

    }
}
