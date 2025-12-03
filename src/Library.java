public class Library {

    private LibraryItem[] items;
    private static int count = 0;

    public Library(int size) {
        items = new LibraryItem[size];
    }

    public void addItem(LibraryItem item) {
        if (count >= items.length) {
            System.out.println("Library full can't add more items.");
            return;
        }
        items[count++] = item;
        System.out.println(item.title + " added to the library.");
    }

//    public LibraryItem getItemById(int id) {
//        for (int i = 0; i < count; i++) {
//            if (items[i].id == id) {
//
//                return items[i];
//            }
//        }
//        System.out.println("Item not found.");
//        return null;
//    }
    public void borrowById(int id) {
        for (int i = 0; i < count; i++) {
            if (items[i].id == id) {
                items[i].borrow();
                return;
            }
        }
        System.out.println("Item not found.");
    }
    public void returnById(int id) {
        for (int i = 0; i < count; i++) {
            if (items[i].id == id) {
                items[i].returnItem();
                return;
            }
        }
        System.out.println("Item not found.");
    }

    public void listItems() {
        System.out.println("\n-- Library Items --");
        for (int i = 0; i < count; i++) {
            items[i].printInfo();
        }
    }
}
