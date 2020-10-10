import java.util.Random;

public class Employee {

    private static int nextId = 1;

    private final int id;
    private final String name;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(100_000);
    }

    public Employee(String name) {
        id = nextId;
        nextId++;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static int getNextId(){
        return nextId;
    }
}
