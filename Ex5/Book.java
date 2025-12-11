package Ex5;

public class Book extends LibraryItem {
    private String author;

    Book(String title, String id, String author){
        super(title,id);
        this.author = author;
    }

    @Override
    public void display_info(){
        System.out.println("Title: "+title+
                            "\nID: "+id +
                            "\nAuthor: "+ author);
    }
}

