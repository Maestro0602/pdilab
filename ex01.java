class Vehicle {

    String brand;
    int year;


    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void start() {
        System.out.println(brand + " from " + year + " is starting its engine.");
    }
}

class Car extends Vehicle {
    int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public void honk() {
        System.out.println("The " + brand + " with " + numDoors + " doors is honking.");
    }

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("TruckMaster", 2020);
        Car myCar = new Car("Honda Civic", 2024, 4);

        System.out.println("--- Vehicle Object ---");
        myVehicle.start();

        System.out.println("\n--- Car Object (Accessing inherited and specific methods) ---");
        myCar.start();
        myCar.honk(); 
    }
}