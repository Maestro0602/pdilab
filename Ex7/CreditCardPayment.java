package Ex7;

public class CreditCardPayment extends Payment {

    @Override
    void process_payment(double amount){
        System.out.println("Creditcard: " + amount);

    }
    
}


