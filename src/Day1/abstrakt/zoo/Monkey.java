package Day1.abstrakt.zoo;

public class Monkey extends Mammal{

    public Monkey(){
        super( "małpa");
    }

    @Override
    public void giveSound(){
        System.out.println("uaaaa");
    }
}
