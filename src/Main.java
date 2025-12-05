public class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addItem(new Book(1, "Dune", "Frank Herbert"));

        lib.addItem(new Book(2, "1984", "George Orwell"));
        lib.addItem(new Book(3, "The Hobbit", "J.R.R. Tolkien"));
        lib.borrowByTitle("the hobbit");
    }
}
