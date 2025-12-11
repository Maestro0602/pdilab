package Ex1;

public class Car extends Vehicle {
    int num_doors;

    Car(String brand, int year, int num_doors){
        super(brand, year);
        this.num_doors = num_doors;
    }

    public void honk(){
        System.out.println("Doors: "+this.num_doors);
    }

    
}
