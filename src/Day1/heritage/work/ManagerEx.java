package Day1.heritage.work;

public class ManagerEx {

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Grzegorz", 50_000);
        employees[1] = new Employee("Michał", 20_000);
        Manager manager = new Manager("Kacper", 100_000); //to też Employee
        manager.setBonus(1_000);
        employees[2] = manager;

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }

    }

}
