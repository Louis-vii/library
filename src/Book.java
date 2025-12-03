public class Book extends LibraryItem {

    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
        
    }

    @Override
    public void printInfo() {
        System.out.println("Book: " + title + " by " + author + " (ID: " + id + ")");
    }
}
