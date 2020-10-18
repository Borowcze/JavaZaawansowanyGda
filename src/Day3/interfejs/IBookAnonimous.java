package Day3.interfejs;

public class IBookAnonimous implements Ibook {

    public static void main(String[] args) {

        Ibook ibook = new Ibook() {};

        System.out.println(ibook.getTitle());

//      2 sposób
        System.out.println(new Ibook() {
        }.getTitle());
    }
}
