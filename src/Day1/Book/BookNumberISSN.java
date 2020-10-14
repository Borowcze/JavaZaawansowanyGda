package Day1.Book;

public class  BookNumberISSN extends  BookNumber{

    public BookNumberISSN(String number) {
        super(number);
    }

    @Override
    public String getType() {
        return "ISSN";
    }
}
