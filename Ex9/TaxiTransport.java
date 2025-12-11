package Ex9;

class TaxiTransport extends Transport {
    TaxiTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculate_fare() {
        return 20 + distance * 5;
    }
}

