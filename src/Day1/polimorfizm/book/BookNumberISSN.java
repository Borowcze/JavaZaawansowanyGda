package Day1.polimorfizm.book;

public class BookNumberISSN extends BookNumber {

    public BookNumberISSN(String number) {
        super(number);
    }

    @Override
    public String getNumberType() {
        return "ISSN";
    }

}
