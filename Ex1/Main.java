package Ex1;

public class Main {
    public static void main(String[] args){
        Vehicle v = new Vehicle(){}; // can only be created because thre's a default constructor inside Vehicle class;=
        Vehicle v1 = new Vehicle("Porsche",2008){};

        Car c = new Car("Ford",1999,3);
        
        v.start();
        v1.start();
        c.start();
        c.honk();

    }
    
}

