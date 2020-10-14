package Day2.Library;

public class Ksiazka {

    private final String tytul;
    private final Autor[] autor;
    private final Wydawnictwo wydawnictwo;
    private final NumerSeryjny numerSeryjny;


    public Ksiazka(String tytul, Wydawnictwo wydawnictwo, String sn, Autor... autor){
        this.tytul = tytul;
        this.autor = autor;
        for(Autor a : autor){
            a.dodajKsiazke(this);
        }
        this.wydawnictwo = wydawnictwo;
        this.numerSeryjny = new NumerSeryjny(sn);
    }

    public void wypisz(){
        String autorzy = "";
        for (Autor a : autor) {
            autorzy += a.pobierzPelneNazwisko();
            autorzy += ", ";
        }
        System.out.println("tytul "+ tytul + ", autor: " + autorzy +
                ", wydawnictwo: " + wydawnictwo.pobierzNazwe());
    }
}
