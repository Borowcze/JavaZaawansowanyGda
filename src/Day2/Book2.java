package Day2;
// klasa nie static przykład wykorzystania
public class Book2 {

    private final String title;
    private BookNumber serialNumber;

    private Book2(String title){
        this.title = title;
    }

    private void setBookNumber(BookNumber serialNumber){
        this.serialNumber = serialNumber;
    }

    private class BookNumber{
        private final String serialNumber;

        private BookNumber(String serialNumber){
            this.serialNumber = serialNumber;
        }
        private void printInfo(){
            System.out.println("Title is: " + title + " ,and the SN is: " + serialNumber);
        }
    }

    public static void main(String[] args) {
        Book2 firstBook = new Book2("Wiedźmin");
        BookNumber bookNumber = firstBook.new BookNumber("1234-5678");
        firstBook.setBookNumber(bookNumber);
        bookNumber.printInfo();
    }
}