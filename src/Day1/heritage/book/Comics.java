package Day1.heritage.book;

public class Comics extends Book {

    public Comics(String title, String bookNumber) {
        super(title, bookNumber);
    }

    @Override
    public void printInfo() {
        System.out.printf("Komiks: tytul - \"%s\", S/N: %s", getTitle(), getBookNumber().getNumber());
    }
}
