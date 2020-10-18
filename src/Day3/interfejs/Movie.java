package Day3.interfejs;

public class Movie implements TitleAndLength{

    private final String title;
    private long length;

    public Movie(String title){
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public long getLength(){
        return length;
    }

    @Override
    public void setLength(long length){
        this.length = length;
    }
}