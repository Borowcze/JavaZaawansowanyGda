package Day3.interfejs;

public interface Ibook {

    default String getTitle(){
        return "default";
    }
}
