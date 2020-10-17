package Day1.polimorfizm.book;

public class Magazine extends Book {

    private final int edition;
    private final int year;

    public Magazine(String title, String bookNumber, int edition, int year) {
        super(title, new BookNumberISSN(bookNumber));
        this.edition = edition;
        this.year = year;
    }

}
