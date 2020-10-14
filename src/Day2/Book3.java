package Day2;
// klasa static - jak stosować
public class Book3 {
    private final String title;
    private final String author;

    public Book3(String title, String author){
        this.title = title;
        this.author = author;
    }
    private String getTitle(){
        return title;
    }
    private String getAuthor(){
        return author;
    }


    private static class BookNumberInner {
        private String serialNumber;

        private BookNumberInner(String serialNumber){
            this.serialNumber = serialNumber;
        }

        private void printInfo(Book3 book){
            System.out.println("Title is: " + book.title + " ,and the SN is: " + serialNumber);
        }
    }

    public static void main(String[] args) {
        Book3 firstBook = new Book3("Wiedźmin","Sapkowski");
        BookNumberInner bookNumberInner = new BookNumberInner("1234-5678");
        bookNumberInner.printInfo(firstBook);
    }
}