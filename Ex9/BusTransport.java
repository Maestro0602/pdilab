package Ex9;

class BusTransport extends Transport {
    BusTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculate_fare() {
        return distance * 1.5;
    }
}