public class Main {

    public static void main(String[] args) {


        Library lib = new Library(10);
//        LibraryItem book = new Book(1 ," me " , "cumblater");

        lib.addItem( new Book(1, "Dune", "Frank Herbert"));
        lib.addItem(new Book(2, "1984", "George Orwell"));
        lib.addItem(new Book(3, "The Hobbit", "J.R.R. Tolkien"));
//        lib.listItems();
//        System.out.println(lib.getItemById(2));  lib.getItemById(2);
lib.borrowById(1);
lib.returnById(1);
lib.listItems();
//     book.borrow();
//     book.returnItem();

    }
}
