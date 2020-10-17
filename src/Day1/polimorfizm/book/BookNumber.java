package Day1.polimorfizm.book;

public abstract class BookNumber {

    private final String number;

    public BookNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return getNumberType() + ":" + number;
    }

    public abstract String getNumberType();

}
