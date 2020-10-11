package Book;

public class BookNumberISS extends Book {
    public BookNumberISS(String title, BookNumber bookNumber) {
        super(title, bookNumber);
    }

    public String printInfo(){
        return super.printInfo() + " serial ISS 111";
    }
}
