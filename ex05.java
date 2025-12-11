public class ex05 {

    static class LibraryItem {
        protected String _title;
        protected String _id;

        public LibraryItem(String title, String id) {
            this._title = title;
            this._id = id;
        }

        public void displayInfo() {
            System.out.println("Library Item: Title: " + _title + ", ID: " + _id);
        }
    }

    static class Book extends LibraryItem {
        public Book(String title, String id) {
            super(title, id);
        }

        @Override
        public void displayInfo() {
            System.out.println("BOOK: Title: " + _title + " (ID: " + _id + ")"); 
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Exercise 5: Using Protected Members (Library Resources) ---");

        Book myBook = new Book("The Java Programming Guide", "B-001");
        myBook.displayInfo(); 
    }
}