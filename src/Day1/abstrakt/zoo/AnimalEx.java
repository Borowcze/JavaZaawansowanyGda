package Day1.abstrakt.zoo;

public class AnimalEx {

    public static void main(String[] args) {
        Animal animal = new Elephant();
        animal.giveSound();

        animal = new Monkey();
        animal.giveSound();

        Animal elephant = new Elephant();
//        Monkey monkey = (Monkey) elephant;
//        monkey.giveSound();

        animal = new Cat();
        animal.giveSound();

    }
}
