import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class LibraryItem {

    protected int id;
    protected String title;

    protected boolean isBorrowed = false;
    protected LocalDate borrowDate;
    protected LocalDate returnDate;

    protected final int borrowDuration = 4;
    protected final  double  penaltyPerDay = 2.0;

    public LibraryItem(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public void borrow() {
        if (isBorrowed) {
            System.out.println(title + " is already borrowed.");
        }
        isBorrowed = true;
        borrowDate = LocalDate.now();
        System.out.println(title + " borrowed on " + borrowDate);
    }

    public double returnItem() {
        if (!isBorrowed) {
            System.out.println(title + " was never borrowed.");
            return 0;
        }

        returnDate = LocalDate.now();
        isBorrowed = false;

        long daysHeld = ChronoUnit.DAYS.between(borrowDate, returnDate);
        long lateDays = daysHeld - borrowDuration;


        double penalty;
        if (lateDays > 0) {
            penalty = lateDays * penaltyPerDay;
        } else {
            penalty = 0;
        }

        System.out.println(title + " returned on " + returnDate);
        System.out.println("Days borrowed: " + daysHeld);
        System.out.println("Penalty: $" + penalty);

        return penalty;
    }

    public abstract void printInfo();
}
