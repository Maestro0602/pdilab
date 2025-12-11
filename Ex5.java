class LibraryItem {
    protected String title;
    protected String id;

    public LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public String displayInfo() {
        return "ID: " + id + ", Title: " + title;
    }
}

class Book extends LibraryItem {
    private String author;

    public Book(String title, String id, String author) {
        super(title, id);
        this.author = author;
    }

    @Override
    public String displayInfo() {
        return "Book - " + title + " by " + author + " (ID: " + id + ")";
    }
}

class Magazine extends LibraryItem {
    private int issueNumber;

    public Magazine(String title, String id, int issueNumber) {
        super(title, id);
        this.issueNumber = issueNumber;
    }

    @Override
    public String displayInfo() {
        return "Magazine - " + title + ", Issue #" + issueNumber;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("\n=== Exercise 5: Protected Members ===");

        Book book = new Book("Java Programming", "B001", "James Gosling");
        Magazine magazine = new Magazine("Tech Today", "M001", 42);

        System.out.println(book.displayInfo());
        System.out.println(magazine.displayInfo());
        System.out.println("\nAccessing protected attribute: " + book.title);
    }
}
