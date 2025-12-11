package Ex9;

abstract class Transport {
    double distance;

    Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculate_fare();

    public void display_fare() {
        System.out.println("Fare: " + calculate_fare());
    }
}




