package Ex4;

public class Main {
    public static void main(String[] args){
        BankAccount b = new BankAccount("p20240017",105);
        SavingsAccount s = new SavingsAccount("p20240000",25, 0.99);

        b.print();
        s.print();
        s.print2();


    }
    
}
