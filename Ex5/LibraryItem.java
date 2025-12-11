package Ex5;

public class LibraryItem {
    protected String title;
    protected String id;

    LibraryItem(String title, String id){
        this.title = title;
        this.id = id;
    }
    
    public void display_info(){
        System.out.println("Title: "+title+
        "\nID: "+id);
    }
}
