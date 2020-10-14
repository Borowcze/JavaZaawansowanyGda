package Day2.Library;

public class Wydawnictwo {

    private final String nazwa;
    private final String adres;

    public Wydawnictwo(String nazwa, String adres){
        this.nazwa = nazwa;
        this.adres = adres;
    }

    public String pobierzNazwe() {
        return nazwa;
    }
}
