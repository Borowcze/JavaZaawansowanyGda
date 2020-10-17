package Day1.statically;

public class Counter {

    private static int counter = 0;
    private String name;

    public Counter(){
        counter++;
        System.out.println(Counter.getCounter());
    }

    public static int getCounter(){
        return counter;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Counter();
        }

        System.out.println(Counter.getCounter());
    }
}
