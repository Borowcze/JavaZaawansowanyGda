package Day3.wyjatki;

import java.io.IOException;

public class BookNumberNotFoundException extends IOException {

    //dymyślny
    public BookNumberNotFoundException() {}

    //oraz pobierający komunikat
    public BookNumberNotFoundException(String message) {
        super(message);
    }

}

