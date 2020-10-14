package Day2.Library;

public class Autor {

    public final static int LICZBA_KSIAZEK = 10;

    private final String imie;
    private final String nazwisko;
    private final Ksiazka[] ksiazki;
    private int counter;

    public Autor(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.ksiazki = new Ksiazka[LICZBA_KSIAZEK];
    }

    public String pobierzPelneNazwisko() {
        return imie + " " + nazwisko;
    }

    public boolean dodajKsiazke(Ksiazka ksiazka) {
        if(counter < ksiazki.length){
            ksiazki[counter] = ksiazka;
            counter++;
            return true;
        }
        return false;
    }

    public boolean dodajKsiazkaWSposobWolny(Ksiazka ksiazka){
        for (int i = 0; i < ksiazki.length; i++){
            if(ksiazki[i] != null){
                ksiazki[i] = ksiazka;
                return true;
            }
        }
        return false;
    }

    public Ksiazka[] pobierzKsiazki(){
        return ksiazki;
    }
}
