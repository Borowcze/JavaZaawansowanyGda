package Day3.wyjatki;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

public class BookNumberISBN extends BookNumber {

    public static final String NUMBER_TYPE = "ISBN";
    private static final Pattern pattern = Pattern.compile("97\\d-\\d-\\d{2}-\\d{6}-\\d");

    public BookNumberISBN(String number) throws IllegalArgumentException {
        super(pattern.matcher(number));
    }

    @Override
    public String getNumber() throws BookNumberNotFoundException { //podklasa IOException
        try {
            return super.getNumber();
        } catch (IOException e) {
            throw new BookNumberNotFoundException("Book has no SerialNumber");
        }
    }

    @Override
    public String getNumberType() {
        return NUMBER_TYPE;
    }

}
