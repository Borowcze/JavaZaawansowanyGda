package Day3.interfejs.bookNumber;

import Day3.interfejs.Book;

public class BookNumber implements Cloneable{

    private final String serialNumber;

    public BookNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public BookNumber clone() throws CloneNotSupportedException{
        return (BookNumber) super.clone();
    }
}
