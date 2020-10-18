package Day3.wyjatki;

import java.io.IOException;
import java.util.regex.Matcher;

public abstract class BookNumber {

    private String number;

    protected BookNumber(Matcher matcher) { //nie (trzeba) deklarujemy takich wyjątków
        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid ISxx number");
        }
        this.number = matcher.group();
    }

    public String getNumber() throws IOException { //trzeba
        if (number == null) {
            throw new IOException("Book has not SerialNumber");
        }
        return getNumberType() + ":" + number;
    }

    //on purpose of this presentation
    public void nullBookNumber() {
        this.number = null;
    }

    public abstract String getNumberType();

}
