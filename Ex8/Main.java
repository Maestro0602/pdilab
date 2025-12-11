package Ex8;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

 
        products.add(new Electronics("Laptop", 1200.99, 2));
        products.add(new Clothing("T-Shirt", 19.99, "L"));
        products.add(new Book("Clean Code", 34.50, "Robert C. Martin"));

        for (Product p : products) {
            p.get_info();  
        }
    }
}
