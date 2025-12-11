package Ex9;

class MetroTransport extends Transport {
    MetroTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculate_fare() {
        return 10 + distance * 2;
    }
}
