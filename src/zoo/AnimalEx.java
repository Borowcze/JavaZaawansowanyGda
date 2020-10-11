package zoo;

public class AnimalEx {

    public static void main(String[] args) {
        Animal animal = new Elephant();
        animal.giveSound();

        Animal elephant = new Elephant();
        Monkey monkey = (Monkey) elephant;
        monkey.giveSound();

    }
}
