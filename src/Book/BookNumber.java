package Book;

public abstract class BookNumber {

    private final String number;

    public BookNumber (String number){
        this.number = number;
    }
    public String getNumb() {
        return getType() + " " + number;
    }
//    public static BookNumber create(String number){
//        return new BookNumber(number);
//    }
//    public static void main(String[] args) {
//        BookNumber.create("1234");
//        BookNumber bookNumber = new BookNumber("1234");
//        System.out.println(bookNumber.getNumb());
//        System.out.println(BookNumber.create("1123").getNumb());
//    }

    public void printInfo(String message){
        System.out.println(getType() + " and " + number);
    }

    abstract String getType();
}