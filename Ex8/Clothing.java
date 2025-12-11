package Ex8;

class Clothing extends Product {
    String size;

    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void get_info() {
        System.out.println("Clothing: " + name + ", Price: $" + price +
                           ", Size: " + size);
    }
}
