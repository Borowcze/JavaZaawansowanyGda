package Day3.wyjatki;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BookEx4 {

    public static void main(String[] args) {
        try {
            BookNumber bookNumber = new BookNumberISSN("1234-5678");
            bookNumber.nullBookNumber();
            System.out.println(bookNumber.getNumber());
        } catch (BookNumberNotFoundException | FileNotFoundException e) { //żaden nie jest podklasą drugiego
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("To i tak zostanie wypisane");
        }

        System.out.println("To zostanie wypisane tylko jeżeli wyjątek zostanie przechwycony");
    }

}