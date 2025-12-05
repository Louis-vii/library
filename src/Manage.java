public interface Manage {
    void addItem(LibraryItem item);

    LibraryItem findById(int id);

    LibraryItem findByTitle(String title);

    void borrowByTitle(String title);

    void returnByTitle(String title);

    void borrowById(int id);

    void returnById(int id);
}
