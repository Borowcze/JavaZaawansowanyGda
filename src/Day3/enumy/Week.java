package Day3.enumy;

/**
 * Klasa mająca 7 egzemplarzy.
 * Brak możliwości tworzenia nowych
 */
public enum Week { //extends Enum

    PONIEDZIALEK("Pon"),
    WTOREK("Wt"),
    SRODA("Sr"),
    CZWARTEK("Czw"),
    PIATEK("Pt"),
    SOBOTA("Sob") {
        @Override
        public String pobierzSkrot() {
            return "Nd";
        }
    },
    NIEDZIELA("Nd");

    private final String skrot;

    Week(String skrot) {
        this.skrot = skrot;
    }

    public String pobierzSkrot() {
        return skrot;
    }

    public static void main(String[] args) {
        System.out.println(Week.SOBOTA.pobierzSkrot());
        Week week = Week.SOBOTA;
        switch (week) {
            case PONIEDZIALEK:
            case WTOREK:
            case SRODA:
            case CZWARTEK:
            case PIATEK:
                System.out.println("Pracujemy");
                break;
            case SOBOTA:
            case NIEDZIELA:
                System.out.println("Odpoczywamy");
                break;
            default:
                System.out.println("Nieznany parametr");
                break;
        }
    }

}
