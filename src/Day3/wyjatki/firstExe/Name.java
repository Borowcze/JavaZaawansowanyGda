package Day3.wyjatki.firstExe;

public class Name {

    private String name;
    private String[] namesArray = {"Justyna", "Karol", "Adam", "Karolina", "Olaf"};

    public Name(String name) {
        this.name = name;
    }

    public boolean isNameInArray() {

        for (String text : namesArray) {
            if (text.equals(name)) {
                return true;
            }
        }
        throw new IllegalArgumentException("Name not found in array");
    }
}
