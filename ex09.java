import java.util.ArrayList;
import java.util.List;

public class ex09 {

    static abstract class Transport {
        protected double distance;

        public Transport(double distance) {
            this.distance = distance;
        }

        public abstract double calculateFare();

        public void displayFare() {
            System.out.printf("%s Fare for %.1f km: $%.2f%n", 
                              this.getClass().getSimpleName(), distance, calculateFare());
        }
    }

    static class BusTransport extends Transport {
        public BusTransport(double distance) {
            super(distance);
        }

        @Override
        public double calculateFare() {
            return distance * 1.5;
        }
    }

    static class MetroTransport extends Transport {
        public MetroTransport(double distance) {
            super(distance);
        }

        @Override
        public double calculateFare() {
            return 10.0 + (distance * 2.0);
        }
    }

    static class TaxiTransport extends Transport {
        public TaxiTransport(double distance) {
            super(distance);
        }

        @Override
        public double calculateFare() {
            return 20.0 + (distance * 5.0);
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 9: Advanced Real-World Project (Transportation System) ---");

        List<Transport> journeys = new ArrayList<>();
        journeys.add(new BusTransport(5.0));
        journeys.add(new MetroTransport(12.0));
        journeys.add(new TaxiTransport(3.5));

        for (Transport journey : journeys) {
            journey.displayFare();
        }
    }
}