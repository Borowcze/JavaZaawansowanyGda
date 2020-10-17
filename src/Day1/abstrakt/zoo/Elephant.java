package Day1.abstrakt.zoo;

public class Elephant extends Mammal {

    public Elephant() {
        super( "Słoń");
    }

    @Override
    public void giveSound() {
        System.out.println("Tereeeee");
    }
}
