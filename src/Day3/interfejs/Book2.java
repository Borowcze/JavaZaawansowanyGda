package Day3.interfejs;

public class Book2 implements TitleAndLength {

    private final  String serialNumber;
    private final String title;
    private long pages;

    public Book2(String serialNumber, String title){
        this.serialNumber = serialNumber;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public long getLength(){
        return pages;
    }

    @Override
    public void setLength(long length) {
        this.pages = length;
    }


    public void printInfo(){
        System.out.println(serialNumber);
    }

    public static void printTitle(Title title){
        System.out.println(title.getTitle());
    }

    public static void printLength(Length length, long l){
        length.setLength(l);
        System.out.println(length.getLength());
    }

    public static void main(String[] args) {
        TitleAndLength book2 = new Book2("1234-5678", "tytul ksiazki");
        TitleAndLength movie = new Movie("tytul filmu");

//        System.out.println(book2.getTitle());
//        System.out.println(movie.getTitle());

        printTitle(book2);
        printTitle(movie);

        printLength(book2, 100);
        printLength(movie, 100);

    }
}