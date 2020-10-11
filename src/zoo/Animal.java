package zoo;

public abstract class Animal {

    private String animalClass;
    private String name;

    public Animal(String animalClass, String name) {
        this.animalClass = animalClass;
        this.name = name;
    }

    public abstract void giveSound();
}
