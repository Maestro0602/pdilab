package Ex4;

public class BankAccount {
    String accNum;
    double balance;

    BankAccount(String accNum, double balance){
        this.accNum = accNum;
        this.balance = balance;
    
    }

    public void print(){
        System.out.println("Bank Account: " + accNum + 
                        "\n Balance: " + balance);
    }
    
}
