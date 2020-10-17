package Day1.heritage.book;

public class Lecture extends Book {

    private final boolean required;

    public Lecture(String title, String bookNumber, Author author, boolean required) {
        super(title, bookNumber);
        this.required = required;
    }

}
