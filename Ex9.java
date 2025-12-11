abstract class Transport {
    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();

    public String displayFare() {
        return String.format("%s: Distance %.1fkm → Fare: $%.2f",
                this.getClass().getSimpleName(), distance, calculateFare());
    }
}

class BusTransport extends Transport {
    public BusTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 1.5;
    }
}

class MetroTransport extends Transport {
    public MetroTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return 10 + (distance * 2);
    }
}

class TaxiTransport extends Transport {
    public TaxiTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return 20 + (distance * 5);
    }
}

public class Ex9 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 9: Transportation System ===");

        Transport[] transports = {
                new BusTransport(5),
                new MetroTransport(10),
                new TaxiTransport(3),
                new BusTransport(15),
                new MetroTransport(8)
        };

        System.out.println("Transport Fares:");
        for (Transport transport : transports) {
            System.out.println(transport.displayFare());
        }

        double totalFare = 0;
        for (Transport transport : transports) {
            totalFare += transport.calculateFare();
        }

        System.out.printf("%nTotal fare for all transports: $%.2f%n", totalFare);
    }
}
