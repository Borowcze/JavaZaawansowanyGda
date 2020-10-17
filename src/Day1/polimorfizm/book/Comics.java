package Day1.polimorfizm.book;

public class Comics extends Book {

    private final int album;

    public Comics(String title, String bookNumber, int album) {
        super(title, new BookNumberISBN(bookNumber));
        this.album = album;
    }

    @Override
    public void printInfo() {
        System.out.print("Komiks: ");
        super.printInfo();
    }

    public int getAlbum() {
        return album;
    }

}
