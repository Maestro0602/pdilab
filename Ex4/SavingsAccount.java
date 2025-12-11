package Ex4;

public class SavingsAccount extends BankAccount {
    double interest;

    SavingsAccount(String accNum, double balance, double interest){
        super(accNum,balance);
        this.interest = interest;
    }
    public void print2(){
        System.out.println("Interest Rate: " + interest);
                        
    }
    
}

