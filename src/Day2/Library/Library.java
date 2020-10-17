package Day2.Library;

public class Library {
    public static void main(String[] args) {
        Autor autor = new Autor("X", "Y");
        Autor autor2 = new Autor("X2", "Y2");
        Autor autor3 = new Autor("Justyna", "Sosnowska");
        Wydawnictwo wydawnictwo = new Wydawnictwo("XYZ", "ul.QWERTY");
        Wydawnictwo wydawnictwo2 = new Wydawnictwo("XYZ2", "ul.QWERTY2");
        Wydawnictwo wydawnictwo3 = new Wydawnictwo("Przechlewo", "ul.Jankowo");

        Ksiazka ksiazka = new Ksiazka("ABC", wydawnictwo, "1234-5678", autor, autor2);
        ksiazka.wypisz();
        ksiazka = new Ksiazka("Kotki kotki", wydawnictwo3, " 7717-7854", autor3);
        ksiazka.wypisz();


    }
}
