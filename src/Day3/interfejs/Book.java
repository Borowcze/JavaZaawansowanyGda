package Day3.interfejs;

import java.util.Date;

public class Book implements Title, Cloneable, Feedback {

    private String bookNumber;
    private String title;
    private Date date = new Date();

    public Book(String title, String bookNumber){
        this.title = title;
        this.bookNumber = bookNumber;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getBookNumber(){
        return bookNumber;
    }

    public void printInfo(){
        System.out.println(title + " " + bookNumber);
    }

    public Book colne() throws CloneNotSupportedException {
        Book book = (Book) super.clone();
        book.date = (Date) this.date.clone();
        return book;
    }

    @Override
    public void call(){
        printInfo();
    }

}
