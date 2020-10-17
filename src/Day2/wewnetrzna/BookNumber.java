package Day2.wewnetrzna;

public abstract class BookNumber {

    private String number;

    protected BookNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return getNumberType() + ":" + number;
    }

    public abstract String getNumberType();

    public static void main(String[] args) {
        class BookNumberImpl extends BookNumber {

            protected BookNumberImpl(String number) {
                super(number);
            }

            @Override
            public String getNumberType() {
                return "ABCD";
            }
        }

        BookNumber bookNumber = new BookNumberImpl("1234-5678");
        bookNumber.getNumber();

        String typ = "aBCD";
        new BookNumber("3456-5678") {
            @Override
            public String getNumberType() {
                return typ;
            }
        }.getNumber();
    }

}