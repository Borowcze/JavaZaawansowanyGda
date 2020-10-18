package Day3.interfejs.bookNumber;

public class BookNumberExe {

    public static void main(String[] args) throws CloneNotSupportedException{
        BookNumber bookNumber = new BookNumber("1234-5678");
        BookNumber klon2 = bookNumber.clone();

        System.out.println(bookNumber == klon2);
    }
}
