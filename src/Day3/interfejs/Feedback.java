package Day3.interfejs;

/**
 * Przykład sprzeżenia zwrotnego
 */

public interface Feedback {

    int a = 10;

//    musi być default aby móc wywołać
    default void call(){
        System.out.println("abc");
    }
}
