package Day1.statically;

public class EmployeeCounterEx {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Justyna");
        employees[1] = new Employee("Adam");
        employees[2] = new Employee("Filemon");

        for(Employee employee : employees){
            System.out.println("[" + employee.getId() + "] " + employee.getName());
        }

        System.out.println("Następny identyfikator: " + Employee.getNextId());


        System.out.println(employees[2].getName() + ": name, id: " + employees[2].getId());

    }
}
