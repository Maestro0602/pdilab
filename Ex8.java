class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getInfo() {
        return String.format("%s: $%.2f", name, price);
    }

    public double calculateDiscount(double discountPercent) {
        return price * (1 - discountPercent / 100);
    }
}

class Electronics extends Product {
    private int warrantyMonths;

    public Electronics(String name, double price, int warrantyMonths) {
        super(name, price);
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public String getInfo() {
        return String.format("%s: $%.2f, Warranty: %d months",
                name, price, warrantyMonths);
    }
}

class Clothing extends Product {
    private String size;

    public Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public String getInfo() {
        return String.format("%s: $%.2f, Size: %s", name, price, size);
    }
}

class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public String getInfo() {
        return String.format("'%s' by %s: $%.2f", name, author, price);
    }
}

public class Ex8 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 8: E-commerce Product Catalog ===");

        Product[] products = {
                new Electronics("Laptop", 999.99, 24),
                new Clothing("T-Shirt", 29.99, "L"),
                new BookProduct("Java Programming", 49.99, "James Gosling"),
                new Electronics("Smartphone", 699.99, 12),
                new Clothing("Jeans", 59.99, "M")
        };

        System.out.println("Product Catalog:");
        for (int i = 0; i < products.length; i++) {
            System.out.printf("%d. %s%n", i + 1, products[i].getInfo());
            System.out.printf("   After 10%% discount: $%.2f%n%n",
                    products[i].calculateDiscount(10));
        }
    }
}
