package Ex8;

class Electronics extends Product {
    int warranty;   

    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    @Override
    public void get_info() {
        System.out.println("Electronics: " + name + ", Price: $" + price +
                           ", Warranty: " + warranty + " years");
    }
}
