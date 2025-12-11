package Ex8;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Polymorphic method
    public void get_info() {
        System.out.println("Product: " + name + ", Price: $" + price);
    }
} 

