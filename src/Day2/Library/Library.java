package Day2.Library;

public class Library {
    public static void main(String[] args) {
        Autor autor = new Autor("X", "Y");
        Autor autor2 = new Autor("X2", "Y2");
        Wydawnictwo wydawnictwo = new Wydawnictwo("XYZ", "ul.QWERTY");
        Wydawnictwo wydawnictwo2 = new Wydawnictwo("XYZ2", "ul.QWERTY2");

        Ksiazka ksiazka = new Ksiazka("ABC", wydawnictwo, "1234-5678", autor, autor2);

        ksiazka.wypisz();
    }
}
