package zoo;

public class Elephant extends Mammal {

    public Elephant() {
        super("ssak", "Słoń");
    }

    @Override
    public void giveSound() {
        System.out.println("Tereeeee");
    }
}
