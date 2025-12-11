class LibraryItem {
    protected String _title;
    protected int _id;
    LibraryItem(String t, int i) {
        _title = t;
        _id = i;
    }
    void display_info() {
        System.out.println(_title + " (" + _id + ")");
    }
}

class Book extends LibraryItem {
    Book(String t, int i) {
        super(t, i);
    }
    void display_info() {
        System.out.println("Book: " + _title + " [" + _id + "]");
    }
}

public class ex5 {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", 101);
        b.display_info();
    }
}

