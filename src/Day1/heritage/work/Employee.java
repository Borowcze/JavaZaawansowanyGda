package Day1.heritage.work; //nie może kolidować z nazwą klasy

import java.time.LocalDate;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDate;
    private Employee[] groupMembers = new Employee[10];

    public Employee(String name, double salary) {
        this(name, salary, LocalDate.now());
    }

    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(float percent) {
        salary += (salary * percent / 100);
    }

    public boolean addGroupMembers(Employee employee) {
        for (int i = 0; i < groupMembers.length; i++) {
            if (groupMembers[i] == null) {
                groupMembers[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee[] getGroupMembers() {
        return groupMembers;
    }

}
