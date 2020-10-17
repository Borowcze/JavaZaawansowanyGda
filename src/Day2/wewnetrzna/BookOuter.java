package Day2.wewnetrzna;

public class BookOuter {

    private final String title;
    private BookNumberInner bookNumber;

    public BookOuter(String title) {
        this.title = title;
    }

    public void setBookNumber(BookNumberInner bookNumber) {
        this.bookNumber = bookNumber;
    }

    public class BookNumberInner {
        private final String serialNumber;

        public BookNumberInner(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public void wypisz() {
            System.out.println("S/N: " + serialNumber + ", tytuł: " + title);
        }
    }

    public static class BookNumberInnerStatic {
        private final String serialNumber;
        private final BookOuter bookOuter;

        public BookNumberInnerStatic(String serialNumber, BookOuter bookOuter) {
            this.serialNumber = serialNumber;
            this.bookOuter = bookOuter;
        }

        public void wypisz() {
            System.out.println("S/N: " + serialNumber + ", tytuł: " + bookOuter.title);
        }
    }

    public static void main(String[] args) {
        BookOuter book = new BookOuter("Tytul ksiazki");
        BookNumberInner bookNumber = book.new BookNumberInner("1234-5678");
        book.setBookNumber(bookNumber);
        bookNumber.wypisz();

        BookNumberInnerStatic bookNumberInnerStatic = new BookNumberInnerStatic("ABC", book);
        bookNumberInnerStatic.wypisz();
    }

}
