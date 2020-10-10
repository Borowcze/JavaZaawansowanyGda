public class BookNumber {
    private final String number;

    public static void main(String[] args) {

        new BookNumber("12351");
        BookNumber bookNumber = new BookNumber("123");
        System.out.println(bookNumber.getBookSerialNumber());
        bookNumber.getBookSerialNumber();
        create("1234125");
        System.out.println(create("1234125"));
    }

    public BookNumber(String number) {
        this.number = number;
    }

    public String getBookSerialNumber() {
        return number;
    }

    public static BookNumber create(String number) {
        return new BookNumber(number);
    }
}