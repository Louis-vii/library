public class Book extends LibraryItem {

    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;


        this.borrowDuration = 14;
        this.penaltyPerDay = 0.50;
    }

    @Override
    public void printInfo() {
        System.out.println("Book: " + title + " by " + author + " (ID: " + id + ")");
    }
}
