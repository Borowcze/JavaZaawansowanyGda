package Day1.Book;

public class Book {

    private final String title;
    private final BookNumber bookNumber;
    public BookNumber getBookNumber(){
        return bookNumber;
    }

//    public Day1.Book(String title, String bookNumber) {
//        this(title, new BookNumber(bookNumber));
//    }

    public Book(String title, BookNumber bookNumber) {
        this.title = title;
        this.bookNumber = bookNumber;
    }

    public String printInfo()
    {
        return title + " is title and SN is: " + bookNumber.getNumb();
    }

    public static void main(String[] args) {
        Book bookOne = new Book("Wiedźmin", new BookNumberISBN("1234-1245"));
        Book iss = new BookNumberISS("Clean code", new BookNumberISSN("XYZ"));


        BookNumber bookNumber2 = new BookNumber("7894-651") {
            @Override
            String getType() {
                return null;
            }
        };

        System.out.println(bookOne.printInfo());
        System.out.println(iss.printInfo());
        bookNumber2.getNumb();
        System.out.println(bookNumber2.getNumb());
    }
}
