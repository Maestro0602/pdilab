class vehicle{
    String brand;
    int year;

    vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }
    void start(){
        System.out.println(brand+" "+year+" "+"is starting");
    }
}
class car extends vehicle{
   int door;

    car(String brand, int year, int door) {
        super(brand, year);
        this.door = door;
    }
    void honk() {
        System.out.println("Beep beep!");
    }
}

public class Main {
    public static void main(String[] args) {
        vehicle v = new vehicle("GTR Skyline R35", 2007);
        v.start();

        car c = new car("Nissan", 2007, 2);
        c.start();
        c.honk(); 
        System.out.println("Doors: " + c.door);
    }
}