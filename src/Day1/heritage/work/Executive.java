package Day1.heritage.work;

public final class Executive extends Manager {

    public static final int EXECUTIVE_EXTRA_BONUS = 55;

    private final int bonus;

    public Executive(String name, double salary) {
        this(name, salary, EXECUTIVE_EXTRA_BONUS);
    }

    public Executive(String name, double salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}
