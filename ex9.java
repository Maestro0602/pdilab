abstract class Transport {
    double distance;

    Transport(double d) {
        distance = d;
    }

    abstract double calculate_fare();

    void display_fare() {
        String type = this.getClass().getSimpleName(); // Auto get class name
        System.out.println(type + " Fare for " + distance + " km: $" + calculate_fare());
    }
}

class BusTransport extends Transport {
    BusTransport(double d) {
        super(d);
    }

    @Override
    double calculate_fare() {
        return distance * 1.5;
    }
}

class MetroTransport extends Transport {
    MetroTransport(double d) {
        super(d);
    }

    @Override
    double calculate_fare() {
        return 10 + distance * 2;
    }
}

class TaxiTransport extends Transport {
    TaxiTransport(double d) {
        super(d);
    }

    @Override
    double calculate_fare() {
        return 20 + distance * 5;
    }
}

public class ex9 {
    public static void main(String[] args) {
        Transport[] rides = {
            new BusTransport(10),
            new MetroTransport(5),
            new TaxiTransport(8)
        };

        for (Transport t : rides) {
            t.display_fare();
        }
    }
}
