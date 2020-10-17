package Day1.heritage.work;

public class Manager extends Employee {

    private double bonus;
    private Manager[] groupMembers = new Manager[5];

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override //przesłaniamy
    public double getSalary() {
        double salary = super.getSalary(); //brak bezpośredniego dostępu do salary
        return salary + bonus;
    }

    //całkowita zmiana metody nadklasy
    public boolean addGroupMembers(Manager manager) {
        for (int i = 0; i < groupMembers.length; i++) {
            if (groupMembers[i] == null) {
                groupMembers[i] = manager;
                return true;
            }
        }
        return false;
    }

    public final String getManagerNamer() {
        return "Manager " + getName();
    }

    // Sygnature się nie zmieniła tzn. nazwa metody oraz typ i liczba parametrów
    // Dopuszczalne jest użycie podtypu zwrotnego
    @Override
    public Manager[] getGroupMembers() {
        return groupMembers;
    }

}
