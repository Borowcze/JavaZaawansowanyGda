package Day1.heritage.book;

public class Magazine extends Book {

    private final int edition;
    private final int year;

    public Magazine(String title, String bookNumber, Author author, int edition, int year) {
        super(title, bookNumber);
        this.edition = edition;
        this.year = year;
    }

}
