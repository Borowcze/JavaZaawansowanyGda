package Day1.polimorfizm.book;

public class BookNumberISBN extends BookNumber {

    public BookNumberISBN(String number) {
        super(number);
    }

    @Override
    public String getNumber() {
        return super.getNumber() + " overridden";
    }

    @Override
    public String getNumberType() {
        return "ISBN";
    }

}
