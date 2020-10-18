package Day3.wyjatki.firstExe;

public class NamesExe {
    public static void main(String[] args) {
        Name name = new Name("Wojtek");

        try {
            name.isNameInArray();
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        }
    }
}
