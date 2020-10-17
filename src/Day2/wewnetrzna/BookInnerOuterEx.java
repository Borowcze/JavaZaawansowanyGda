package Day2.wewnetrzna;

/**
 * Przykład dostępu z klasy outer do inner i klasy inner do outer
 */
public class BookInnerOuterEx {

    public static void main(String[] args) {
        Book book = new Book("asdf", "1234-5678");
        System.out.println(book.getBookNumber().createdAt());
        System.out.println(book.getNumber());

        Book.BookNumber bookNumber = book.new BookNumber("9876-4321");
        book.setBookNumber(bookNumber);
        System.out.println(book.getBookNumber().createdAt());
        System.out.println(book.getNumber());
    }

}
