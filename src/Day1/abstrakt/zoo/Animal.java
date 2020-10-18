package Day1.abstrakt.zoo;

public abstract class Animal {

    private String animalClass;
    private String name;

    public Animal(String animalClass, String name) {
        this.animalClass = animalClass;
        this.name = name;
    }

    public abstract void giveSound();

    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Elephant();
        animals[1] = new Monkey();

        for(Animal animal : animals){
            animal.giveSound();
        }
    }
}
