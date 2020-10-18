package Day3.wyjatki;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.regex.Pattern;

public class BookNumberISSN extends BookNumber {

    public static final String NUMBER_TYPE = "ISSN";
    private static final Pattern pattern = Pattern.compile("\\d{4}-\\d{4}");

    public BookNumberISSN(String number) {
        super(pattern.matcher(number));
    }

    @Override
    public String getNumber() throws FileNotFoundException { //podklasa IOException
        try {
            return super.getNumber();
        } catch (IOException e) {
            throw new FileNotFoundException("Book has no SerialNumber");
        }
    }

    @Override
    public String getNumberType() {
        return NUMBER_TYPE;
    }

}
