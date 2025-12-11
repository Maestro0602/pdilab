import java.util.ArrayList;
import java.util.List;

public class ex08 {

    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getInfo() {
            return "Product: " + name + ", Price: $" + price;
        }
    }

    static class Electronics extends Product {
        String warranty;

        public Electronics(String name, double price, String warranty) {
            super(name, price);
            this.warranty = warranty;
        }

        @Override
        public String getInfo() {
            return super.getInfo() + ", Warranty: " + warranty;
        }
    }

    static class Clothing extends Product {
        String size;

        public Clothing(String name, double price, String size) {
            super(name, price);
            this.size = size;
        }

        @Override
        public String getInfo() {
            return super.getInfo() + ", Size: " + size;
        }
    }

    static class Book extends Product {
        String author;

        public Book(String name, double price, String author) {
            super(name, price);
            this.author = author;
        }

        @Override
        public String getInfo() {
            return super.getInfo() + ", Author: " + author;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 8: Inheritance + Polymorphism (Product Catalog) ---");

        List<Product> catalog = new ArrayList<>();
        catalog.add(new Electronics("Laptop", 1200.00, "1 Year"));
        catalog.add(new Clothing("T-Shirt", 25.50, "L"));
        catalog.add(new Book("OOP Handbook", 45.00, "J. Smith"));

        for (Product item : catalog) {
            System.out.println(item.getInfo());
        }
    }
}