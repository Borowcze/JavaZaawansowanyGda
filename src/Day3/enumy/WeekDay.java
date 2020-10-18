package Day3.enumy;

/**
 * Klasa mająca 7 egzemplarzy.
 * Brak możliwości tworzenia nowych
 */
public enum WeekDay {


    PONIEDZIALEK(1),

    WTOREK(2),

    SRODA(3),

    CZWARTEK(4),

    PIATEK(5),

    SOBOTA(6) {
        @Override
        public void hello() {
            System.out.println("Hello you!");
        }
    },

    NIEDZIELA(7);

    private final int day;


    //brak modyfikatora dostępu
    WeekDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void hello() {
        System.out.println("Hello World!");
    }

    public static void main(String[] args) {
        System.out.println(WeekDay.CZWARTEK.toString());
        WeekDay weekDay = WeekDay.valueOf("PIATEK"); //(WeekNum) Enum.valueOf(WeekNum.class, "PIATEK");
        weekDay.hello();
        System.out.println(weekDay.toString());
        System.out.println();
        for (WeekDay week : WeekDay.values()) {
            System.out.println(week.toString());
        }
        System.out.println();
        System.out.println(WeekDay.PONIEDZIALEK.ordinal()); //położenie
        System.out.println();
        WeekDay.SOBOTA.hello();
    }
}


