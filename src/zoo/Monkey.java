package zoo;

public class Monkey extends Mammal{

    public Monkey(){
        super("ssaak", "małpa");
    }

    @Override
    public void giveSound(){
        System.out.println("uaaaa");
    }
}
