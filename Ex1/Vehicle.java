package Ex1;

public class Vehicle {
    private String brand;
    private int year;

    Vehicle(){}

    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    public void start(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Year: " + this.year);
    }
    
    
}
