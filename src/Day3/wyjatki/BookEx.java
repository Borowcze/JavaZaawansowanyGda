package Day3.wyjatki;

import java.io.IOException;

public class BookEx {
    public static void main(String[] args) {
        BookNumber bookNumber = new BookNumberISSN("1234-5678");
        bookNumber.nullBookNumber();
//        try {
//
//        } catch(IOException e) {
//            e.printStackTrace();
//        }

        System.out.println("To zostanie wypisane tylko jezeli wyjatek zostanie przechwycony");
    }
}