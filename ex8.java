class Product {
    String name;
    double price;
    Product(String n, double p) {
        name = n;
        price = p;
    }
    String get_info() {
        return name + " - " + price;
    }
}

class Electronics extends Product {
    int warranty;
    Electronics(String n, double p, int w) {
        super(n, p);
        warranty = w;
    }
    String get_info() {
        return name + " - " + price + " - " + warranty + " months warranty";
    }
}

class Clothing extends Product {
    String size;
    Clothing(String n, double p, String s) {
        super(n, p);
        size = s;
    }
    String get_info() {
        return name + " - " + price + " - size " + size;
    }
}

class BookP extends Product {
    String author;
    BookP(String n, double p, String a) {
        super(n, p);
        author = a;
    }
    String get_info() {
        return name + " - " + price + " - by " + author;
    }
}

public class ex8 {
    public static void main(String[] args) {
        Product[] catalog = {
            new Electronics("Laptop", 1200, 24),
            new Clothing("T-Shirt", 20, "L"),
            new BookP("Java Programming", 35, "John Doe")
        };

        for (Product p : catalog) {
            System.out.println(p.get_info());
        }
    }
}
