package Day1.polimorfizm.book;

class Book {

    private final BookNumber bookNumber;
    private final String title;

    protected Book(String title, BookNumber bookNumber) {
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
        System.out.println(String.format("tytul - \"%s\", S/N: %s", title, bookNumber.getNumber()));
    }

}
