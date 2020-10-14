package Day1.Book;

public class BookNumberISBN extends BookNumber{

    public BookNumberISBN(String number) {
        super(number);
    }

    @Override
    public String getType() {
        return "ISBN";
    }


}
