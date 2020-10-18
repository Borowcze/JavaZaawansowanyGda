package Day3.interfejs;

public interface Length {

//    public static final
    long DEFAULT_LENGTH = 0;

    default long getLength(){
        return DEFAULT_LENGTH;
    }

    void setLength(long length);
}
