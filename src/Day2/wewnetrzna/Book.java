package Day2.wewnetrzna;

import java.time.LocalDateTime;

public class Book {

    private BookNumber bookNumber;
    private String title;
    private LocalDateTime date = LocalDateTime.now();

    public Book(String title, String bookNumber) {
        this.title = title;
        this.bookNumber = this.new BookNumber(bookNumber);
//        this.bookNumber = new BookNumber(bookNumber); //też działa
    }

    public String getTitle() {
        return title;
    }

    public BookNumber getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(BookNumber bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getNumber() {
        return bookNumber.number; //bezpośredni dostęp
    }

    public void printInfo() {
        System.out.println(title + " " + bookNumber);
    }

    public class BookNumber {

        private final String number;

        protected BookNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public LocalDateTime createdAt() {
            return date; //bezpośredni dostęp
        }

    }


}
