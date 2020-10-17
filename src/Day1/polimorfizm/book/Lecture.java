package Day1.polimorfizm.book;

public class Lecture extends Book {

    private final boolean required;

    public Lecture(String title, String bookNumber, boolean required) {
        super(title, new BookNumberISSN(bookNumber));
        this.required = required;
    }

}
