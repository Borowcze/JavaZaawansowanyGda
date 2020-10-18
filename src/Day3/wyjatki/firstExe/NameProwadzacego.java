package Day3.wyjatki.firstExe;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class NameProwadzacego {

    /*
     * 1)
     * Stwórzcie program, który sprawdza czy podane imię znajduje się w tablicy imion.
     * Jeżeli się znajduje to wypisuje komunikat, że rekord znaleziono.
     * W innym przypadku rzuca wyjątek IllegalArgumentException
     * 2)
     * Przechwyć wyjątek z punktu 1-go
     */

    public static void main(String[] args) throws FileNotFoundException {
        String[] names = {"Michał", "Mariusz", "Dariusz"};
        String name = "Marek";

        try {
            isNameInArray(name, names);
        } catch (IllegalArgumentException | NameNotFoundException ex) {
            System.err.println("Nie znaleziono " + name + " w tablicy " + Arrays.toString(names));
        }
        finally {
            System.out.println("Szukano imienia " + name);
        }
    }

    public static boolean isNameInArray(String name, String[] nameList) throws IllegalArgumentException,NameNotFoundException {
        for (String n : nameList) {
            if (name.equals(n)) {
                return true;
            }
        }
        throw new NameNotFoundException("Nie znaleziono imienia");
    }

    private static class NameNotFoundException extends IOException {
        public NameNotFoundException(){
            super();
        }
        public NameNotFoundException(String message){
            super(message);
        }
    }

}

