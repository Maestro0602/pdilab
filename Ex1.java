class Vehicle {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public String start() {
        return brand + " vehicle starting...";
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }
}

class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, int year, int numDoors) {
        super(brand, year);
        this.numDoors = numDoors;
    }

    public String honk() {
        return "Beep beep!";
    }

    public String getCarInfo() {
        return getBrand() + " (" + getYear() + "), " + numDoors + " doors";
    }
}

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("=== Exercise 1: Vehicle & Car ===");

        Vehicle vehicle = new Vehicle("Generic", 2020);
        Car car = new Car("Toyota", 2022, 4);

        System.out.println(vehicle.start());
        System.out.println(car.start());
        System.out.println(car.honk());
        System.out.println(car.getCarInfo());
    }
}