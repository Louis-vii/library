import java.util.ArrayList;

public class Library implements Manage {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<LibraryItem>();
    }

    public void listItems() {
        for (LibraryItem item : items)
            item.printInfo();
    }

    @Override
    public void addItem(LibraryItem item) {

        items.add(item);
        System.out.println(item.title + "has been added to library ");
    }

    @Override
    public LibraryItem findById(int id) {
        for (LibraryItem item : items)
            if (item.id == id) {
                return item;
            }
        System.out.println("item not found");

        return null;
    }

    @Override
    public LibraryItem findByTitle(String title) {
        for (LibraryItem item : items)
            if (item.title.equalsIgnoreCase(title)) {
                return item;

            }
        System.out.println("item not found");
        return null;
    }

    @Override
    public void borrowById(int id) {
        LibraryItem item = findById(id);
        if (item != null) {
            item.borrow();

        }

    }

    @Override
    public void borrowByTitle(String title) {
        LibraryItem item = findByTitle(title);
        if (item != null) {
            item.borrow();
        }
    }

    @Override
    public void returnById(int id) {
        LibraryItem item = findById(id);
        if (item != null) {
            item.returnItem();
        }
    }

    @Override
    public void returnByTitle(String title) {
        LibraryItem item = findByTitle(title);
        if (item != null) {
            item.returnItem();
        }
    }
}


