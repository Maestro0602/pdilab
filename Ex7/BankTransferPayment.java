package Ex7;

public class BankTransferPayment extends Payment {

    @Override
    void process_payment(double amount){
        System.out.println("BankTransfer: " + amount);

    }
    
}


