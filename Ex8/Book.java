package Ex8;

class Book extends Product {
    String author;

    Book(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public void get_info() {
        System.out.println("Book: " + name + ", Price: $" + price +
                           ", Author: " + author);
    }
}
