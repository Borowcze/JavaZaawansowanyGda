package Day1.heritage.work;

public class EmployeeEx {

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new Employee("Grzegorz", 50_000);
        employees[1] = new Employee("Michał", 20_000);

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getSalary());
        }
    }

}
