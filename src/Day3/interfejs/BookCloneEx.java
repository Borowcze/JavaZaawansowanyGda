package Day3.interfejs;

public class BookCloneEx {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book book = new Book("abc", "xyz");
        Book klon = book.colne();

        System.out.println(book == klon);
    }
}
