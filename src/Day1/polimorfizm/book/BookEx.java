package Day1.polimorfizm.book;

public class BookEx {

    public static void main(String[] args) {
        Book b1 = new Comics("Zginelo w morzu", "1234-5678", 12);

        b1.getBookNumber().getNumberType();
        b1.printInfo();

        Book b2 = new Lecture("Kaczor", "1234-1848", true);
        b2.printInfo();


    }
}
