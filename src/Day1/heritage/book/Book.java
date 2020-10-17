package Day1.heritage.book;

class Book {

    private final BookNumber bookNumber;
    private final String title;

    public Book(String title, String bookNumber) {
        this(title, new BookNumber(bookNumber));
    }

    private Book(String title, BookNumber bookNumber) {
        this.title = title;
        this.bookNumber = bookNumber;
    }

    public String getTitle() {
        return title;
    }

    public BookNumber getBookNumber() {
        return bookNumber;
    }

    public void printInfo() {
        System.out.printf("Ksiazka: tytul - \"%s\", S/N: %s", title, bookNumber.getNumber());
    }

}
